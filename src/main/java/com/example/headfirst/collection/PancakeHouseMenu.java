package com.example.headfirst.collection;

import com.example.headfirst.collection.parttwo.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems=new ArrayList();
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);

    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menuItem = new MenuItem(s, s1, b, v);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
