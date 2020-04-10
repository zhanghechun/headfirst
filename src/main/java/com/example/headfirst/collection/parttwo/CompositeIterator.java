package com.example.headfirst.collection.parttwo;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器
 * create by Administrator : zhanghechun on 2020/4/7
 */
public class CompositeIterator implements Iterator  {
    Stack stack=new Stack();

    public CompositeIterator(Iterable iterable) {
        stack.push(iterable);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }else {
            Iterator iterator= (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator= (Iterator) stack.peek();
            MenuComponent component= (MenuComponent) iterator.next();
            if (component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
