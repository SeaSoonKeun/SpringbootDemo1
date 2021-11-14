package com.day03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: xucg
 * @Date: 2021/11/14 - 11 - 14 - 4:00 下午
 * @Description: com.day03.controller
 */
@RestController
public class CookieDemo {
    @RequestMapping("cookie")
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie("name", "xcg");
        // 时长设置
        cookie.setMaxAge(60 * 60 * 12);
        // 跨域设置
        cookie.setDomain(".7years.cn");
        response.addCookie(cookie);
        // 返回的是数组
        Cookie[] cookies = request.getCookies();
        // 不能直接遍历！因为第一次没有cookie，先需要判空
        if (cookies != null){
            for (Cookie cookie1 : cookies) {
                String cookie1Name = cookie1.getName();
//                System.out.println(cookie1Name + " " + cookieValue);
                if (cookie1Name.equals("last")){
//                    System.out.println(cookieValue);
                    response.getWriter().write("上次登陆时间" + cookie.getValue());
                }
            }
        }


            response.getWriter().write("success");
        System.out.println("test cookie success");
    }
}
