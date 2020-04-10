package com.example.headfirst.collection;

import com.example.headfirst.collection.parttwo.MenuItem;

import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    /***
     * 使用固定长度数组，会调用remove()，将后面的元素向前移位
     */
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("you can't remove an item until you've done at least one next()");
        }
        if (items[position-1]!=null){
            for (int i = position-1; i <(items.length-1) ; i++) {
                items[i]=items[i+1];
            }
        }
        items[items.length-1]=null;
    }
}
