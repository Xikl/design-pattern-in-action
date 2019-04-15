package com.ximo.designpattern.structural.bridge;

/**
 * @author xikl
 * @date 2019/4/15
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        icbcBank.openAccount();

        icbcBank.setAccount(new SavingAccount());

        icbcBank.openAccount();
    }

}
