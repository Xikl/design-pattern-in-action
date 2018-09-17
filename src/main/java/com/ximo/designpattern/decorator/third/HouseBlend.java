package com.ximo.designpattern.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description 一种咖啡的类型
 */
public class HouseBlend extends AbstractBeverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
