package com.day03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Auther: xucg
 * @Date: 2021/11/14 - 11 - 14 - 5:18 下午
 * @Description: com.day03.controller
 */
@RestController
public class SessionController {
    @RequestMapping("session")
    public void testSession(HttpServletRequest request){
        // 要获取session需要借助request对象，session其实就是内存中的一块区域
        HttpSession session = request.getSession();
        // 获取sessionId
        String id = session.getId();
        System.out.println("SessionId:" + id);
        // 存值
        session.setAttribute("address","china");
        // 取值
        System.out.println("address1:" + session.getAttribute("address"));
        // 移除值
        session.removeAttribute("address");
        System.out.println("address2:" + session.getAttribute("address"));
        // 释放内存空间,销毁会话内部空间，session对象还是在的
        session.setAttribute("address","china");
        session.invalidate();
        System.out.println("SessionId:" + id);
        // 会报错，里面的内存空间已经没有了
        System.out.println("address1:" + session.getAttribute("address"));
    }
}
