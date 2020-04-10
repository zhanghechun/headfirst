package com.example.headfirst.designpattern;

/**
 * 策略模式
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}