package com.ximo.designpattern.structural.proxy.car.cglib;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class Test {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Train train = (Train) cglibProxy.getProxy(Train.class);
        train.say();

    }
}
