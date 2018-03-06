package com.ximo.designpattern.chap1.operation;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:21
 * @description 减法类
 */
public class OperationSub extends BaseOperation {


    /**
     * 通过子类的实现 来获得结果
     * 减法
     *
     * @return 操作结果
     */
    @Override
    public double result() {
        return numberA - numberB;
    }
}
