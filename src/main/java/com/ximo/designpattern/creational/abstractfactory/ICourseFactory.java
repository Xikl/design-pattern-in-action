package com.ximo.designpattern.creational.abstractfactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public interface ICourseFactory {

    AbstractVideo getVideo();

    AbstractArticle getArticle();

}
