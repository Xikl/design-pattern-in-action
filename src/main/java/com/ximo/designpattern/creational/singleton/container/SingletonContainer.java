package com.ximo.designpattern.creational.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器单例类
 * 类似 spring中的依赖查找
 * @author xikl
 * @date 2019/3/31
 */
public class SingletonContainer {

    private static Map<String, Object> singletonMap = new ConcurrentHashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNoneBlank(key)) {
            singletonMap.putIfAbsent(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }




}
