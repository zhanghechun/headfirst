package com.example.headfirst.adapter;

/**
 * create by Administrator : zhanghechun on 2020/4/2
 */
public class WilTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("a short flying");
    }
}
