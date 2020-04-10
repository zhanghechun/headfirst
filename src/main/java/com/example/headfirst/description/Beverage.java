package com.example.headfirst.description;

/**
 * create by Administrator : zhanghechun on 2020/3/24
 */
public abstract  class Beverage {
    String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
