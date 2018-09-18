package com.ximo.designpattern.simplefactory.chap3;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author 朱文赵
 * @date 2018/9/18
 * @description
 */
public class MyPizza extends Pizza {

    public MyPizza() {
        name = "Mypizz";
        dough = "dough";
        sauce = "sauce";
        toppings.add("超级芝士");
    }

    @Override
    protected void cut() {
        super.cut();
        System.out.println("我想要吃随意点，我还想再切几刀");
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("dough", dough)
                .append("sauce", sauce)
                .append("toppings", toppings)
                .toString();
    }
}
