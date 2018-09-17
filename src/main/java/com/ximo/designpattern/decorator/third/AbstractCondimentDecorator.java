package com.ximo.designpattern.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description Condiment（调料）抽象类
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {

    /**
     * 所有的调料装饰者都必须重新实现
     * getDescription()方法
     *
     * @return 调料描述
     */
    @Override
    public abstract String getDescription();
}
