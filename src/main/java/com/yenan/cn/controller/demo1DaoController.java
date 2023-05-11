package com.yenan.cn.controller;

import com.sun.net.httpserver.HttpsServer;
import com.yenan.cn.domain.User;
import com.yenan.cn.server.Demo1TestService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/demo1")
public class demo1DaoController {
    @Resource
    private Demo1TestService demo1TestService;

    @RequestMapping("/demo1test")
    public User userInfo(HttpServletSession servletSession){
//        servletSession.
//        User user = demo1TestService.findUserInfo();
        User user =new User();
        return user;
    }
}
