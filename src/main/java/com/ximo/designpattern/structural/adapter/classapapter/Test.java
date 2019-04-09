package com.ximo.designpattern.structural.adapter.classapapter;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class Test {

    public static void main(String[] args) {
        Target target = new TargetImpl();

        target.request();

        Target target1 = new Adapter();
        target1.request();


    }

}
