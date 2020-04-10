package com.example.headfirst.packaging;

/**
 * create by Administrator : zhanghechun on 2020/4/3
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    void brew() {
        System.out.println("煮咖啡");
    }
   /* void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("加糖和牛奶");
    }

    private void pourInCup() {
        System.out.println("倒进杯子");
    }

    private void brewCoffeeGrinds() {
        System.out.println("用沸水冲泡");
    }

    private void boilWater() {
        System.out.println("烧热水");
    }*/
}
