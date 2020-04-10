package com.example.headfirst.factory.parttwo;

/**
 * create by Administrator : zhanghechun on 2020/3/28
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza=new CheesePizza(factory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (type.equals("veggie")){
            pizza=new VeggiePizza(factory);
        }
        return pizza;
    }
}
