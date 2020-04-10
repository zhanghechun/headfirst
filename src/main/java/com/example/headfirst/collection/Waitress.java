package com.example.headfirst.collection;

import com.example.headfirst.collection.parttwo.Menu;
import com.example.headfirst.collection.parttwo.MenuItem;

import java.util.Iterator;

/**
 * 迭代器
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu(){
       /* Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("menu\n---\nbreakfast");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nlunch");
        printMenu(dinerMenuIterator);*/
    }
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem= (MenuItem) iterator.next();
            System.out.println(menuItem.getName()+" ");
            System.out.println(menuItem.getDescription()+"");
            System.out.println(menuItem.getPrice()+"");

        }
    }
}
