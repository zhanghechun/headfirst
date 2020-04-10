package com.example.headfirst.collection.parttwo;

import java.util.Iterator;

/**
 * 对每个方法提供默认的实现
 * <p>
 * create by Administrator : zhanghechun on 2020/4/7
 */
public abstract class MenuComponent {
    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    String getName() {
        throw new UnsupportedOperationException();
    }

    String getDescription() {
        throw new UnsupportedOperationException();
    }

    double getPrice() {
        throw new UnsupportedOperationException();
    }

    boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }
    //闪回到迭代器
    Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
