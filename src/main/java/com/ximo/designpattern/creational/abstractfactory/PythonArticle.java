package com.ximo.designpattern.creational.abstractfactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class PythonArticle extends AbstractArticle {

    @Override
    public void produce() {
        System.out.println("python article");
    }
}
