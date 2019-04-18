package com.ximo.designpattern.behavior.strategy;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 策略工厂
 *
 * @author xikl
 * @date 2019/4/18
 */
@Slf4j
public class PromotionStrategyFactory {

    /**
     * 存放map
     */
    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP;

    private static final String PREFIX = "com.ximo.designpattern.behavior.strategy";

    /** 空的策略 */
    private static final EmptyPromotionStrategy EMPTY_PROMOTION_STRATEGY = new EmptyPromotionStrategy();

    static {
        Reflections reflections = new Reflections(PREFIX);
        Set<Class<?>> strategyClasses = reflections.getTypesAnnotatedWith(Strategy.class);
        // PromotionStrategyFactory::getType, PromotionStrategyFactory::getStrategy, (prev, next) -> next, ConcurrentHashMap::new
        PROMOTION_STRATEGY_MAP = strategyClasses.stream().
                collect(Collectors.toConcurrentMap(PromotionStrategyFactory::getType,
                        PromotionStrategyFactory::getStrategy,
                        (prev, next) -> next));
    }

    private static String getType(Class<?> strategyClass) {
        return strategyClass.getAnnotation(Strategy.class).type().toString();
    }

    /**
     * 获得策略
     *
     * @param strategyClass 策略信息
     * @return 策略
     */
    private static PromotionStrategy getStrategy(Class<?> strategyClass) {
        try {
            return (PromotionStrategy) strategyClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * 对外的策略模式 统一地方
     *
     * @param type 类型
     * @return 获得策略
     */
    public PromotionStrategy getPromotionStrategy(String type) {
        return PROMOTION_STRATEGY_MAP.getOrDefault(type, EMPTY_PROMOTION_STRATEGY);
    }




}
