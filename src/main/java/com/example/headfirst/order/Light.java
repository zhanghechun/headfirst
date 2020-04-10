package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/30
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public Light() {
    }

    void on(){
        System.out.println("开灯"+name);
    }

    void off(){
        System.out.println("关灯"+name);
    }
}
