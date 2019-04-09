package com.ximo.designpattern.structural.adapter.objectadapter;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class Adapter implements Target{

    /** 适配器模式 */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
