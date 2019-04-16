package com.ximo.designpattern.behavior.templatemethod;

/**
 * @author xikl
 * @date 2019/4/16
 */
public class Test {

    public static void main(String[] args) {
        AbstartCourse abstartCourse = new PythonCourse(true);
        abstartCourse.makeCourse();
    }
}
