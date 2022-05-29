package com.homework50.basic;

import java.util.Scanner;

/**
 * 【分解质因数】将一个大于2的正整数分解质因数。例如：输入 3的话，输出 3=3； 输入6，输出6 = 2 *3等
 *
 * @author zxcsjf
 * @since 2022/05/29 10:35
 */
public class Solution20 {
    public static void main(String[] args) {
        System.out.print("请输入要分解的整数：");
        Scanner scanner20 = new Scanner(System.in);
        int number = scanner20.nextInt();
        StringBuffer stringBuffer = new StringBuffer(number + " = ");

        int n = 2; // 从质数2开始
        while (n <= number) {
            if (number % n == 0) {
                stringBuffer.append(n + " * ");
                number /= n;
            } else
                n++;

        }

        System.out.println(stringBuffer.substring(0, stringBuffer.length() - 3));
    }
}
