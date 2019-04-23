package com.ximo.designpattern.behavior.observer.guavaeventbus.v2;

import com.google.common.eventbus.EventBus;

/**
 * @author xikl
 * @date 2019/4/22
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher("zwz");
        eventBus.register(teacher);

        Question question = new Question();
        question.setContent("aaa");
        question.setUserName("bbb");
        // 创建被观察的对象
        Course course = new Course("java 课程", question);



        eventBus.post(course);

    }

}
