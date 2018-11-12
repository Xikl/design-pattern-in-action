package com.ximo.designpattern.proxy;

import lombok.Data;

/**
 * 代理模式-静态代理
 *
 * @author Ximo
 * @date 2018/11/13 0:20
 */
@Data
public class Order {

    private Object orderInfo;

    private Integer userId;

}
