package com.example.headfirst.designpattern;

/**
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("squeak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
