package com.ximo.designpattern.creational.builder.chaintype;

/**
 * @author xikl
 * @date 2019/3/25
 */
public class Test {

    /**
     * @see StringBuilder#append(String)
     * @see com.google.common.cache.CacheBuilder
     * @see org.springframework.beans.factory.support.BeanDefinitionBuilder
     * @see org.apache.ibatis.session.SqlSessionFactoryBuilder, {@link org.apache.ibatis.builder.xml.XMLConfigBuilder}
     * @param args
     */
    public static void main(String[] args) {
        Course course = new Course.Builder()
                .courseArticle("java")
                .courseName("sss")
                .build();

        System.out.println(course);
    }
}
