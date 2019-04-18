package com.ximo.designpattern.behavior.strategy;

/**
 * @author xikl
 * @date 2019/4/18
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public PromotionStrategy getPromotionStrategy() {
        return promotionStrategy;
    }

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion() {
        promotionStrategy.promote();
    }
}
