package com.ximo.designpattern.structural.adapter.classapapter;

/**
 * 通过继承实现
 *
 * @author xikl
 * @date 2019/4/9
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
