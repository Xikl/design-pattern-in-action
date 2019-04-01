package com.ximo.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * 深度拷贝和浅拷贝
 *
 * @author xikl
 * @date 2019/4/1
 */
public class Pig implements Cloneable{

    private String name;

    private Date birthday;

    public Pig() {
    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝

//        return super.clone();

        // 深拷贝
        Pig pig = (Pig) super.clone();
        // 对于引用对象也要进行克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
