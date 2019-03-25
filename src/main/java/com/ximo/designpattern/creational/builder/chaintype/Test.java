package com.ximo.designpattern.creational.builder.chaintype;

/**
 * @author xikl
 * @date 2019/3/25
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.Builder()
                .courseArticle("java")
                .courseName("sss")
                .build();

        System.out.println(course);
    }
}
