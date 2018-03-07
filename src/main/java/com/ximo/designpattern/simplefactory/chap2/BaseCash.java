package com.ximo.designpattern.simplefactory.chap2;

import java.math.BigDecimal;

/**
 * @author 朱文赵
 * @date 2018/3/7 16:15
 * @description 金额基本抽象类
 */
public abstract class BaseCash {

    public abstract BigDecimal acceptCash(BigDecimal money);


}
