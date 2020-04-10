package com.example.headfirst.factory.parttwo;

/**
 * 原料接口，每个原料都都有一个方法创造出来
 * create by Administrator : zhanghechun on 2020/3/28
 */
public interface PizzaIngredientFactory {
    Dough creteDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
