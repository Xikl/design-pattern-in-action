package com.ximo.designpattern.behavior.observer.guavaeventbus.v2;

/**
 * 可观察的对象
 *
 * @author xikl
 * @date 2019/4/22
 */
public class Course{

    private String courseName;

    private Question question;

    public Course() {
    }

    public Course(String courseName, Question question) {
        this.courseName = courseName;
        this.question = question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", question=" + question +
                '}';
    }
}
