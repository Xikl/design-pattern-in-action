package com.ximo.designpattern.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description
 */
public class Milk extends AbstractCondimentDecorator {

    private AbstractBeverage beverage;

    public Milk(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 我们希望叙述不只是描述饮料（例
     * 如“DarkRoast”），而是完整地连调料都
     * 描述出来（例如“DarkRoast, Mocha”）。
     * 所以首先利用委托的做法，得到一个
     * 叙述，然后在其后加上附加的叙述（例
     * 如“Mocha”）
     *
     * @return 描述信息
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + "Milk";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
