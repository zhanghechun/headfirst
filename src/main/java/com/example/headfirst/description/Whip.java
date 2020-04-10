package com.example.headfirst.description;

/**
 * create by Administrator : zhanghechun on 2020/3/25
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return 0.10+beverage.cost();
    }
}
