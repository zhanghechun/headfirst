package com.example.headfirst.packaging;

/**
 * create by Administrator : zhanghechun on 2020/4/3
 */
public class Tea extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    void brew() {
        System.out.println("煮茶");
    }

}
