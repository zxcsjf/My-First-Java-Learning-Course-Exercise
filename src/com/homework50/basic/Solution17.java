package com.homework50.basic;

/**
 * 【自由落体】假如一个小球从100米高度自由落下，每次落地后 就反跳回原高度的一半。 那么求它在第10次落地时，共经过多 少米？ 第10次反弹多高
 *
 * @author zxcsjf
 * @since 2022/05/29 10:10
 */
public class Solution17 {
    public static void main(String[] args) {
        double h = 200;
        double sum = 0;
        int number = 10; // 便于reuse

        for (int i = 1; i <= number; i++) {
            sum += h;
            h /= 2;
        }
        System.out.println("第十次落地共经过" + (sum - 100) + "米");
        System.out.println("第十次反弹高度" + h / 2 + "米");
    }
}
