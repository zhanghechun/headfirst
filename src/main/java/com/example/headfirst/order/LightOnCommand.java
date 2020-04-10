package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/30
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(); 
    }

    @Override
    public void undo() {
        light.off();
    }
}
