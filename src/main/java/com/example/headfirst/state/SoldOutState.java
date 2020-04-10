package com.example.headfirst.state;

/**
 * create by Administrator : zhanghechun on 2020/4/8
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert a quarter ,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumballs dispensed");
    }
}
