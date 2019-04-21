package com.ximo.designpattern.creational.simplefactory.chap2;

import java.math.BigDecimal;

/**
 * @author 朱文赵
 * @date 2018/3/7 16:17
 * @description 不打折
 */
public class CashNormal extends BaseCash{

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
