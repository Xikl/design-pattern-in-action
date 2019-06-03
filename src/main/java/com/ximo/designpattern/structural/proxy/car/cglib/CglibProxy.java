package com.ximo.designpattern.structural.proxy.car.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xikl
 * @date 2019/6/3
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }


    /**
     *
     *
     * @param object 目标类
     * @param method 目标方法
     * @param args 参数
     * @param methodProxy 代理类的实例
     * @return 调用返回结果
     * @throws Throwable error
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("start");
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("end");
        return result;
    }

}
