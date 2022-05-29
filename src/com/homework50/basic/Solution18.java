package com.homework50.basic;

import java.util.Scanner;

/**
 * 18. 【被9整除】键盘录入一个数，请判断它数能被几个9整除 。如 81就可以被2个9整除
 *
 * @author zxcsjf
 * @since 2022/05/29 10:14
 */
public class Solution18 {
    public static void main(String[] args) {
        System.out.print("Please enter a int number：");
        Scanner scanner16 = new Scanner(System.in);
        int number = scanner16.nextInt();
        int count = 0;

        while (true) {
            if (number % 9 == 0)
                count++;
            else
                break;
            number /= 9;
        }

        System.out.println("这个数能被" + count + "个9整除。");
    }
}
