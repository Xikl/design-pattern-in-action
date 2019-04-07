package com.ximo.designpattern.structural.facade;

/**
 * @author xikl
 * @date 2019/4/7
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        System.out.println("支付成功");
        return true;
    }


}
