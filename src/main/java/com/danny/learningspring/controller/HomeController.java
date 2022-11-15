package com.danny.learningspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 스프링 부트가 제공하는 Welcome Page 기능
    // static/index.html
    @GetMapping("/")
    public String home() {
        return "home";
    }
}