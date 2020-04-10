package com.example.headfirst.description;

/**
 * create by Administrator : zhanghechun on 2020/3/25
 */
public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso() {
        description="Espresso";
    }
}
