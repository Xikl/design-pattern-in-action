package com.ximo.designpattern.creational.singleton.threadlocal;

/**
 * 线程级别的单例模式！
 * 以空间换时间的模式
 *
 * @author xikl
 * @date 2019/3/31
 */
public class SingletonWithThreadLocal {

    private static final ThreadLocal<SingletonWithThreadLocal> THREAD_LOCAL_VAR =
            ThreadLocal.withInitial(SingletonWithThreadLocal::new);

    private SingletonWithThreadLocal() {

    }

    public SingletonWithThreadLocal getInstance() {
        return THREAD_LOCAL_VAR.get();
    }
    

}
