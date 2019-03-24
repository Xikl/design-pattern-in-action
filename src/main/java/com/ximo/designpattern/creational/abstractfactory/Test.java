package com.ximo.designpattern.creational.abstractfactory;

import org.apache.ibatis.session.SqlSessionFactory;

import java.sql.Connection;

/**
 * @author xikl
 * @date 2019/3/24
 */
public class Test {


    /**
     * 抽象工厂
     * 产品族 和 产品等级
     * 如果添加产品等级 则不适合用抽象工厂
     * @see Connection#createStatement(), {@link Connection#prepareStatement(String)} 抽象工厂
     * {@link org.apache.ibatis.session.SqlSessionFactory#openSession} {@link SqlSessionFactory#getConfiguration()}
     * @see com.mysql.jdbc.ConnectionImpl 一个实现 {@link org.apache.ibatis.session.SqlSessionManager} 实现类
     * @see org.apache.ibatis.session.SqlSession 则是要创建的一个对象
     *
     * @param args
     */
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticle().produce();
        courseFactory.getVideo().produce();

    }
}
