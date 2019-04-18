package com.ximo.designpattern.behavior.strategy;

/**
 * @author xikl
 * @date 2019/4/18
 */
@Strategy(type = StrategyEnums.MAN_JIAN)
public class ManjianPromotionStrategy implements PromotionStrategy{

    @Override
    public void promote() {
        System.out.println("满减");
    }
}
