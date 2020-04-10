package com.example.headfirst.collection;

import com.example.headfirst.collection.parttwo.MenuItem;

import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class DinerMenu {
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems=new MenuItem[MAX_ITEMS];
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("K7B'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menuItem = new MenuItem(s, s1, b, v);
       if (numberOfItems>=6){
           System.out.println("菜单满了");
       }else {
           menuItems[numberOfItems]=menuItem;
           numberOfItems++;
       }

    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}