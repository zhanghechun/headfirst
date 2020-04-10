package com.example.headfirst.order;

import java.util.Arrays;

/**
 * create by Administrator : zhanghechun on 2020/3/31
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands=new Command[7];
        offCommands=new Command[7];
        Command noCommands=new NoCommands();
        for (int i = 0; i < 7; i++) {
            onCommands[i]=noCommands;
            offCommands[i]=noCommands;
        }
    }
    public void setCommands(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
