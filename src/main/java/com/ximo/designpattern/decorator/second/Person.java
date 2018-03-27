package com.ximo.designpattern.decorator.second;

/**
 * @author 朱文赵
 * @date 2018/3/27 8:59
 * @description
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮：" + name);
    }
}
