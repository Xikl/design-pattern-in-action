package com.ximo.designpattern.decorator;

import com.ximo.designpattern.decorator.impl.ConcreteComponent;
import com.ximo.designpattern.decorator.impl.ConcreteDecoratorA;
import com.ximo.designpattern.decorator.impl.ConcreteDecoratorB;
import com.ximo.designpattern.decorator.impl.ConcreteDecoratorC;

/**
 * @author 朱文赵
 * @date 2018/3/20 12:18
 * @description
 */
public class DecoratorClient {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        ConcreteDecoratorC decoratorC = new ConcreteDecoratorC();
        decoratorA.setComponent(concreteComponent);
        decoratorB.setComponent(decoratorA);
        decoratorC.setComponent(decoratorB);
        decoratorC.operation();
    }



}
