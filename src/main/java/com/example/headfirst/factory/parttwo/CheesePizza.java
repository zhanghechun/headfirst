package com.example.headfirst.factory.parttwo;

/**
 * create by Administrator : zhanghechun on 2020/3/28
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing"+name);
        dough=pizzaIngredientFactory.creteDough();
        sauce=pizzaIngredientFactory.createSauce();
        cheese=pizzaIngredientFactory.createCheese();
    }
}
