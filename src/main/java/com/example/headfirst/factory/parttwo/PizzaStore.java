package com.example.headfirst.factory.parttwo;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public abstract class PizzaStore {
   /* public Pizza orderPizza(String type){
        Pizza pizza=null;
        pizza=createPizza(type);
        return pizza;
    }
*/
    protected abstract Pizza createPizza(String type);
}
