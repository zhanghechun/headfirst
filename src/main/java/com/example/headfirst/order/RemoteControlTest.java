package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/31
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //遥控器：调用者
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        //对象：命令的接收者
        Light light = new Light();
        //命令：传给接收者
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
