package com.example.headfirst.strategrypattern;

/**
 * create by Administrator : zhanghechun on 2020/3/22
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
