package com.ximo.designpattern.structural.decorator.food.v1;

/**
 * @author xikl
 * @date 2019/4/8
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc());
        System.out.println(battercake.cost());


    }

}
