package com.example.headfirst.observer;

import com.example.headfirst.designpattern.QuackObservable;

/**
 * create by Administrator : zhanghechun on 2020/3/23
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);

    void update(QuackObservable duck);

}
