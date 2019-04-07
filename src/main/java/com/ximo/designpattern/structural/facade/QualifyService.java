package com.ximo.designpattern.structural.facade;

/**
 * @author xikl
 * @date 2019/4/7
 */
public class QualifyService {

    public boolean isAvaliable(PointsGift pointsGift) {
        return !"nothing".equals(pointsGift.getName());
    }





}
