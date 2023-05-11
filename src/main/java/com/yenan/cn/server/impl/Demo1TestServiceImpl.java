package com.yenan.cn.server.impl;

import com.yenan.cn.domain.User;
import com.yenan.cn.server.Demo1TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("demo1TestService")
@Transactional
public class Demo1TestServiceImpl implements Demo1TestService {
    @Override
    public User findUserInfo() {
        return null;
    }
}
