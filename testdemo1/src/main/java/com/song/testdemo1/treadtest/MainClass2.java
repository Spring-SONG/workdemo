package com.song.testdemo1.treadtest;

/**
 * @Description:
 * @Author: songshiqi
 * @Date: 2022/3/10 14:50
 */
public class MainClass2 {
    public static void main(String[] args) {
        Bank bank=new Bank();
        PersonA personA=new PersonA(bank, "ATM");
        PersonB personB=new PersonB(bank, "Counter");
        personA.start();
        personB.start();
    }
}
