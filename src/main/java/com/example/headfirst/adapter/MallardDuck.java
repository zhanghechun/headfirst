package com.example.headfirst.adapter;

/**
 * create by Administrator : zhanghechun on 2020/4/2
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
