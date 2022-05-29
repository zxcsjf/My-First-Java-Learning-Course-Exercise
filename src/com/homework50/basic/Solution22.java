package com.homework50.basic;

import java.util.Scanner;

/**
 * 22. 【交换值】任意给两个整数（int）值，请交互它们的值
 *
 * @author zxcsjf
 * @since 2022/05/29 11:24
 */
public class Solution22 {
    public static void main(String[] args) {
        System.out.println("请任意输入2个整数：");
        Scanner scanner22 = new Scanner(System.in);
        int a = scanner22.nextInt();
        int b = scanner22.nextInt();
        System.out.println("交换前：a = " + a + "; b =" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("交换后：a = " + a + "; b =" + b);
    }
}
