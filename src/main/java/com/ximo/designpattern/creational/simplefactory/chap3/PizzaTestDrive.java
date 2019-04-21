package com.ximo.designpattern.creational.simplefactory.chap3;

/**
 * @author 朱文赵
 * @date 2018/9/18
 * @description
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new MyPizzaStore();
        pizzaStore.orderPizza("big-big-big");
    }


}
