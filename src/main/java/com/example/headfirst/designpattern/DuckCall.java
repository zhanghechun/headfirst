package com.example.headfirst.designpattern;

/**
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("kwak");
    }
}
