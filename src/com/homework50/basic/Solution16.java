package com.homework50.basic;

/**
 * 求100以内的所有奇数/偶数的和
 *
 * @author zxcsjf
 * @since 2022/05/29 10:05
 */
public class Solution16 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }

        System.out.println("100以内所有奇数的和是" + sum);
        System.out.println("100以内所有偶数的和是" + (sum + 100 / 2) );
    }
}
