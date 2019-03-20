package com.ximo.designpattern.simplefactory.chap1.factory;

import com.ximo.designpattern.simplefactory.chap1.operation.*;

/**
 * @author 朱文赵
 * @date 2018/3/6 14:23
 * @description
 */
public class OperationFactory {

    public static BaseOperation createOperation(char operator) {
        BaseOperation operation = null;
        switch (operator) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("unsupported operation");
        }
        return operation;
    }

    /**
     * 开闭原则
     *
     * @param clazz
     * @return
     */
    public static BaseOperation createOperation(Class<? extends BaseOperation> clazz) {
        try {
            BaseOperation operation = clazz.newInstance();
            return operation;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


}
