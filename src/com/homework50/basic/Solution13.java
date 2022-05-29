package com.homework50.basic;

import java.util.Scanner;

/**
 * 前n项之积（阶乘
 *
 * @author zxcsjf
 * @since 2022/05/29 09:38
 */
public class Solution13 {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner scanner13 = new Scanner(System.in);
        int n = scanner13.nextInt();

        System.out.println("前" + n + "项之积是" + getFactorial(n));
    }

    public static long getFactorial(int max) {
        long result = 1;
        for (int i = 1; i <= max; i++) {
            result *= i;
        }
        return result;
    }
}
