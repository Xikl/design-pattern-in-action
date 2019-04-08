package com.ximo.designpattern.structural.decorator.food.v2;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class Battercake extends BaseBattercake {

    @Override
    public String getDesc() {
        return "一个普通的煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
