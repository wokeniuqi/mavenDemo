package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/4/16.
 */
@Controller
@RequestMapping("/helloController")
public class HelloController {

    @ResponseBody
    @RequestMapping(params = "getHello")
    public String getHello(){
        System.out.println("美国");
        return "index";
    }
}
