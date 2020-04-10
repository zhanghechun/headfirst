package com.example.headfirst.strategrypattern;

/**
 * create by Administrator : zhanghechun on 2020/3/22
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
