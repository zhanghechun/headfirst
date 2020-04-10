package com.example.headfirst.collection;

import com.example.headfirst.collection.parttwo.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items.size()<=position||items.get(position)==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem) items.get(position);
        position++;
        return item;
    }
}
