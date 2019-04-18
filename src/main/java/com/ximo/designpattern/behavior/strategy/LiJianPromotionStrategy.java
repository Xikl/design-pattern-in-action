package com.ximo.designpattern.behavior.strategy;

/**
 * @author xikl
 * @date 2019/4/18
 */
@Strategy(type = StrategyEnums.LI_JIAN)
public class LiJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void promote() {
        System.out.println("立减");
    }
}
