package com.ximo.designpattern.simplefactory.chap2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 朱文赵
 * @date 2018/3/7 16:18
 * @description 打折收费子类
 */
public class CashRebate extends BaseCash{

    private BigDecimal moneyRebate;

    public CashRebate(BigDecimal moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(moneyRebate).setScale(2, RoundingMode.DOWN);
    }

}
