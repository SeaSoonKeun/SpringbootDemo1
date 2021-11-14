package com.day2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 7:41 下午
 * @Description: com.day2.controller
 */
@RestController
public class DemoController {
    @RequestMapping("doGet")
    public String doGet(String username, String password){

        System.out.println(username + "\t" + password);
        return ("doGet success");
    }

    @RequestMapping("doPost")
    public String doPost(String username, String password){
        System.out.println(username + "\t" + password);
        return ("doGet success");
    }
}
