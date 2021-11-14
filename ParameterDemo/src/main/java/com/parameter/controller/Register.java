package com.parameter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 2:38 下午
 * @Description: com.parameter.controller
 */
@RestController
public class Register {
    @RequestMapping("register")
    public void register(String username, String password){
        System.out.println(username + password);
    }

    @RequestMapping("register01")
    public void register(User user){
        System.out.println(user);
    }
}
