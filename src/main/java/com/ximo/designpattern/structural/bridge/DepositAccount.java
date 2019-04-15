package com.ximo.designpattern.structural.bridge;

/**
 * @author xikl
 * @date 2019/4/15
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccount() {
        System.out.println("这是一个定期账号");
    }
}
