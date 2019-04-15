package com.ximo.designpattern.structural.bridge;

/**
 * @author xikl
 * @date 2019/4/15
 */
public class ABCBank extends Bank {


    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
