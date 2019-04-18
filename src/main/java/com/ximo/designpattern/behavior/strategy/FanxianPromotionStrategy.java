package com.ximo.designpattern.behavior.strategy;

/**
 * @author xikl
 * @date 2019/4/18
 */
@Strategy(type = StrategyEnums.FAN_XIAN)
public class FanxianPromotionStrategy implements PromotionStrategy {

    @Override
    public void promote() {
        System.out.println("返现");
    }
}
