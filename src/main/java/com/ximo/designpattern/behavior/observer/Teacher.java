package com.ximo.designpattern.behavior.observer;


import java.util.Observable;
import java.util.Observer;

/**
 * @author xikl
 * @date 2019/4/22
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(this.teacherName+ "老师的"+course.getCourseName()
                +"被"+question.getUserName()+question.getContent()+"提出了");
    }
}
