package com.example.headfirst.collection.parttwo;

import java.util.Iterator;

/**
 * create by Administrator : zhanghechun on 2020/4/7
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    void printMenu(){
        allMenus.print();
    }
    public void printVegetarianMenu(){
        Iterator iterator=allMenus.createIterator();
        System.out.println("vegetarian menu");
        while (iterator.hasNext()){
            MenuComponent menuComponent= (MenuComponent) iterator.next();
            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }
}
