package com.ximo.designpattern.creational.simplefactory.operation;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:15
 * @description 加法操作类
 */
public class OperationAdd extends BaseOperation {


    /**
     * 通过加法获得结果
     *
     * @return 两个数字相加的结果
     */
    @Override
    public double result() {
        return numberA + numberB;
    }
}
