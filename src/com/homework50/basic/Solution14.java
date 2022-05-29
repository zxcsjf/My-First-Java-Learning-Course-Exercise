package com.homework50.basic;

import java.util.Scanner;

/**
 * 求最大值
 *
 * @author zxcsjf
 * @since 2022/05/29 09:50
 */
public class Solution14 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 Integer for compare: ");
        Scanner scanner141 = new Scanner(System.in);
        int a = scanner141.nextInt();
        Scanner scanner142 = new Scanner(System.in);
        int b = scanner142.nextInt();
        Scanner scanner143 = new Scanner(System.in);
        int c = scanner143.nextInt();

        System.out.println("Max is " + ((a >= b && a >= c) ? a : (b >= a && b >= c ? b : c)));

        // System.out.println("Please enter 3 Integer for compare: ");
        // Scanner scanner271 = new Scanner(System.in);
        // int a = scanner271.nextInt();
        // Scanner scanner272 = new Scanner(System.in);
        // int b = scanner272.nextInt();
        // Scanner scanner273 = new Scanner(System.in);
        // int c = scanner273.nextInt();
        //
        // if (a >= b && a >= c)
        // System.out.println("Max is " + a);
        // else if (b >= a && b >= c)
        // System.out.println("Max is " + b);
        // else if (c >= b && c >= a)
        // System.out.println("Max is " + c);
    }
}
