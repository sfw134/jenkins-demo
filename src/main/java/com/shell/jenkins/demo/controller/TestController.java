package com.shell.jenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author SFW
 * @Description TODO
 * @Date 2021/11/5 11:41
 * @Version 1.0
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Hello, world!";
    }
}
