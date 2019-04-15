package com.ximo.designpattern.structural.bridge;

/**
 * @author xikl
 * @date 2019/4/15
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * 可以和account中的类的openAccount保持一致 也可以不一样 这里只是为了表示一个委托关系
     *
     * @return 账号
     */
    public abstract Account openAccount();
}
