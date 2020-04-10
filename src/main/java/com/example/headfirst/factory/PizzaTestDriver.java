package com.example.headfirst.factory;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("ethan ordered a "+pizza.getName()+"\n");
        pizza = nyStore.orderPizza("cheese");
        System.out.println("ethan ordered a "+pizza.getName()+"\n");
        
    }
}
