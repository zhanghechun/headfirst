package com.example.headfirst.description;

/**
 * create by Administrator : zhanghechun on 2020/3/25
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return .15+beverage.cost();
    }
}
