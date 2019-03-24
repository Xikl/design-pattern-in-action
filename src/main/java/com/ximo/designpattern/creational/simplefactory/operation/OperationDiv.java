package com.ximo.designpattern.creational.simplefactory.operation;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:18
 * @description
 */
public class OperationDiv extends BaseOperation {


    /**
     * 通过子类的实现 来获得结果
     * 除法
     *
     * @return 操作结果
     */
    @Override
    public double result() {
        if (numberB == 0) {
            throw new RuntimeException("divided by 0");
        }
        return numberA / numberB;
    }

}
