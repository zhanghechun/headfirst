package com.example.headfirst.factory;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public abstract class PizzaStore {
    /*静态工厂
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
