package com.ximo.designpattern.structural.adapter.power;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class AC220 {

    public int outPut220V() {
        int outPut = 220;

        System.out.println("输出交流电：" + outPut + "V");
        return outPut;
    }


}
