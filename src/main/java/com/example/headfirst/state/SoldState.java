package com.example.headfirst.state;

/**
 * create by Administrator : zhanghechun on 2020/4/8
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait ,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount()>1){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("oops,out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
