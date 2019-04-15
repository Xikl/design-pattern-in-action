package com.ximo.designpattern.structural.bridge;

/**
 * 活期账号
 * @author xikl
 * @date 2019/4/15
 */
public class SavingAccount implements Account{


    @Override
    public Account openAccount() {
        System.out.println("打开了活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccount() {
        System.out.println("这是一个活期账号");
    }
}
