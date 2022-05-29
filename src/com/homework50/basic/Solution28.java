package com.homework50.basic;

import java.util.Scanner;

/**
 * 28. 【分数累加】编写一个函数，输入n为偶数时，求1/2 + 1/4 + 1/6 + ... + 1/n的结果；
 * 当输入n为奇数时，求1/1 + 1/3 + 1/5 + ... + 1/n 的结果
 *
 * @author zxcsjf
 * @since 2022/05/29 12:10
 */
public class Solution28 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scanner28 = new Scanner(System.in);
        int number = scanner28.nextInt();
        double sum = 0;

        while (number > 0) {
            sum += 1.0 / number;
            number -= 2;
        }

        System.out.println(sum);
    }
}
