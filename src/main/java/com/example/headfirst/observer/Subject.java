package com.example.headfirst.observer;

import java.util.Observer;

/**
 * create by Administrator : zhanghechun on 2020/3/23
 */
public interface Subject {
    public void registerObserver(CurrentConditionsDisplay o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
