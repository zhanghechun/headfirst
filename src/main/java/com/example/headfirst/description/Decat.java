package com.example.headfirst.description;

/**
 * create by Administrator : zhanghechun on 2020/3/25
 */
public class Decat extends Beverage {
    @Override
    public double cost() {
        return 1.05;
    }

    public Decat() {
        description="Decat";
    }
}
