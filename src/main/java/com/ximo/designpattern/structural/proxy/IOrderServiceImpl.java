package com.ximo.designpattern.structural.proxy;

/**
 * @author Ximo
 * @date 2018/11/13 0:23
 */
public class IOrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // spring 下 注入
        // 这里直接new出来
        iOrderDao = new IOrderDaoImpl();
        System.out.println("service层调用dao层");
        return iOrderDao.insert(order);
    }
}
