package com.yenan.cn.dao;

import com.yenan.cn.domain.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Permission record);

    int insertSelective(Permission record);
}