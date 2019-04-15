package com.ximo.designpattern.structural.bridge;

/**
 * @author xikl
 * @date 2019/4/15
 */
public class ICBCBank extends Bank {


    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
