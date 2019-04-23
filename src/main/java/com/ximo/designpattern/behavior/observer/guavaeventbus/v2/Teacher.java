package com.ximo.designpattern.behavior.observer.guavaeventbus.v2;


import com.google.common.eventbus.Subscribe;

/**
 * 观察者
 *
 * @author xikl
 * @date 2019/4/22
 */
public class Teacher{

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Subscribe
    public void handleCourseChange(Course course) {
        System.out.println(course);
    }
}
