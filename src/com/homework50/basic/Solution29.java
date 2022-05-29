package com.homework50.basic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author zxcsjf
 * @since 2022/05/29 12:15
 */
// public class Solution29 {
//
//     public static void main(String[] args) {
//         SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy-MM-dd");
//         System.out.print("Input date(yyyy-mm-dd): ");
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//
//         // parse 可能抛出异常, setLentient判断日期格式合法
//         try {
//             formatDateTime.setLenient(true); // 严格判断日期合法性
//             System.out.println(formatDateTime);
//             Date date = formatDateTime.parse(input); // 读入的字符串parse成Date对象
//             System.out.println(date);
//             System.out.printf("你输入的日期是%tC%ty年的第%tj天", date, date, date); // 得到日期是在这年的第几天
//         } catch (Exception e) {
//             // System.out.println("输入日期不合法，请重新输入。");
//             e.printStackTrace();
//         }
//     }
// }


public class Solution29 {
    public static void main(String[] args) {
        System.out.print("请输入年份：");
        Scanner scanner29 = new Scanner(System.in);
        int year = scanner29.nextInt();
        System.out.print("请输入月份：");
        int month = scanner29.nextInt();
        int daysOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = 30;
                break;
            default:
                daysOfMonth = 28;
                break;
        }

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            if (month == 2)
                daysOfMonth++;
        }
        System.out.println("你输入的这个月有：" + daysOfMonth + "天。");
    }
}


// public class Solution29 {
//     public static void main(String[] args) {
//         System.out.print("Input date(yyyy-mm): ");
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//
//         int year = Short.valueOf(input.substring(0, 4));
//         int month = Byte.valueOf(input.substring(5, 7));
//         int daysOfMonth = 0;
//         int[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//         daysOfMonth += monthList[month - 1];
//         if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
//             if (month == 2)
//                 daysOfMonth++;
//         }
//         System.out.println("你输入的这个月有：" + daysOfMonth + "天。");
//     }
// }
