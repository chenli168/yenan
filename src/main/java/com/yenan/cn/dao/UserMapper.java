package com.yenan.cn.dao;

import com.yenan.cn.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(@Param("userId")String userId);

    int insert(@Param("record")User record);

    int insertSelective(@Param("record")User record);

    User selectByPrimaryKey(@Param("userId") String userId);

    int updateByPrimaryKeySelective(@Param("record")User record);

    int updateByPrimaryKey(@Param("record")User record);
}