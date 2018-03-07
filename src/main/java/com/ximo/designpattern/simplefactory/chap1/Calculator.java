package com.ximo.designpattern.simplefactory.chap1;

import com.ximo.designpattern.simplefactory.chap1.factory.OperationFactory;
import com.ximo.designpattern.simplefactory.chap1.operation.BaseOperation;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:33
 * @description 计算类
 */
public class Calculator {

    public static void main(String[] args) {
        BaseOperation baseOperation;
        char operator = '+';

        baseOperation = OperationFactory.createOperation(operator);
        baseOperation.numberA = 1.2;
        baseOperation.numberB = 1.3;

        double result = baseOperation.result();
        System.out.println(result);
    }

}
