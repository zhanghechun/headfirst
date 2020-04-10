package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/31
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
