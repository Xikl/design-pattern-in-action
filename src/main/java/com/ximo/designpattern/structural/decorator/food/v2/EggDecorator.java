package com.ximo.designpattern.structural.decorator.food.v2;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class EggDecorator extends BaseDecorator {

    public EggDecorator(BaseBattercake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "鸡蛋加1";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
