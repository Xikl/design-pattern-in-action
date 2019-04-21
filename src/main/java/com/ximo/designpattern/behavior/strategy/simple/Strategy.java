package com.ximo.designpattern.behavior.strategy.simple;

/**
 * @author 朱文赵
 * @date 2018/3/9 12:19
 * @description 策略类
 */
public interface Strategy {

    /** 算法接口*/
    void algorithmInterface();

}

class ConcreteStrategyA implements Strategy {

    /**
     * 算法接口
     */
    @Override
    public void algorithmInterface() {
        System.out.println("策略A的具体实现");
    }
}

class ConcreteStrategyB implements Strategy {

    /**
     * 算法接口
     */
    @Override
    public void algorithmInterface() {
        System.out.println("策略B的具体实现");
    }
}

class ConcreteStrategyC implements Strategy {

    /**
     * 算法接口
     */
    @Override
    public void algorithmInterface() {
        System.out.println("策略C的具体实现");
    }
}
