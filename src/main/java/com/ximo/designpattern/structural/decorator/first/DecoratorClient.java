package com.ximo.designpattern.structural.decorator.first;

import com.ximo.designpattern.structural.decorator.first.impl.ConcreteComponent;
import com.ximo.designpattern.structural.decorator.first.impl.ConcreteDecoratorA;
import com.ximo.designpattern.structural.decorator.first.impl.ConcreteDecoratorB;
import com.ximo.designpattern.structural.decorator.first.impl.ConcreteDecoratorC;

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
