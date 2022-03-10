package com.song.testdemo1.treadtest;

/**
 * @Description:
 * @Author: songshiqi
 * @Date: 2022/3/10 10:29
 */
public class Station extends Thread {
    //构造方法给线程名赋值
    public Station(String name) {
        super(name);
    }
    //静态保证票数一致
    static int tick = 20;
    //静态钥匙
    static Object ob = "aa";
    //重写run方法实现买票操作
    @Override
    public void run(){
        while (tick > 0){
            synchronized (ob) {
                if (tick > 0) {
                    System.out.println(getName() + "卖出了第" + tick + "张票");
                    tick--;
                } else {
                    System.out.println("票卖完了");
                }
            }

        }
    }

}
