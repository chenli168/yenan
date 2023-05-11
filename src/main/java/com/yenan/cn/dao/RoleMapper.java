package com.yenan.cn.dao;

import com.yenan.cn.domain.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}