package com.hf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    @RequestMapping("/loginIndex")
    public String toLoginIndex(){
        return "loginIndex";
    }

    //登陆提交
    @RequestMapping("/login")
    public String login(String username, String pwd, HttpSession session) {
        System.out.println("Get Username:" + username);
        if ("admin".equals(username) && "123456".equals(pwd)) {
            session.setAttribute("user", username);
            return "success";
        }
        return "login";
    }

    //退出登陆
    @RequestMapping("/logout")
    public String logout() {
        return "login";
    }

    //跳转到登陆页面
    @RequestMapping("/jumplogin")
    public String jumpLogin() throws Exception {
        return "login";
    }

    //跳转到成功页面
    @RequestMapping("/jumpSuccess")
    public String jumpSuccess() throws Exception {
        return "success";
    }

}