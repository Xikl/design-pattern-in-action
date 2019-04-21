package com.ximo.designpattern.creational.simplefactory.chap3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 朱文赵
 * @date 2018/9/18
 * @description
 */
public abstract class Pizza {

    // 属性
    protected String name;
    protected String dough;
    protected String sauce;

    protected List<String> toppings = new ArrayList<>();

    protected void prepare() {
        System.out.println("开始准备做披萨");
    }

    protected void cut() {
        System.out.println("默认 cut");
    }

    protected void box() {
        System.out.println("默认 box");
    }

    // 别的方法







}
