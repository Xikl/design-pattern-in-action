package com.ximo.designpattern.strategy.strategyandfactory;

import com.ximo.designpattern.simplefactory.chap2.BaseCash;
import com.ximo.designpattern.simplefactory.chap2.CashNormal;
import com.ximo.designpattern.simplefactory.chap2.CashRebate;
import com.ximo.designpattern.simplefactory.chap2.CashReturn;

import java.math.BigDecimal;

/**
 * @author 朱文赵
 * @date 2018/3/9 13:14
 * @description 策略模式和 工厂模式 相结合
 */
public class CashContext {

    private BaseCash baseCash;

    public CashContext(String type) {
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
                throw new RuntimeException("不支持的操作");
        }
    }

    /**
     * 获得结果
     * @param money 用户输入的钱
     * @return 按照策略算法决定 用哪一种
     */
    public BigDecimal getResult(BigDecimal money) {
        return baseCash.acceptCash(money);
    }


}
