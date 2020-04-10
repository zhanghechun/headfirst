package com.example.headfirst.designpattern;

/**
 * 策略模式
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("mallard duck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();

    }
}
