package com.shanjifei;

import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(num);
        System.out.println(str1);
        System.out.println(str2);

        //     int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //     System.out.println(maxSubArray(nums));
        // }
        //
        // private static int maxSubArray(int[] nums) {
        //     int ans = nums[0];
        //     int sum = 0;
        //     for (int num : nums) {
        //         if (sum > 0) {
        //             sum += num;
        //         } else {
        //
        //             sum = num;
        //         }
        //         ans = Math.max(ans, sum);
        //     }
        //     return ans;
    }
}



