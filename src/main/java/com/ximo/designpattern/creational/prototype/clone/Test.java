package com.ximo.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author xikl
 * @date 2019/4/1
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date();

        Pig pig1 = new Pig("pig1", birthday);
        Pig pig2 = (Pig) pig1.clone();

        /*
            Pig{name='pig1', birthday=Mon Apr 01 21:08:09 CST 2019}
            Pig{name='pig1', birthday=Mon Apr 01 21:08:09 CST 2019}
         */

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(2222222222L);

        /*
            同时被修改 浅拷贝
            Pig{name='pig1', birthday=Tue Jan 27 01:17:02 CST 1970}
            Pig{name='pig1', birthday=Tue Jan 27 01:17:02 CST 1970}

            // 深拷贝
            Pig{name='pig1', birthday=Tue Jan 27 01:17:02 CST 1970}
            Pig{name='pig1', birthday=Mon Apr 01 21:14:41 CST 2019}
         */
        System.out.println(pig1);
        System.out.println(pig2);
    }

}
