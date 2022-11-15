package com.danny.learningspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// HTTP의 BODY에 문자 내용을 직접 반환, viewResolver대신 HttpMessageConverter가 동작
@RestController
public class HelloRestController {

    // @ResponseBody
    @GetMapping("hello-string")
    public String helloString(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    // @ResponseBody
    @GetMapping("hello-api")
    public HelloController.Hello helloApi(@RequestParam("name") String name) {
        HelloController.Hello hello = new HelloController.Hello();
        hello.setName(name);
        return hello;
    }

}
