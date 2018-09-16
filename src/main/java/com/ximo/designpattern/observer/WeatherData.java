package com.ximo.designpattern.observer;

import java.util.Observable;

/**
 * @author 朱文赵
 * @date 2018/9/16
 * @description
 * 一个失败的发布订阅模式
 * Observable为一个类 而不是接口 违反 多用组合 少用集成的原则
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    /** 调用这个方法 */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public WeatherData() {
    }

    public WeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
