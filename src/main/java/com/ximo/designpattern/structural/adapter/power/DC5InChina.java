package com.ximo.designpattern.structural.adapter.power;

/**
 * @author xikl
 * @date 2019/4/9
 */
public class DC5InChina implements DC5 {

    private AC220 ac220 = new AC220();


    @Override
    public int outPut5V() {
        int adapterInput = ac220.outPut220V();
        // 变压器
        int result = adapterInput / 44;
        System.out.println("输出五v直流电");
        return result;
    }
}
