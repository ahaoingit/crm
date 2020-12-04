package com.brainyi.interceptor;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.brainyi.domain.Result;
import com.brainyi.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *鉴权拦截器
 * @author ahao 2020-12-02
 */
public class AuthuInterceptor extends HandlerInterceptorAdapter {
    private static List<String> releaseUrl = new ArrayList<>(16);
    @Autowired
    RedisTemplate redisTemplate;

    static {
        releaseUrl.add("/sysUsers/login");
        releaseUrl.add("/sysUsers/register");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        处理编码问题
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "text/html;charset=UTF-8");
//        处理登录与注册请求 直接放行 不做token的验证
        if (releaseUrl.contains(request.getRequestURI())) {
            return true;
        }
        String token = request.getHeader("Token");
//       登录请求放行 与 注册请求
        Result result = new Result();
//        验证控制  前端调到登录界面
        if (token == null) {
            result.setCode(Result.TOKENISNULL);
            result.setMessage("token 为空");
            response.getWriter().print(JSON.toJSONString(result));
            return false;
        }
        try {
            JWTUtils.verifyToken(token);
            Boolean aBoolean = redisTemplate.hasKey(token);
            if (aBoolean) {
                //redis存在此token 刷新他过期时间
                redisTemplate.expire(token, 30, TimeUnit.MINUTES);
            } else {
                result.setCode(Result.TOKENTIMEOUT);
                result.setMessage("会话已过期请重新登录");
                response.getWriter().print(JSON.toJSONString(result));
                return false;
            }
        } catch (JWTVerificationException jwtVerificationException) {
            result.setObj(Result.TOKENVERIFYFAILD);
            result.setMessage("token 违法");
            response.getWriter().print(JSON.toJSONString(result));
        }catch (Exception exception) {
            result.setObj(Result.TOKENVERIFYFAILD);
            result.setMessage("token 未知异常");
            response.getWriter().print(JSON.toJSONString(result));
        }
        return true;
    }
}
