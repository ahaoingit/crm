package com.brainyi.mapper;

import com.brainyi.domain.Client;
import com.brainyi.domain.ClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientMapper {
    long countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExample(ClientExample example);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     *查询 所有的公海用户
     * @return
     */
    List<Client> selectAllClientOfPublic();
    /**
     * 通过userId 查询 此用户私海
     * @param userId
     * @return
     */
    List<Client> selectClientBySysUserId(@Param("userId") String userId);
}