package com.ximo.designpattern.structural.composite;

/**
 * 课程类
 *
 * @author xikl
 * @date 2019/4/14
 */
public class Course extends BaseCatalogComponent {

    /** 名称 */
    private String name;
    /**  价格 */
    private double price;


    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("course name: " + this.name + ", price: " + this.price);
    }
}
