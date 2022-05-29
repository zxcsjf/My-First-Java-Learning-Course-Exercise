package com.homework50.basic;


import java.util.*;

/**
 * 21. 【排序】键盘输入三个整数x、y、z，请把这三个数由小到大输出
 *
 * @author zxcsjf
 * @since 2022/05/29 11:03
 */
public class Solution21 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数：");
        Scanner scanner21 = new Scanner(System.in);

        int x = scanner21.nextInt();
        int y = scanner21.nextInt();
        int z = scanner21.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(x);
        arrayList.add(y);
        arrayList.add(z);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
