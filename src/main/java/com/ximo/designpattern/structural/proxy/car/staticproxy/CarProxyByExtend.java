package com.ximo.designpattern.structural.proxy.car.staticproxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class CarProxyByExtend extends Car {

    @Override
    public void move() {
        System.out.println("开始");
        super.move();
        System.out.println("结束");
    }
}
