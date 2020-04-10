package com.example.headfirst.order;

import java.util.Arrays;

/**
 * create by Administrator : zhanghechun on 2020/4/1
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;

    public RemoteControlWithUndo() {
        onCommands=new Command[7];
        offCommands=new Command[7];

        NoCommands noCommands = new NoCommands();
        for (int i = 0; i < 7; i++) {
            onCommands[i]=noCommands;
            offCommands[i]=noCommands;
        }
        undoCommands=noCommands;
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommands=onCommands[slot];
    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommands=offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommands.undo();
    }

    @Override
    public String toString() {
        return "RemoteControlWithUndo{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommands=" + undoCommands +
                '}';
    }
}
