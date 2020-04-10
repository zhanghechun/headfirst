package com.example.headfirst.collection.parttwo;

/**
 * create by Administrator : zhanghechun on 2020/4/7
 */
public class MenuTestDriver {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pancake house menu", "breakfast");
        MenuComponent dinnerMenu = new Menu("diner menu", "lunch");
        MenuComponent cafeMenu = new Menu("cafe menu", "dinner");
        MenuComponent dessertMenu = new Menu("dessert", "dessert of course");

        MenuComponent allMenus = new Menu("all menus", "all menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        // 这里加菜单项

        dinnerMenu.add(new MenuItem("pasta", "spaghetti with Marinara", true, 3.89));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("apple pie","apple pie with a cust,topped with wanilla ice cream",false,1.58));


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
