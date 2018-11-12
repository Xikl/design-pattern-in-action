package com.ximo.designpattern.proxy;

/**
 * @author Ximo
 * @date 2018/11/13 0:22
 */
public class IOrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("dao 层添加order成功");
        return 1;
    }
}
