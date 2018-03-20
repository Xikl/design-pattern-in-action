package com.ximo.designpattern.decorator.impl;

/**
 * @author 朱文赵
 * @date 2018/3/20 12:11
 * @description
 */
public class ConcreteDecoratorC extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("C没有特殊行为，具体装饰对象的C");
    }
}
