package com.example.headfirst.factory;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut pizza");
    }

    @Override
    public void box() {
        System.out.println("box pizza");
    }


}
