package com.ximo.designpattern.structural.facade;

import java.util.UUID;

/**
 * 运输类
 *
 * @author xikl
 * @date 2019/4/7
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        System.out.println("运输成功");
        // 返回运输订单号
        return UUID.randomUUID().toString().replace("-", "");
    }

}
