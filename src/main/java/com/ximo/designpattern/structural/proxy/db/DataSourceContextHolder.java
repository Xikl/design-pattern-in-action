package com.ximo.designpattern.structural.proxy.db;

/**
 * 数据源容器
 *
 * @author xikl
 * @date 2019/4/21
 */
public class DataSourceContextHolder {

    /** 存储数据源类型 */
    private static final ThreadLocal<String> DATA_SOURCE_CONTEXT_HOLDER = new InheritableThreadLocal<>();


    public static void setDBType(String dbType) {
        DATA_SOURCE_CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return DATA_SOURCE_CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        DATA_SOURCE_CONTEXT_HOLDER.remove();
    }
}
