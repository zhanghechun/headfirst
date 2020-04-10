package com.example.headfirst.factory;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else
        return null;
    }
}
