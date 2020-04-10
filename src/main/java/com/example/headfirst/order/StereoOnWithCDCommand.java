package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/31
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.Volume(11);
    }

    @Override
    public void undo() {

    }
}
