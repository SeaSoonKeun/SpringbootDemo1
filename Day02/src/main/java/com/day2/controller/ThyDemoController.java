package com.day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @Auther: xucg
 * @Date: 2021/11/14 - 11 - 14 - 1:10 下午
 * @Description: com.day2.controller
 */
@Controller
public class ThyDemoController {
    @RequestMapping("thy")
    public String thy(String username, String password, Model model){
        System.out.println(username + ":" + password);
        model.addAttribute("username", username);
        return "index";
    }
}
