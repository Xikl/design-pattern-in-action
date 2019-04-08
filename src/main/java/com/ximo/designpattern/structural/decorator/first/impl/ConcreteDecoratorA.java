package com.ximo.designpattern.structural.decorator.first.impl;

import com.ximo.designpattern.structural.decorator.first.Decorator;

/**
 * @author 朱文赵
 * @date 2018/3/20 12:06
 * @description
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "A中的new State";
        System.out.println(addedState + "具体装饰对象的A的操作");
    }
}
