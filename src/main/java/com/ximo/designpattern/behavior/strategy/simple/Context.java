package com.ximo.designpattern.behavior.strategy.simple;

/**
 * @author 朱文赵
 * @date 2018/3/9 12:25
 * @description
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
