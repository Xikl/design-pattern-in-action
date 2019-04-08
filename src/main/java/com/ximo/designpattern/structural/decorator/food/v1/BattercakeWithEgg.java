package com.ximo.designpattern.structural.decorator.food.v1;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class BattercakeWithEgg extends Battercake{

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
