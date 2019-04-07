package com.ximo.designpattern.structural.facade;

/**
 * 外观类
 *
 * @author xikl
 * @date 2019/4/7
 */
public class PointExchangeService {

    /**
     * 组合service
     */
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private QualifyService qualifyService = new QualifyService();

    private ShippingService shippingService = new ShippingService();



    /**
     * 返回订单号
     *
     * @param pointsGift
     * @return
     */
    public String exchangePoints(PointsGift pointsGift) {
        if (qualifyService.isAvaliable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                return shippingService.shipGift(pointsGift);
            }
        }
        throw new UnsupportedOperationException();
    }

}
