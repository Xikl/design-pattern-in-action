package com.ximo.designpattern.structural.proxy.dynamicproxy;

import com.ximo.designpattern.structural.proxy.IOrderService;
import com.ximo.designpattern.structural.proxy.IOrderServiceImpl;
import com.ximo.designpattern.structural.proxy.Order;

/**
 * @author xikl
 * @date 2019/4/21
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        /**
         * 动态代理invoke
         * 动态代理分配到DB0执行
         * service层调用dao层
         * dao 层添加order成功
         * after invoke
         *
         */
        IOrderService iOrderService = ((IOrderService) new OrderServiceDynamicProxy(new IOrderServiceImpl())
                .bind());

        iOrderService.saveOrder(order);
    }

}
