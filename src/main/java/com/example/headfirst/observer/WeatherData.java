package com.example.headfirst.observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * create by Administrator : zhanghechun on 2020/3/23
 */
public class WeatherData extends Observable {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

   /* @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            com.example.headfirst.observer.Observer observer = (com.example.headfirst.observer.Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }*/

    private void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
