package com.example.headfirst.designpattern;

/**
 * create by Administrator : zhanghechun on 2020/4/10
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
