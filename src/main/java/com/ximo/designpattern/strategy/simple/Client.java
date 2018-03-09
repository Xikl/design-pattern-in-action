package com.ximo.designpattern.strategy.simple;

/**
 * @author 朱文赵
 * @date 2018/3/9 12:26
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();


        context = new Context(new ConcreteStrategyB());
        context.contextInterface();


        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

    }


}
