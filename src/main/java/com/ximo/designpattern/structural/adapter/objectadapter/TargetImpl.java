package com.ximo.designpattern.structural.adapter.objectadapter;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class TargetImpl implements Target {

    @Override
    public void request() {
        System.out.println("具体的方法");
    }
}
