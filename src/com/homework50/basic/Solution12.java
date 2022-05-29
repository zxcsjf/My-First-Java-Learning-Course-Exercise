package com.homework50.basic;

import java.util.Scanner;

/**
 * @author zxcsjf
 * @since 2022/05/29 09:33
 */
public class Solution12 {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner scanner12 = new Scanner(System.in);
        int n = scanner12.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("前" + n + "项和是" + sum);
    }
}
