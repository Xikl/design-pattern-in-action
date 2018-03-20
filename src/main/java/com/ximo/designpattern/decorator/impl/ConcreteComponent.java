package com.ximo.designpattern.decorator.impl;

import com.ximo.designpattern.decorator.BaseComponent;

/**
 * @author 朱文赵
 * @date 2018/3/20 11:13
 * @description
 */
public class ConcreteComponent extends BaseComponent{


    @Override
    public void operation() {
        System.out.println("具体的操作");
    }
}
