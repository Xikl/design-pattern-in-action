package com.ximo.designpattern.creational.simplefactory.chap3;

/**
 * @author 朱文赵
 * @date 2018/9/18
 * @description
 */
public class MyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        // switch 得到不同的类型
        return new MyPizza();
    }
}
