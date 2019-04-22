package com.ximo.designpattern.behavior.observer;

import java.util.Observable;

/**
 * 可观察的
 *
 * @author xikl
 * @date 2019/4/22
 */
public class Course extends Observable {

    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void produceCourse(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "课程");
        // 状态更新
        setChanged();
        // 通知观察者
        notifyObservers(question);
    }
}
