package com.ximo.designpattern.creational.abstractfactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class JavaVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("java video");
    }
}
