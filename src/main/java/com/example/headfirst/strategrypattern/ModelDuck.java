package com.example.headfirst.strategrypattern;

/**
 * create by Administrator : zhanghechun on 2020/3/22
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior=new Quack();

    }
    public void display(){
        System.out.println("i'm a model duck");
    }
}
