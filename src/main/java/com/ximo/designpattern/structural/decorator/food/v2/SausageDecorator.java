package com.ximo.designpattern.structural.decorator.food.v2;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class SausageDecorator extends BaseDecorator {

    public SausageDecorator(BaseBattercake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "香肠加1";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
