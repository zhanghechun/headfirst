package com.example.headfirst.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * create by Administrator : zhanghechun on 2020/3/24
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure=29.92f;
    private float lastPressure;
    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
          //这里显示代码
    }

    @Override
    public void update(Observable observable, Object arg) {
        WeatherData weatherData=(WeatherData) observable;

        if (observable instanceof WeatherData){
            lastPressure=currentPressure;
            currentPressure=weatherData.getPressure();
            display();
        }
        lastPressure=currentPressure;
    }
}
