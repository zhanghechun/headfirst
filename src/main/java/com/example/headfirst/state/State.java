package com.example.headfirst.state;

/**
 * create by Administrator : zhanghechun on 2020/4/8
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
