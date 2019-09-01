package com.wp.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   //表明这个类是一个bean注进来，同时也是一个controller
public class HelloCrotroller {

    @GetMapping("/helloworld")
    public String hello(@RequestParam(name = "name",defaultValue = "world") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
