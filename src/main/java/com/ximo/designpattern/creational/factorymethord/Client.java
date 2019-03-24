package com.ximo.designpattern.creational.factorymethord;

import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import sun.misc.Launcher;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class Client {


    /**
     * 工厂方法模式？ 定义一个抽象工厂方法 然后交由子类进行实现
     * 客户端只需要在创建的时候进行相应的new 操作就可以
     * 复合开闭原则 因为我们只要加了的话 我们只需要添加相应的xxx类 和 相应的 xxxFactory就行
     *
     * 缺点：会造成类过多！！
     * @see URLStreamHandlerFactory#createURLStreamHandler(String) , {@link ILoggerFactory#getLogger(String)} 定义了一个工厂方法
     * @see Launcher，{@link ch.qos.logback.classic.LoggerContext} 等就是上面的工厂的具体实现类
     * @see URLStreamHandler, {@link org.slf4j.Logger} 就是我们要创建的抽象类/接口类
     * @see sun.net.www.protocol.http.Handler, {@link org.slf4j.helpers.NOPLogger} 就是我们要创建的具体的子类
     * @param args
     */
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();

        Video video = videoFactory.getVideo();
        video.produce();

    }
}
