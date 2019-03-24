package com.ximo.designpattern.creational.abstractfactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public AbstractVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new JavaArticle();
    }
}
