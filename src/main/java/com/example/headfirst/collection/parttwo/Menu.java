package com.example.headfirst.collection.parttwo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class Menu extends MenuComponent {
   ArrayList menuComponents=new ArrayList();
   String name;
   String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    void print() {
        System.out.print("\n"+getName());
        System.out.println(","+getDescription());
        System.out.println("--------------");
        /***
         * 修正print
         */
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent next = (MenuComponent) iterator.next();
            next.print();
        }
    }

    @Override
    Iterator createIterator() {
        return new NullIterator();
    }
}
