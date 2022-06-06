package com.homework50.basic;

/**
 * 求素数
 *
 * @author zxcsjf
 * @since 2022/05/29 15:07
 */
public class Solution5 {
    public static void main(String[] args) {
        Solution5.getPrimeNumbers(101, 200);
    }

    public static void getPrimeNumbers(int minValue, int maxValue) {
        int count = 0;
        boolean signal;

        for (int i = minValue; i <= maxValue; i++) {
            signal = true;
            // 排除不是2的偶数、1
            if (i % 2 == 0 && i != 2 || i == 1)
                continue;

            // 只遍历到这个数的平方根，减少计算次数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    signal = false;
                    break;
                }
            }

            if (signal) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + count +
                " prime number between " + minValue + " and " + maxValue);

    }
}
