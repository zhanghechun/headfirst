package com.example.headfirst.collection.parttwo;

import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/7
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
