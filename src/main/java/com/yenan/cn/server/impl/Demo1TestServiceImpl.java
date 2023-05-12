package com.yenan.cn.server.impl;

import com.yenan.cn.dao.UserMapper;
import com.yenan.cn.domain.User;
import com.yenan.cn.server.Demo1TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("demo1TestService")
@Transactional
public class Demo1TestServiceImpl implements Demo1TestService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserInfo(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }
}
