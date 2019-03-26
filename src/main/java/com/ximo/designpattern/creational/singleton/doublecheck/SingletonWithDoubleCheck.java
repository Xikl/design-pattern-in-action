package com.ximo.designpattern.creational.singleton.doublecheck;

/**
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithDoubleCheck {

    /**
     * 加上volatile 禁止重排序
     * 共享内存
     */
    private volatile static SingletonWithDoubleCheck instance;

    /**
     * 同步对象
     */
    private static final Object object = new Object();

    private SingletonWithDoubleCheck() {
    }

    /**
     * 双重检查
     * 低版本jdk 可能无法正确执行
     *
     * 避免重排序造成的困扰
     * 1.禁止重排序 在instance中加上volatile关键字
     *
     * @return
     */
    public static SingletonWithDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (object) {
                if (instance == null) {
                    // 1.分配内存
                    // 2.初始化对象
                    // 3.设置instance给刚刚分配的内存地址
                    // ------------------------------
                    // 上面的 2 3 步骤可能会被重排序 因为在操作系统中看来这两个谁先谁后无所谓
                    instance = new SingletonWithDoubleCheck();
                }
            }
        }
        return instance;
    }


}
