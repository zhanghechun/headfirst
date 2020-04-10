package com.example.headfirst.collection;

import com.example.headfirst.collection.parttwo.MenuItem;

import java.util.ArrayList;

/**
 * create by Administrator : zhanghechun on 2020/4/4
 */
public class PrintMenu {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList menuItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] menuItems1 = dinerMenu.getMenuItems();

        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem= (MenuItem) menuItems.get(i);
            System.out.println(menuItem.getName()+" ");
            System.out.println(menuItem.getDescription()+" ");
            System.out.println(menuItem.getPrice()+" ");
            System.out.println(menuItem.getDescription());
        }
        for (int i = 0; i < menuItems1.length; i++) {
            MenuItem menuItem=menuItems1[i] ;
            System.out.println(menuItem.getName()+" ");
            System.out.println(menuItem.getDescription()+" ");
            System.out.println(menuItem.getPrice()+" ");
            System.out.println(menuItem.getDescription());
        }
    }

}
