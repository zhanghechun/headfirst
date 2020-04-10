package com.example.headfirst.designpattern;

/**
 * 抽象工厂
 * create by Administrator : zhanghechun on 2020/4/10
 */
public abstract class AbstractDuckFactory {
    abstract Quackable createMallardDuck();
    abstract Quackable createRedHeadDuck();
    abstract Quackable createDuckCall();
    abstract Quackable createRubberDuck();
}
