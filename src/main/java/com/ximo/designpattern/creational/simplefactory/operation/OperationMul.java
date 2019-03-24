package com.ximo.designpattern.creational.simplefactory.operation;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:20
 * @description 乘法类
 */
public class OperationMul extends BaseOperation {


    /**
     * 通过子类的实现 来获得结果
     * 乘法
     *
     * @return 操作结果
     */
    @Override
    public double result() {
        return numberA * numberB;
    }
}
