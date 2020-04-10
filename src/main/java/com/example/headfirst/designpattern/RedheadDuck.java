package com.example.headfirst.designpattern;

/**
 * 策略模式
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
