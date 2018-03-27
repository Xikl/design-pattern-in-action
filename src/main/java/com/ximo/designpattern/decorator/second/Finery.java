package com.ximo.designpattern.decorator.second;

/**
 * @author 朱文赵
 * @date 2018/3/27 9:06
 * @description
 */
public class Finery extends Person {

    protected Person component;

    public Finery(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
