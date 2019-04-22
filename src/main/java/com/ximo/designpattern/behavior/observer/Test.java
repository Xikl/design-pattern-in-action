package com.ximo.designpattern.behavior.observer;

/**
 * @author xikl
 * @date 2019/4/22
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("java 课程");

        Teacher teacher = new Teacher("zwz");

        course.addObserver(teacher);

        Question question = new Question();
        question.setContent("java 和 go 比较那个牛逼");
        question.setUserName("cai ji");

        course.produceCourse(course, question);


    }

}
