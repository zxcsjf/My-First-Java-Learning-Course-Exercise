package com.homework50.extension;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4. 【数组元素的插入】有一个已经排好序的int数组{1, 2, 3, 4, 5, 6, 7, 8}。现输入一个数（要求该数在1-8之间），按 原来的规律将它插入数组中。
 *
 * @author zxcsjf
 * @since 2022/05/29 13:56
 */
public class Solution4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        System.out.print("请输入一个数（1~8）：");
        Scanner scanner4 = new Scanner(System.in);
        int num = scanner4.nextInt();

        if (num >= array[array.length - 2]) {
            array[array.length - 1] = num;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= num && array[i + 1] > num) {
                    // num 放在 i+1 处，原先 i+1 ~ length-2 的数字往后移
                    for (int j = array.length - 1; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = num;
                    break;
                }
            }
        }

        System.out.println("排序后" + Arrays.toString(array));
    }
}
