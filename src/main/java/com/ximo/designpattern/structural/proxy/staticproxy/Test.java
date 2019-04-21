package com.ximo.designpattern.structural.proxy.staticproxy;

import com.ximo.designpattern.structural.proxy.Order;

/**
 * @author xikl
 * @date 2019/4/21
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);



    }

}
