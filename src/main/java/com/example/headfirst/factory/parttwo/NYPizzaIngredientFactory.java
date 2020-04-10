package com.example.headfirst.factory.parttwo;

/**
 * create by Administrator : zhanghechun on 2020/3/28
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough creteDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[]={new Garlic(),new Onion(),new Mushroom(),new ResPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
