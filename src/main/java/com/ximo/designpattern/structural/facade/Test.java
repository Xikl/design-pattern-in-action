package com.ximo.designpattern.structural.facade;

/**
 * @author xikl
 * @date 2019/4/7
 */
public class Test {

    public static void main(String[] args) {

        // 然后调用积分兑换方法

        // 应用层 不应该关注子系统 应该之和门面类进行通信
        // 所以这里注入就不对
        // 假设这里所有的子系统都已经有了 比如集成了 第三方服务 通过Spring中的@Autowied
        PointExchangeService pointExchangeService = new PointExchangeService();
        pointExchangeService.exchangePoints(new PointsGift("java book"));

    }


}
