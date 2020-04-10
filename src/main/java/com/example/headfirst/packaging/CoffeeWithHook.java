package com.example.headfirst.packaging;

import java.util.Scanner;

/**
 * create by Administrator : zhanghechun on 2020/4/3
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    void brew() {
        System.out.println("煮咖啡");
    }
    /***
     * hook
     */
    public boolean customerWantsCondiments(){
        String answer=getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }


    private String getUserInput() {
        String answer="n";
        System.out.println("想不想加辅料：y/n");
        Scanner scanner = new Scanner(System.in);
        answer=scanner.next();
        return answer;
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
