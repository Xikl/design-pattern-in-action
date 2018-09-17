package com.ximo.designpattern.decorator.third;

/**
 * @author 朱文赵
 * @date 2018/9/17
 * @description
 */
public class DarkRoast extends AbstractBeverage {

    /**
     * 为了要设置饮料的描述，我
     * 们写了一个构造器。记住，
     * description实例变量继承自
     * Beverage。
     *
     */
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.88;
    }
}
