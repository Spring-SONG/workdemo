package com.song.testdemo1.treadtest;

import java.util.Objects;

/**
 * @Description:
 * @Author: songshiqi
 * @Date: 2022/3/10 14:26
 */
public class Bank {
    //账户中有1000元
    static double money = 1000;
    //柜台取钱得方法
    public void counter(double money){
        Bank.money-=money;
        System.out.println("柜台取钱："+money + "元，还剩：" + Bank.money);
    }
    //ATM取钱得方法
    public void ATM(double money){
        Bank.money-=money;
        System.out.println("ATM取钱：" + money + "元，还剩： " + Bank.money);
    }

    //提供一个对外取钱的方法，并防止多线程并发问题
    public synchronized void outMoney(double money, String mode) throws Exception {
        if (money>Bank.money) {
            throw new Exception("余额不足，取款失败");
        }
        if (Objects.equals(mode, "ATM")) {
            ATM(money);
        } else {
            counter(money);
        }
    }
}
