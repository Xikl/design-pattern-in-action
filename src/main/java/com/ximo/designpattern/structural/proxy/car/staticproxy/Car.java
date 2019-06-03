package com.ximo.designpattern.structural.proxy.car.staticproxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class Car implements Movable{

    @Override
    public void move() {
        System.out.println("move");
    }

}
