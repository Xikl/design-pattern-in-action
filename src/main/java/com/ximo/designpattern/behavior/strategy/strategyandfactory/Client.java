package com.ximo.designpattern.behavior.strategy.strategyandfactory;

import java.math.BigDecimal;

/**
 * @author 朱文赵
 * @date 2018/3/9 13:23
 * @description
 */
public class Client {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext("正常收费");
        System.out.println("应该收费：");
        System.out.println(cashContext.getResult(new BigDecimal(1000)));
    }



}
