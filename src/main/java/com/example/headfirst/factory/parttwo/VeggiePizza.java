package com.example.headfirst.factory.parttwo;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
