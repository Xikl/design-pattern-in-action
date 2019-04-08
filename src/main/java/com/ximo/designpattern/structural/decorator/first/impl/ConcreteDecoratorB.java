package com.ximo.designpattern.structural.decorator.first.impl;

import com.ximo.designpattern.structural.decorator.first.Decorator;

/**
 * @author 朱文赵
 * @date 2018/3/20 12:09
 * @description
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体B的装饰对象");
    }

    private void addBehavior() {
        System.out.println("B中的新增行为");
    }

}
