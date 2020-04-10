package com.example.headfirst.designpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器模式
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class Flock implements Quackable {
    ArrayList quacks=new ArrayList();
    void add(Quackable quack){
        quacks.add(quack);
    }
    @Override
    public void quack() {
        Iterator iterator = quacks.iterator();
        while (iterator.hasNext()){
            Quackable quackable= (Quackable) iterator.next();
            quackable.quack();
        }
    }
}
