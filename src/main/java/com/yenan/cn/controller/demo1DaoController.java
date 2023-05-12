package com.yenan.cn.controller;


import com.yenan.cn.domain.User;
import com.yenan.cn.server.Demo1TestService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/demo1")
public class demo1DaoController {
    @Resource
    private Demo1TestService demo1TestService;

    @RequestMapping("/demo1test")
    public String userInfo(Model model , String userId, String userPassword){
        User user = demo1TestService.findUserInfo(userId);
        model.addAttribute("userName",user.getUserName());
       //System.out.println(userId+user.getUserName()+user.getUserAge()+user.getUserPhoneNumber());
        model.addAttribute("userAge",user.getUserAge());
        model.addAttribute("userPhoneNumber",user.getUserPhoneNumber());
        return "/login";
    }
}
