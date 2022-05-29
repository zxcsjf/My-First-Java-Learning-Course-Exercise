package com.homework50.extension;

/**
 * 5. 【数组元素的交换】给出一个int数组，把它最大的元素与第一 个元素交换，最小的元素与最后一个元素交换，输出交换后的 数组
 *
 * @author zxcsjf
 * @since 2022/05/29 13:51
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        System.out.print("请输入一个int数组：");
        Scanner scanner41 = new Scanner(System.in);
        String[] nums = scanner41.nextLine().split(" ");
        int[] num = new int[nums.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.valueOf(nums[i]);
        }

        int max = num[0];
        int min = num[0];
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < num.length; i++) {
            if (max <= num[i]){
                max = num[i];
                indexOfMax = i;
            }
            if (min >= num[i]){
                min = num[i];
                indexOfMin = i;
            }
        }

        System.out.println(Arrays.toString(Swap(Swap(num, 0, indexOfMax),
                                                    num.length - 1, indexOfMin)));
    }

    private static int[] Swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
}
