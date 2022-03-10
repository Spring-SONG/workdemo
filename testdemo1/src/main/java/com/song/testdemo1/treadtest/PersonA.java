package com.song.testdemo1.treadtest;

/**
 * @Description:
 * @Author: songshiqi
 * @Date: 2022/3/10 14:39
 */
public class PersonA extends Thread {
    Bank bank;
    String mode;

    public PersonA(Bank bank, String mode) {
        this.bank=bank;
        this.mode=mode;
    }
    public void run(){
        while(bank.money>=100){
            try {
                bank.outMoney(100, mode);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }




}
