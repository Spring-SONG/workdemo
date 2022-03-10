package com.song.testdemo1.treadtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: songshiqi
 * @Date: 2022/3/7 14:37
 */
public class SpringTest {
    public static void main(String[] args) {
        List<String> A =new ArrayList<>();
        List<String> B =new ArrayList<>();
        A.add("abc");
        A.add("123");
        B.add("def");
//        B.stream().sequential().collect(Collectors.toCollection(() -> A));
        A.addAll(B);
        A.remove(0);
        System.out.println(A.get(0));


    }
}
