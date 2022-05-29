package com.homework50.basic;

import java.util.Scanner;

/**
 * 判断奇偶数
 *
 * @author zxcsjf
 * @since 2022/05/29 10:17
 */
public class Solution19 {
    public static void main(String[] args) {
        System.out.print("Please enter a int number：");
        Scanner scanner16 = new Scanner(System.in);
        int number = scanner16.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "是偶数。");
        } else if (number % 2 == 1) {
            System.out.println(number + "是奇数。");
        } else
            System.out.println("Invalid number!");
    }
}
