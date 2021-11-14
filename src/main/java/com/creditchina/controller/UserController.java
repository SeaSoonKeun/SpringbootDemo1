package com.creditchina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 11:57 上午
 * @Description: com.creditchina.controller
 */
// 1. 表示这个类属于控制器，需要打注解
@RestController
public class UserController {
    // 2. 方法注解，表示浏览器的什么地址对应这个方法
    // 请求映射
    @RequestMapping("save")
    public void save(){
        System.out.println("调用了save方法");
    }
    @RequestMapping("update")
    public String update(){
        System.out.println("调用了update方法");
        return "成功执行了update";
    }
}
