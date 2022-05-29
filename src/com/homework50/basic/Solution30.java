package com.homework50.basic;

/**
 * 30. 【三目运算符】某小伙想定一份外卖，商家的优惠方式如下： 鱼香肉丝单点 24 元，油炸花生米单点 8 元，米饭单点 3 元。 订单满 30 元 8 折优惠。 鱼香肉丝优惠价 16 元，但是优惠价和 折扣不能同时使用。
 * 那么这个小伙要点这三样东西，最少要花 多少钱？
 *
 * @author zxcsjf
 * @since 2022/05/29 13:30
 */
public class Solution30 {
    public static void main(String[] args) {
        int yuXiangRouSi = 24;
        int yuXiangRouSiDiscount = 16;
        int peanut = 8;
        int rice = 3;
        float discount = 0.8F;

        float a = yuXiangRouSiDiscount + peanut + rice;
        float b = (yuXiangRouSi + peanut + rice) * discount;
        System.out.println("三样都点，最少花" + (a < b ? a : b) + "元。");
    }
}
