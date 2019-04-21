package com.ximo.designpattern.structural.proxy.dynamicproxy;

import com.ximo.designpattern.structural.proxy.Order;
import com.ximo.designpattern.structural.proxy.constants.CommonConstants;
import com.ximo.designpattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xikl
 * @date 2019/4/21
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    /** 目标对象 */
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        // 这里就是 order的这个对象
        beforeMethod(argObject);
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    private void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("动态代理invoke");
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到DB" + dbRouter + "执行");

        setDataSource(dbRouter);
    }


    private void setDataSource(int dbRouter) {
        DataSourceContextHolder.setDBType(CommonConstants.DB_TYPE_PREFIX + dbRouter);
    }

    private void afterMethod() {
        System.out.println("after invoke");
    }
}
