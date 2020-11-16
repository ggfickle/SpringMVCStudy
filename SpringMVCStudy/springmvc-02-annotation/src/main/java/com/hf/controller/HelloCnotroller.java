package com.hf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloCnotroller {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello Springmvc");
        return "hello";
    }

}
