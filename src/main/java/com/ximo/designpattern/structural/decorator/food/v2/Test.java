package com.ximo.designpattern.structural.decorator.food.v2;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class Test {

    public static void main(String[] args) {
        // 加一个香肠 两个鸡蛋
        BaseBattercake battercake;

        battercake = new Battercake();

        SausageDecorator sausageDecorator = new SausageDecorator(battercake);

        EggDecorator eggDecorator = new EggDecorator(sausageDecorator);

        EggDecorator eggDecorator1 = new EggDecorator(eggDecorator);

        System.out.println(eggDecorator1.getDesc());

        System.out.println(eggDecorator1.cost());

    }

}
