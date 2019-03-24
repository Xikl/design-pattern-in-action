package com.ximo.designpattern.creational.simplefactory.factory;

import com.ximo.designpattern.creational.simplefactory.operation.*;

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
     * 通过反射来进行创建 也可以新建一个注解 来决定
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
