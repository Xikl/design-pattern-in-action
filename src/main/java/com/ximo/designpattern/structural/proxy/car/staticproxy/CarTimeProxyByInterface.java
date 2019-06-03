package com.ximo.designpattern.structural.proxy.car.staticproxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class CarTimeProxyByInterface implements Movable{

    private Movable car;

    public CarTimeProxyByInterface(Movable car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("car3 开始");
        car.move();
        System.out.println("car3 结束");
    }
}
