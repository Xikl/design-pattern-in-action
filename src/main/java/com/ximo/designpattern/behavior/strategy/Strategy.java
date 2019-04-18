package com.ximo.designpattern.behavior.strategy;

import java.lang.annotation.*;

/**
 * @author xikl
 * @date 2019/4/18
 */
@Documented //文档
@Retention(RetentionPolicy.RUNTIME) //在运行时可以获取
@Target({ ElementType.TYPE}) //作用到类，方法，接口上等
@Inherited //子类会继承
public @interface Strategy {

    StrategyEnums type() default StrategyEnums.EMPTY;


}
