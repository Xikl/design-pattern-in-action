package com.ximo.designpattern.creational.singleton.lazysingleton;

/**
 * @author xikl
 * @date 2019/3/26
 */
public class Test {


    public static void main(String[] args) {
//        getInstanceBySingleThread();
        getInstanceByMultiThread();
    }


    /**
     * 通过单线程获得实例
     *
     */
    private static void getInstanceBySingleThread() {
        SingletonWithLazy singletonWithLazy = SingletonWithLazy.getInstance();
        System.out.println(singletonWithLazy);
    }

    /**
     * 多线程拿到
     * 多线程debug
     *
     * Thread-1获得实例： com.ximo.designpattern.creational.singleton.lazysingleton.SingletonWithLazy@373c5485
     * Thread-0获得实例： com.ximo.designpattern.creational.singleton.lazysingleton.SingletonWithLazy@4033f447
     */
    private static void getInstanceByMultiThread() {
        Runnable instanceGetter = () -> {
            SingletonWithLazy singletonWithLazy = SingletonWithLazy.getInstance();
            System.out.println(Thread.currentThread().getName() + "获得实例： "+ singletonWithLazy);
        };

        Thread t1 = new Thread(instanceGetter);
        Thread t2 = new Thread(instanceGetter);
        t1.start();
        t2.start();
        System.out.println("end");
    }

}
