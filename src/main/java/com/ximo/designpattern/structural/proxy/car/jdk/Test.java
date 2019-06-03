package com.ximo.designpattern.structural.proxy.car.jdk;

import com.ximo.designpattern.structural.proxy.car.staticproxy.Car;
import com.ximo.designpattern.structural.proxy.car.staticproxy.Movable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class Test {

    /**
     * 我们可以把这一段代码放到 {@link TimeHandler}中
     *
     * @param args 方法参数
     */
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler invocationHandler = new TimeHandler(car);
        Class<? extends Car> carClass = car.getClass();
        Movable movable = (Movable) Proxy.newProxyInstance(carClass.getClassLoader(), carClass.getInterfaces(),
                invocationHandler);
        movable.move();
    }

}
