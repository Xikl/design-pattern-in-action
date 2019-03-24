package com.ximo.designpattern.creational.abstractfactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public AbstractVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new PythonArticle();
    }
}
