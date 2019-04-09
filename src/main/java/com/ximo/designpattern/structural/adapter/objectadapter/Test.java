package com.ximo.designpattern.structural.adapter.objectadapter;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());

        Target target1 = new TargetImpl();

        target.request();
        target1.request();
    }



}
