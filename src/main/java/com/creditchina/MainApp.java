package com.creditchina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 11:26 上午
 * @Description: com.creditchina
 */
@SpringBootApplication
public class MainApp {
    private  static final String TAG = "MainApp";
    // 背后是启动了tomcat
    public static void main(String[] args) {
        // 让项目运行起来
        SpringApplication.run(MainApp.class, args);
    }
}
