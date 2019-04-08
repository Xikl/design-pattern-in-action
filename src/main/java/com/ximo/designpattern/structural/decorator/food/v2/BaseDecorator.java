package com.ximo.designpattern.structural.decorator.food.v2;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class BaseDecorator extends BaseBattercake{

    private BaseBattercake baseBattercake;

    public BaseDecorator(BaseBattercake baseBattercake) {
        this.baseBattercake = baseBattercake;
    }

    @Override
    public String getDesc() {
        return this.baseBattercake.getDesc();
    }

    @Override
    public int cost() {
        return this.baseBattercake.cost();
    }
}
