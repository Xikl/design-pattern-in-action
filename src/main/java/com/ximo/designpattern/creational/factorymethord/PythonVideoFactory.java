package com.ximo.designpattern.creational.factorymethord;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
