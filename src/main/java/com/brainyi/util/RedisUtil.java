package com.brainyi.util;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

/**
 * TODO
 *redis 工具类
 * @author ahao 2020-12-01
 */
@Component
public class RedisUtil {
    private static Logger log = Logger.getLogger(RedisUtil.class);

    @Autowired
    private RedisTemplate redisTemplate;

    private static RedisUtil redisUtil;

    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    public void init() {
        redisUtil = this;
        redisUtil.redisTemplate = this.redisTemplate;
    }

    /**
     * key是否存在.
     *
     * @param key
     */
    public static boolean exists(final String key) {
        return redisUtil.redisTemplate.hasKey(key);
    }

    /**
     * 删除.
     *
     * @param key
     */
    public static void delete(final String key) {
        if (exists(key)) {
            redisUtil.redisTemplate.delete(key);
        }
    }

    /**
     * 缓存基本的对象，Integer、String、实体类等.
     *
     * @param key   缓存的键值
     * @param value 缓存的值
     * @return 缓存的对象
     */
    public static <T> ValueOperations<String, T> setCacheObject(String key, T value) {
        ValueOperations<String, T> operation = redisUtil.redisTemplate.opsForValue();
        operation.set(key, value);
        return operation;
    }

    /**
     * 获得缓存的基本对象.
     *
     * @param key 缓存键值
     * @return 缓存键值对应的数据
     */
    public static <T> T getCacheObject(String key/*,ValueOperations<String,T> operation*/) {
        ValueOperations<String, T> operation = redisUtil.redisTemplate.opsForValue();
        return operation.get(key);
    }

    /**
     * 缓存List数据.
     *
     * @param key      缓存的键值
     * @param dataList 待缓存的List数据
     * @return 缓存的对象
     */
    public static <T> ListOperations<String, T> setCacheList(String key, List<T> dataList) {
        ListOperations listOperation = redisUtil.redisTemplate.opsForList();
        if (null != dataList) {
            int size = dataList.size();
            for (int i = 0; i < size; i++) {
                listOperation.rightPush(key, dataList.get(i));
            }
        }
        return listOperation;
    }

    /**
     * 添加元素到list头.
     *
     * @param key
     * @param value
     */
    public static void addToCacheList(String key, Object value) {
        redisUtil.redisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 获得缓存的list对象.
     *
     * @param key 缓存的键值
     * @return 缓存键值对应的数据
     */
    public static <Object> List<Object> getCacheList(String key) {
        List<Object> dataList = new ArrayList<Object>();
        ListOperations<String, Object> listOperation = redisUtil.redisTemplate.opsForList();
        Long size = listOperation.size(key);
        for (int i = 0; i < size; i++) {
            dataList.add((Object) listOperation.index(key, i));// 取list值后不删除list
//            dataList.add((Object) listOperation.rightPop(key)); // 取list值后删除list
        }
        return dataList;
    }

    /**
     * 获得缓存的list对象.
     *
     * @param key 缓存的键值
     * @return 缓存键值对应的数据
     */
    public static Object getCache(String key) {
        ListOperations<String, Object> listOperation = redisUtil.redisTemplate.opsForList();
        Long size = listOperation.size(key);
        Object li = listOperation.rightPop(key); // 取值后删除
        return li;
    }

    /**
     * 缓存Set.
     *
     * @param key     缓存键值
     * @param dataSet 缓存的数据
     * @return 缓存数据的对象
     */
    public static <T> BoundSetOperations<String, T> setCacheSet(String key, Set<T> dataSet) {
        BoundSetOperations<String, T> setOperation = redisUtil.redisTemplate.boundSetOps(key);
      /*T[] t = (T[]) dataSet.toArray();
        setOperation.add(t);*/
        Iterator<T> it = dataSet.iterator();
        while (it.hasNext()) {
            setOperation.add(it.next());
        }

        return setOperation;
    }

    /**
     * 获得缓存的set.
     *
     * @param key
     * @return
     */
    public static Set<Object> getCacheSet(String key) {
        Set<Object> dataSet = new HashSet<Object>();
        BoundSetOperations<String, Object> operation = redisUtil.redisTemplate.boundSetOps(key);

        Long size = operation.size();
        for (int i = 0; i < size; i++) {
            dataSet.add(operation.pop());
        }
        return dataSet;
    }

    /**
     * 缓存Map.
     *
     * @param key
     * @param dataMap
     * @return
     */
    public static <T> HashOperations<String, String, T> setCacheMap(String key, Map<String, T> dataMap) {
        HashOperations hashOperations = redisUtil.redisTemplate.opsForHash();
        if (null != dataMap) {
            for (Map.Entry<String, T> entry : dataMap.entrySet()) {
                hashOperations.put(key, entry.getKey(), entry.getValue());
            }
        }
        return hashOperations;
    }

    /**
     * 添加元素到Map.
     *
     * @param key
     * @param value
     */
    public static void addCacheMap(String cacheKey, String key, Object value) {
        redisUtil.redisTemplate.opsForHash().put(cacheKey, key, value);
        //redisTemplate.expire(cacheKey, 1800, TimeUnit.SECONDS);
    }

    /**
     * 取出Map元素.
     *
     * @param cacheKey
     * @param key
     */
    public static Object getCacheMap(String cacheKey, String key) {
        Object cacheValue = null;
        if (cacheKey == null) {
            log.info("RedisUtil.getCacheMap -- Redis cacheKey is null");
        }
        if (key == null) {
            log.info("RedisUtil.getCacheMap -- Redis key is null");
        }
        if (exists(cacheKey)) {
            cacheValue = redisUtil.redisTemplate.opsForHash().get(cacheKey, key);
        } else {
            log.info("Redis cacheKey '" + cacheKey + "' not exist.");
        }
        return cacheValue;
    }

    /**
     * 获得缓存的Map.
     *
     * @param key
     * @return
     */
    public static <T> Map<String, T> getCacheMap(String key/*,HashOperations<String,String,T> hashOperation*/) {
        Map<String, T> map = redisUtil.redisTemplate.opsForHash().entries(key);
        /*Map<String, T> map = hashOperation.entries(key);*/
        return map;
    }


    /**
     * 缓存Map.
     *
     * @param key
     * @param dataMap
     * @return
     */
    public static <T> HashOperations<String, Integer, T> setCacheIntegerMap(String key, Map<Integer, T> dataMap) {
        HashOperations hashOperations = redisUtil.redisTemplate.opsForHash();
        if (null != dataMap) {
            for (Map.Entry<Integer, T> entry : dataMap.entrySet()) {
                /*System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); */
                hashOperations.put(key, entry.getKey(), entry.getValue());
            }
        }
        return hashOperations;
    }

    /**
     * 获得缓存的Map.
     *
     * @param key
     * @return
     */
    public static <T> Map<Integer, T> getCacheIntegerMap(String key/*,HashOperations<String,String,T> hashOperation*/) {
        Map<Integer, T> map = redisUtil.redisTemplate.opsForHash().entries(key);
        /*Map<String, T> map = hashOperation.entries(key);*/
        return map;
    }

    /**
     * 向redis中插入获取密码日志:leftPush 从链表头部压入.
     *
     * @param logContent 日志内容
     * @return
     */
    public static void addLogIntoRedis(final String logContent) {
        log.info("insert log into redis:" + logContent);
        try {
            redisUtil.redisTemplate.opsForList().leftPush("commonLogList", logContent);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public static <T> T execute(RedisScript<T> script, List keys, Object... args) {
        return (T) redisUtil.redisTemplate.execute(script, redisUtil.redisTemplate.getValueSerializer(), (RedisSerializer<T>) redisUtil.redisTemplate.getValueSerializer(), keys, args);
    }

    public <T> T execute(RedisScript<T> script, RedisSerializer<?> argsSerializer, RedisSerializer<T> resultSerializer, List<T> keys, Object... args) {
        return (T) redisUtil.redisTemplate.execute(script, argsSerializer, resultSerializer, keys, args);
    }
}
