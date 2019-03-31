package com.ximo.designpattern.creational.singleton.innerholder;

import java.io.Serializable;

/**
 * 静态内部类的方式
 *
 * @author xikl
 * @date 2019/3/26
 */
public class SingletonWithHolder implements Serializable {

    private static final long serialVersionUID = -2299055489751036052L;

    /**
     * 静态内部类可以实现这种判断
     */
    private SingletonWithHolder() {
        if (SingletonHolder.instance != null) {
            throw new UnsupportedOperationException("can not create the object by reflect");
        }
    }

    /**
     *
     * classLoader 的加载机制？？？
     *
     */
    private static class SingletonHolder {
        private static SingletonWithHolder instance = new SingletonWithHolder();
    }

    public static SingletonWithHolder getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 此处必须返回object对象否则无法一致
     * @see java.io.ObjectOutputStream
     * @see java.io.ObjectInputStream#readObject, readObject0, readOrdinaryObject
     * Object rep = desc.invokeReadResolve(obj);
     * 赋值给我们的obj
     * handles.setObject(passHandle, obj = rep);
     *
     * @return
     */
    public Object readResolve() {
        return getInstance();
    }
}
