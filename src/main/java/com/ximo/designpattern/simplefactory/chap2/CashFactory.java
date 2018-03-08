package com.ximo.designpattern.simplefactory.chap2;

import java.math.BigDecimal;

/**
 * @author 朱文赵
 * @date 2018/3/8 9:00
 * @description
 */
public class CashFactory {


    public static BaseCash createCashAccept(String type) {
        BaseCash baseCash;
        switch (type) {
            case "正常收费":
                baseCash = new CashNormal();
                break;
            case "满300减100":
                baseCash = new CashReturn(new BigDecimal(300), new BigDecimal(100));
                break;
            case "打8折":
                baseCash = new CashRebate(new BigDecimal(0.8));
                break;
            default:
                throw new RuntimeException("不支持");
        }
        return baseCash;
    }


}
