package com.springBootExample.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qmm on 17-7-20.
 */
@RestController
@EnableAutoConfiguration
public class     Example {

    //这里的注解RequestMapping表示访问路由
    @RequestMapping("/")
    String home() {

        return "Hello　ｂａｏｖｈｈ Minmin !";
    }

//    @RequestMapping("/hello/{myName}")
//    String index(@PathVariable String myName) {
//
//        return "Hello " + myName;
//    }
}
