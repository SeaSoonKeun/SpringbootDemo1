package com.day2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 9:01 下午
 * @Description: com.day2.controller
 */
@RestController
public class RequestResponseController {
    @RequestMapping("Request")
    public String requestDemo(HttpServletRequest request){
        System.out.println(request.getParameter("username"));
        System.out.println(request.getHeader("age"));
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String nextElement = headerNames.nextElement();
            System.out.println(nextElement + ":" + request.getHeader(nextElement));
        }
        return "request success";
    }

    @RequestMapping("Response")
    public void responseDemo(HttpServletResponse response) throws IOException {
        // 不设置字符，中文会有乱码
        // 设置中文编码
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("芜湖-666");
//        return "response success";
    }
}
