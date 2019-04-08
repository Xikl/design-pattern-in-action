package com.ximo.designpattern.structural.decorator.food.v1;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
