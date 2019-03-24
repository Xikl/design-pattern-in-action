package com.ximo.designpattern.creational.abstractfactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class JavaArticle extends AbstractArticle {

    @Override
    public void produce() {
        System.out.println("java article");
    }
}
