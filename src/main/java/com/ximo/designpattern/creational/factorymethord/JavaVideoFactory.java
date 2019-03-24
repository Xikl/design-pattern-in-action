package com.ximo.designpattern.creational.factorymethord;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
