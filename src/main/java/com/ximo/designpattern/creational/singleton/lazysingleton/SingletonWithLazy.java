package com.ximo.designpattern.creational.singleton.lazysingleton;

/**
 * 懒汉式单例
 *
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithLazy {

    private static SingletonWithLazy instance;

    private SingletonWithLazy() {
    }

    /**
     * 非线程安全
     *
     * @return
     */
    public static SingletonWithLazy getInstance() {
        if (instance == null) {
            instance = new SingletonWithLazy();
        }
        return instance;
    }


}
