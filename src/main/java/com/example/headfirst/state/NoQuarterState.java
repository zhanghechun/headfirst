package com.example.headfirst.state;

/**
 * create by Administrator : zhanghechun on 2020/4/8
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there's ni quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
}
