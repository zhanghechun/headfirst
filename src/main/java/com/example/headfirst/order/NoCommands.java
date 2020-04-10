package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/31
 */
public class NoCommands implements Command {
    Light light;

    public NoCommands(Light light) {
        this.light = light;
    }

    public NoCommands() {
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
