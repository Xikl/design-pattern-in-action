package com.ximo.designpattern.structural.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        AbstractBeverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + beverage.cost());

        // 开始装饰
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());


    }


}
