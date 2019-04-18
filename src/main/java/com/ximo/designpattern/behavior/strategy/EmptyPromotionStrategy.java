package com.ximo.designpattern.behavior.strategy;

/**
 * @author xikl
 * @date 2019/4/18
 */
@Strategy(type = StrategyEnums.EMPTY)
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void promote() {
        System.out.println("无促销");
    }
}
