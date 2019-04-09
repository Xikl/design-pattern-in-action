package com.ximo.designpattern.structural.adapter.power;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new DC5InChina();
        dc5.outPut5V();
    }

}
