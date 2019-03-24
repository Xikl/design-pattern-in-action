package com.ximo.designpattern.creational.simplefactory.operation;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:10
 * @description 操作类
 */
public abstract class BaseOperation {

    /** 数字A*/
    public double numberA;
    /** 数字B*/
    public double numberB;

    /**
     * 通过子类的实现 来获得结果
     *
     * @return 操作结果
     */
    public abstract double result();

}
