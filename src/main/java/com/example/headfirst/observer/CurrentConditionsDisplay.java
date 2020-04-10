package com.example.headfirst.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * create by Administrator : zhangHechun on 2020/3/23
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and"+humidity+"%humidity"+pressure);
    }

    @Override
    public void update(Observable obs,Object arg) {
       WeatherData weatherData=(WeatherData) obs;
       this.temperature=weatherData.getTemperature();
       this.humidity=weatherData.getHumidity();
       this.pressure=weatherData.getPressure();
       display();
    }
}
