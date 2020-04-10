package com.example.headfirst.factory;

import java.util.ArrayList;

/**
 * create by Administrator : zhanghechun on 2020/3/26
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();
    void prepare(){
        System.out.println("Preparing"+name);
        System.out.println("tossing dough");
        System.out.println("adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" "+toppings.get(i));
        }
    };
    void bake(){
        System.out.println("bake for 25 minutes at 350");
    };
    void cut(){
        System.out.println("cutting the pizza into diagonal slices");
    };
    void box(){
        System.out.println("place pizza in official pizzaStore  box");
    };
    public String getName(){
        return name;
    }
}
