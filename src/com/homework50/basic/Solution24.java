package com.homework50.basic;

/**
 * 买饮料 【循环练习】给20块钱买饮料，每瓶饮料3块钱，喝完之后退瓶
 * 子可以换回1块钱。问最多可以喝到多少瓶饮料？
 *
 * @author zxcsjf
 * @since 2022/05/29 11:45
 */
public class Solution24 {
    public static void main(String[] args) {
        int remainMoney = 20;
        int price = 3;
        int moneyOfBottle = 1;
        int totalBottle = 0;
        int bottle;

        while (remainMoney >= 3) {
            bottle = remainMoney / price;
            totalBottle += bottle;
            remainMoney = remainMoney % price + bottle * moneyOfBottle;
        }

        System.out.println("总共可以喝" + totalBottle + "瓶");
        System.out.println("还剩" + remainMoney + "元");

        if (remainMoney == 2) {
            System.out.println("可以再借1元，凑足3元，买一瓶，喝完用瓶子换1元还钱");
            System.out.println("这样可以喝" + (totalBottle + 1) + "瓶。");
        }
    }
}
