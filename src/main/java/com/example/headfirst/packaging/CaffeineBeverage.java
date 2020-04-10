package com.example.headfirst.packaging;

/**
 * create by Administrator : zhanghechun on 2020/4/3
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    private void pourInCup() {
        System.out.println("倒进杯子");
    }

    abstract void brew();

    private void boilWater() {
        System.out.println("烧热水");
    }
}
