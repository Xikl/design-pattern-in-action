package com.ximo.designpattern.creational.simplefactory;

import com.ximo.designpattern.creational.simplefactory.factory.OperationFactory;
import com.ximo.designpattern.creational.simplefactory.operation.BaseOperation;
import com.ximo.designpattern.creational.simplefactory.operation.OperationAdd;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:33
 * @description 计算类
 */
public class Calculator {

    public static void main(String[] args) {
        char operator = '+';
//        BaseOperation baseOperation = OperationFactory.createOperation(operator);
        BaseOperation baseOperation = OperationFactory.createOperation(OperationAdd.class);
        baseOperation.numberA = 1.2;
        baseOperation.numberB = 1.3;

        double result = baseOperation.result();
        System.out.println(result);
    }

}
