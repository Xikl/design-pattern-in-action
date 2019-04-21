package com.ximo.designpattern.structural.proxy.staticproxy;

import com.ximo.designpattern.structural.proxy.IOrderService;
import com.ximo.designpattern.structural.proxy.IOrderServiceImpl;
import com.ximo.designpattern.structural.proxy.Order;
import com.ximo.designpattern.structural.proxy.constants.CommonConstants;
import com.ximo.designpattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author xikl
 * @date 2019/4/21
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;


    public  int saveOrder(Order order) {
        beforeMethod(order);
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    /**
     * 前置
     *
     * @param order
     */
    private void beforeMethod(Order order) {
        System.out.println("before invoke");
        iOrderService = new IOrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到DB" + dbRouter + "执行");

        // 修改数据源
        setDataSource(dbRouter);
    }

    private void afterMethod() {
        System.out.println("after invoke");
    }

    private void setDataSource(int dbRouter) {
        DataSourceContextHolder.setDBType(CommonConstants.DB_TYPE_PREFIX + dbRouter);
    }
}
