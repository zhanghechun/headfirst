package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/4/1
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo control = new RemoteControlWithUndo();

        Light light = new Light("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        control.setCommand(0,lightOnCommand,lightOffCommand);
        control.onButtonWasPressed(0);
        control.offButtonWasPressed(0);
        System.out.println(control );
        control.offButtonWasPressed(0);
        control.onButtonWasPressed(0);
        System.out.println(control);
        control.undoButtonWasPushed();
    }
}
