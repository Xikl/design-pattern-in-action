package com.ximo.designpattern.simplefactory.chap2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 朱文赵
 * @date 2018/3/7 16:23
 * @description 返利子类
 */
public class CashReturn extends BaseCash {

    private BigDecimal moneyCondition;
    private BigDecimal moneyReturn;

    public CashReturn(BigDecimal moneyCondition, BigDecimal moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        BigDecimal result = money;
        if (money.compareTo(moneyCondition) > 0) {
            //money 除以 moneyCondition 远离0的方向
            //向零方向舍入的舍入模式。从不对舍弃部分前面的数字加 1（即截尾）。注意，此舍入模式始终不会增加计算值的绝对值。
            //scale中小数的个数
            result = money.subtract(moneyReturn.multiply(money.divide(moneyCondition, 0, RoundingMode.DOWN)));
        }
        return result;
    }


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(2.00);
        BigDecimal b = new BigDecimal(0.33);
//        System.out.println(a.divideToIntegralValue(b));
//        System.out.println(a.divide(b, 0, RoundingMo  de.DOWN));
        System.out.println(a.multiply(b).setScale(2, RoundingMode.DOWN));
    }

}
