package com.homework50.basic;

/**
 * 【根据条件求数】一个整数，它加上100或者268后都是一个完 全平方数，请问在1万以内，这样的数有几个，分别是多少？
 *
 * @author zxcsjf
 * @since 2022/05/29 09:58
 */
public class Solution15 {
    public static void main(String[] args) {
        int max = 10_000;
        int count = 0;
        for (var n = 1; n <= max; n++) {
            if (isSquare(n + 100) && isSquare(n + 268)) {
                count++;
                System.out.println(n);
            }
        }
        System.out.println("这样的数有" + count + "个。");
    }

    public static boolean isSquare(int num) {
        double a = Math.sqrt(num);
        int b = (int)a;
        return a - b == 0;
    }
}
