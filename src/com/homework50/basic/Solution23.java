package com.homework50.basic;

import javax.sound.midi.Soundbank;

/**
 * 【求自守数】自守数是指一个数的平方的尾数等于该数自身
 *
 * @author zxcsjf
 * @since 2022/05/29 11:30
 */
public class Solution23 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("1~10_000范围的自守数有：");
        for (int i = 1; i < 10; i++) {
            if (i == i * i % 10) {
                System.out.println(i);
                count++;
            }
        }
        for (int i = 10; i < 100; i++) {
            int geWei = i * i % 10;
            int shiWei = i * i / 10 % 10;
            if (i == shiWei * 10 + geWei) {
                System.out.println(i);
                count++;
            }
        }
        for (int i = 100; i < 1000; i++) {
            int geWei = i * i % 10;
            int shiWei = i * i / 10 % 10;
            int baiWei = i * i / 100 % 10;
            if (i == baiWei * 100 + shiWei * 10 + geWei) {
                System.out.println(i);
                count++;
            }
        }
        for (int i = 1000; i < 10_000; i++) {
            int geWei = i * i % 10;
            int shiWei = i * i / 10 % 10;
            int baiWei = i * i / 100 % 10;
            int qianWei = i * i / 1000 % 10;
            if (i == qianWei * 1000 + baiWei * 100 + shiWei * 10 + geWei) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("共有" + count + "个。");
    }
}
