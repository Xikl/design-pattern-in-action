package com.ximo.designpattern.structural.proxy.car.staticproxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class CarLogProxy implements Movable {

    private Movable movable;

    public CarLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("日志开始");
        movable.move();
        System.out.println("日志结束");
    }
}
