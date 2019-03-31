package com.ximo.designpattern.creational.singleton.enums;

/**
 * @author xikl
 * @date 2019/3/31
 */
public enum SingletonWithEnum {

    /** 实例对象 */
    INSTANCE;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static SingletonWithEnum getInstance() {
        return INSTANCE;
    }
}
