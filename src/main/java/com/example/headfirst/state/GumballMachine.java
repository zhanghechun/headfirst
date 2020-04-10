package com.example.headfirst.state;

/**
 * create by Administrator : zhanghechun on 2020/4/8
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState=new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void releaseBall(){
        System.out.println("a gumball comes rolling out the slot");
        if (count!=0){
            count--;
        }
    }
    public void setState(State state){
        this.state=state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    /*final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;

    int state =SOLD_OUT;
    int count=0;

    public GumballMachine(int count) {
        this.count = count;
        if (count>0){
            state=NO_QUARTER;
        }
    }
    *//*
    动作的实现
     *//*
    public void insertQuarter(){
        if (state==HAS_QUARTER){
            System.out.println("you can't insert another quarter");
        }else if (state==NO_QUARTER){
            state=HAS_QUARTER;
            System.out.println("you insert a quarter");
        }else if(state==SOLD_OUT){
            System.out.println("you can't insert a quarter,the machine is sold out");
        }else if (state==SOLD){
            System.out.println("please wait,we're already giving you a gumball");
        }
    }
    *//*
    退钱
     *//*
    public void ejectQuarter(){
        if (state==HAS_QUARTER){
            System.out.println("quarter returned");
            state=NO_QUARTER;
        }else if (state==NO_QUARTER){
            System.out.println("have not inserted a quarter");
        }else if (state==SOLD){
            System.out.println("sorry , you already turned the crank");
        }else if (state==SOLD_OUT){
            System.out.println("you can't eject ,you haven't inserted a quarter yet");
        }
    }
    public void turnCrank(){
        if (state==HAS_QUARTER){
            System.out.println("you turned...");
            state=SOLD;
            dispense();
        }else if (state==NO_QUARTER){
            System.out.println("you turned but there is no quarter");
        }else if (state==SOLD){
            System.out.println("turning twice doesn't get you another gumball");
        }else if (state==SOLD_OUT){
            System.out.println("you turned but there are no gumballs");
        }
    }
    *//*
    发放糖果
     *//*
    public void dispense(){
        if (state==SOLD){
            System.out.println("a gumball comes rolling out the slot");
            count--;
            if (count<=0){
                System.out.println("oops ,out of gumballs");
            }else {
                state=NO_QUARTER;
            }
        }else if (state==NO_QUARTER){
            System.out.println("you need to pay first");
        }else if (state==SOLD_OUT){
            System.out.println("no gumball dispensed");
        }else if (state==HAS_QUARTER){
            System.out.println("no gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }*/
}
