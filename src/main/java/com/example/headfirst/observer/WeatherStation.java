package com.example.headfirst.observer;

/**
 * create by Administrator : zhanghechun on 2020/3/23
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //创建发观察者类，利用构造方法将类添加到观者者中去
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(34,75,39.6f);
        weatherData.setMeasurements(44,69,30.8f);


    }
}
