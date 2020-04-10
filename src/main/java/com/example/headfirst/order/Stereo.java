package com.example.headfirst.order;

/**
 * create by Administrator : zhanghechun on 2020/3/31
 */
public class Stereo {
    public void on(){
        System.out.println("开启");
    }
    public void off(){
        System.out.println("关闭");
    }
    public void setCd(){
        System.out.println("装上CD");
    }
    public void setDVD(){
        System.out.println("装上dvd");
    }
    public void Radio(){
        System.out.println("装上广播");
    }
    public void Volume(int i){
        System.out.println("音量:"+i);
    }
}
