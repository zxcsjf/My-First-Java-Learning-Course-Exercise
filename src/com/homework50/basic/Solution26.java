package com.homework50.basic;

import java.util.Scanner;

/**
 * 26. 【键盘录入】键盘输入任意一个正整数，求各位数字之和。
 *
 * @author zxcsjf
 * @since 2022/05/29 11:54
 */
public class Solution26 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scanner26 = new Scanner(System.in);
        int number = scanner26.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("各位数字之和是" + sum);
    }
}
