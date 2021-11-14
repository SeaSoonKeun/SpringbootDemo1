package com.studentDemo.bean;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 2:51 下午
 * @Description: com.studentDemo.controller
 */
public class Student {
    private String name;
    private int age;
    private String phone;

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", phone='" + phone + '\'' +
//                '}';
        return (name + "\t" + age + "\t" + phone + "\r\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
