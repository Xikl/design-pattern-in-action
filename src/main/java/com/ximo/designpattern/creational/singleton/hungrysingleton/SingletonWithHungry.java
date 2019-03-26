package com.ximo.designpattern.creational.singleton.hungrysingleton;

/**
 * 饿汉式
 *
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithHungry {

    private static SingletonWithHungry instance = new SingletonWithHungry();

    private SingletonWithHungry() {
    }

    public static SingletonWithHungry getInstance() {
        return instance;
    }
}
