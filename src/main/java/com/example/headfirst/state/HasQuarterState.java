package com.example.headfirst.state;

import java.util.Random;

/**
 * create by Administrator : zhanghechun on 2020/4/8
 */
public class HasQuarterState implements State {
    Random random=new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ...");
        int winner=random.nextInt(10);
        if (winner==0&&gumballMachine.count>1){
            gumballMachine.setState(gumballMachine.winnerState);
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
