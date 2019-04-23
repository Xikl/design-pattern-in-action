package com.ximo.designpattern.behavior.observer.weather;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 朱文赵
 * @date 2018/9/16
 * @description
 */
public class GeneralDisplay implements DisplayElement, Observer{

    private Observable observable;
    private float temperature;
    private float humidity;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        // 注册
        observable.addObserver(this);
    }

    /**
     * 发布者 和 传入的参数
     *
     * @param o 发布者 方便订阅者知道发布的
     * @param arg 参数 可能发布者自身 无法携带参数
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("temperature", temperature)
                .append("humidity", humidity)
                .toString();
    }
}
