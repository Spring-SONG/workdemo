package com.song.testdemo1.treadtest;

/**
 * @Description:
 * @Author: songshiqi
 * @Date: 2022/3/10 11:05
 */
public class MainClass {
    public static void main(String[] args) {
        Station station1 = new Station("窗口1");
        Station station2 = new Station("窗口2");
        Station station3 = new Station("窗口3");
        station1.start();
        station2.start();
        station3.start();
    }
}
