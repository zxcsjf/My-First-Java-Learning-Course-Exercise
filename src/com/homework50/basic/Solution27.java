package com.homework50.basic;

/**
 * 27. 【求和】打印出1-100之间所有不是7的倍数和不包含7的数字， 并求和
 *
 * @author zxcsjf
 * @since 2022/05/29 12:00
 */
public class Solution27 {
    public static void main(String[] args) {
        System.out.println("1-100之间所有不是7的倍数和不包含7的数字有：");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 != 0 && !hasSeven(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("总和是" + sum);
    }

    private static boolean hasSeven(int n) {
        int geWei = n % 10;
        int shiWei = n / 10 % 10;
        int baiWei = n / 100 % 10;
        return (geWei == 7 || shiWei == 7 || baiWei == 7);
    }
}
