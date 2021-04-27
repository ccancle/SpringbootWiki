package com.macchac.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caipengbo
 * @email 821161464@qq.com
 * @Description TODO
 * @createTime 2021年04月27日 15:13:00
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name ){
        return "Hello World! POST :"+name;
    }
}
