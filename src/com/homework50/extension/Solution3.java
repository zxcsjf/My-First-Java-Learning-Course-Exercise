package com.homework50.extension;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 3. 【排序】随机给十个数字，对它们进行排序。（可以给一个有 10个整数元素的数组，然后对数组排序）
 *
 * @author zxcsjf
 * @since 2022/05/29 13:47
 */
public class Solution3 {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // 冒泡排序：空间O(1), 时间O(n^2)，稳定可提前结束。
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] >array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) break;
        }

        System.out.println(Arrays.toString(array));

    }
}
