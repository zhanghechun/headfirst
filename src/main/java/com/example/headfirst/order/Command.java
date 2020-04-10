package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/30
 */
public interface Command {
    void execute();
    void undo();
}
