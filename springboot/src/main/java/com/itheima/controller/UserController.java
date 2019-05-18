package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 11827
 * @date: 2019/5/18 04:48
 * @description:
 */
@Controller
@RequestMapping("/a")
public class UserController {
    @RequestMapping("/b")
    public @ResponseBody
    String find(){
        return "oe333333333ga";
    }
}
