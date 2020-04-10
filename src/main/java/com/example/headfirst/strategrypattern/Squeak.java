package com.example.headfirst.strategrypattern;

/**
 * create by Administrator : zhanghechun on 2020/3/22
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
