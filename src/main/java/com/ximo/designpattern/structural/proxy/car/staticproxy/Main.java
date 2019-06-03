package com.ximo.designpattern.structural.proxy.car.staticproxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        CarLogProxy carLogProxy = new CarLogProxy(car);
        CarTimeProxyByInterface carTimeProxyByInterface = new CarTimeProxyByInterface(carLogProxy);
        // 先日志 再 时间
        carTimeProxyByInterface.move();


    }

}
