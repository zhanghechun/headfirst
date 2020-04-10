package com.example.headfirst.adapter;

/**
 * create by Administrator : zhanghechun on 2020/4/2
 */
public class DuckTestDriver {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WilTurkey turkey = new WilTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey say ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck say ....");
        testDuck(duck);

        System.out.println("turkey adapter say .... ");
        testDuck(turkeyAdapter);

    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
