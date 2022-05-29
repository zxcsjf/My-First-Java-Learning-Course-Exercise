package com.homework50.basic;

/**
 * 25. 【循环练习】井里有一只蜗牛，他白天往上爬5米，晚上掉3.5 米，井深56.7米，计算蜗牛需要多少天才能从井底到爬出来
 *
 * @author zxcsjf
 * @since 2022/05/29 11:47
 */
public class Solution25 {
    public static void main(String[] args) {
        double climb = 5;
        double drop = 3.5;
        double depth = 56.7;
        double totalClimb = 0;
        int day = 0;

        while (totalClimb < depth) {
            totalClimb += climb;
            if (totalClimb < depth) {
                totalClimb -= drop;
            }
            day++;
        }

        System.out.println("总共" + day + "天爬出来。");
    }
}
