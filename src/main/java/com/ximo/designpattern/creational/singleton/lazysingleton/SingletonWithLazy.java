package com.ximo.designpattern.creational.singleton.lazysingleton;

/**
 * 懒汉式单例
 *
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithLazy {

    private static SingletonWithLazy instance;

    /** 同步对象 */
    private static final Object object = new Object();

    private SingletonWithLazy() {
    }

    /**
     * 非线程安全
     * 通过同步锁来保证线程安全 这里只同步一个对象 而不用拿到整个class的锁
     * 如果将synchronized放到静态方法中 和 synchronized(SingletonWithLazy.class) 是一样的效果 都是要拿到整个class的锁
     *
     * @return
     */
    public static SingletonWithLazy getInstance() {
        synchronized (object) {
            if (instance == null) {
                instance = new SingletonWithLazy();
            }
        }
        return instance;
    }


}
