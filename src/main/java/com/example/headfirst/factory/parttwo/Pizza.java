package com.example.headfirst.factory.parttwo;

import java.util.Arrays;

/**
 * create by Administrator : zhanghechun on 2020/3/28
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

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

    void setName(String name){
        this.name=name;
    };
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }


}
