package com.ximo.designpattern.structural.proxy.car.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     * 这样就会减少很多
     *
     * @return 一个新的代理对象
     */
    public Object newProxyObject() {
        Class<?> carClass = target.getClass();
        return Proxy.newProxyInstance(carClass.getClassLoader(), carClass.getInterfaces(), this);
    }

    /**
     * @param proxy  被代理的对象
     * @param method 被代理的方法
     * @param args   参数
     * @return 调用方法的返回值
     * @throws Throwable e
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    private void beforeMethod() {

    }

    private void afterMethod() {

    }

}
