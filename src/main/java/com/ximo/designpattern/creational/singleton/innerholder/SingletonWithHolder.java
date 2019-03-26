package com.ximo.designpattern.creational.singleton.innerholder;

/**
 * 静态内部类的方式
 *
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithHolder {

    private SingletonWithHolder() {
    }

    /**
     *
     * classLoader 的加载机制？？？
     *
     */
    private static class SingletonHolder {
        private static SingletonHolder instance = new SingletonHolder();
    }

    public SingletonHolder getInstance() {
        return SingletonHolder.instance;
    }
}
