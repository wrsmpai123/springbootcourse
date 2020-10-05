package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;
import java.util.Map;

/**
 * @author WR
 * @create 2020-10-04 19:48
 */
@Controller
public class HelloController {

//    @RequestMapping({"/","/login.html"})
//    public String index() {
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    //查出一些数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        //通过thymeleaf模板引擎，解析到浏览器
        //classpath:/templates/success.html
        return "success";
    }
}
