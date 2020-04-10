package com.example.headfirst.designpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器模式
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class Flock implements Quackable {
    ArrayList  ducks=new ArrayList();

    void add(Quackable duck){
        ducks.add(duck);
    }
    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable quackable= (Quackable) iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("***"+ducks.size());
        Iterator iterator=ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck= (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
}
