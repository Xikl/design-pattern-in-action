package com.ximo.designpattern.creational.simplefactory.chap3;

/**
 * @author 朱文赵
 * @date 2018/9/18
 * @description
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        //别的方法
        // pizza.xx();
        System.out.println(pizza);
        return pizza;
    }

    protected abstract Pizza createPizza(String type);



}
