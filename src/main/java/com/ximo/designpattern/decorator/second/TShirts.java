package com.ximo.designpattern.decorator.second;

/**
 * @author 朱文赵
 * @date 2018/3/27 9:14
 * @description
 */
public class TShirts extends Finery {

    public TShirts(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("tShirts");
        super.show();
    }
}
