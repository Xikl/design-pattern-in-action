package com.ximo.designpattern.creational.singleton.hungrysingleton;

/**
 * 饿汉式
 *
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithHungry {

    private static SingletonWithHungry instance = new SingletonWithHungry();

    /**
     * 饿汉式 也是可以的
     *
     */
    private SingletonWithHungry() {
        if (instance != null) {
            throw new UnsupportedOperationException("can not create the object by reflect");
        }
    }

    public static SingletonWithHungry getInstance() {
        return instance;
    }
}
