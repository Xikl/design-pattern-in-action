package com.ximo.designpattern.structural.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description 这是调料装饰者。请注意，它们除了必须实现
 * cost()之外，还必须实现getDescription()
 */
public class Mocha extends AbstractCondimentDecorator {

    private AbstractBeverage beverage;

    public Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    @Override
    public double cost() {
        return 0.80 + beverage.cost();
    }
}
