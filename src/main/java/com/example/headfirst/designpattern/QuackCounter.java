package com.example.headfirst.designpattern;

/**
 * 装饰者模式
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        //System.out.println("counter :"+ duck.getClass().getName());
    }
    public static int getQuacks(){
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
duck.notifyObservers();
    }
}
