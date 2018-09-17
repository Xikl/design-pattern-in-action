package com.ximo.designpattern.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description
 */

public abstract class AbstractBeverage {

    protected String description = "Unknown AbstractBeverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
