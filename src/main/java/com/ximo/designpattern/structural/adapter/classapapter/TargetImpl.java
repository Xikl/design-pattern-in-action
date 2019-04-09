package com.ximo.designpattern.structural.adapter.classapapter;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("具体的请求方法");
    }
}
