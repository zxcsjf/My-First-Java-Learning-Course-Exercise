package com.HomeWork50;


import javax.swing.text.DateFormatter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

//class Solution22 {
//    public static void main(String[] args) {
//        Scanner scanner22 = new Scanner(System.in);
////        int input;
//        String rawInput;
//        char[] rawArray;
//        while (true) {
//            System.out.println("Please enter a 5 digits number: ");
//            rawInput = scanner22.nextLine();
//            rawArray = rawInput.toCharArray();
//            if (rawInput.length() > 5) System.out.println("Invalid Number!");
//            else break;
//        }
//        int length = rawInput.length();
//        int[] reversed = new int[];
//        for (var i = 0; i < length; i++){
//            reversed[i] = rawArray[length - i];
//        }
//        System.out.println(reversed);


//        int valueOfShiWanWei = input / 100_000;
//        int valueOfWanWei = (input - valueOfShiWanWei * 100_000) / 10_000;
//        int valueOfQianWei = (input - valueOfShiWanWei * 100_000 - valueOfWanWei * 10_000) / 1000;
//        int valueOfBaiWei = (input - valueOfShiWanWei * 100_000 - valueOfWanWei * 10_000 - valueOfQianWei * 1000) / 100;
//        int valueOfShiWei = (input - valueOfShiWanWei * 100_000 - valueOfWanWei * 10_000 - valueOfQianWei * 1000 - valueOfBaiWei * 100) / 10;
//        int valueOfGeWei = input - valueOfShiWanWei * 100_000 - valueOfWanWei * 10_000 - valueOfQianWei * 1000 - valueOfBaiWei * 100 - valueOfShiWei * 10;
//
//        System.out.print(valueOfGeWei * 100_000 + valueOfShiWei * 10_000 + valueOfBaiWei * 1000 + valueOfQianWei * 100 + valueOfWanWei * 10 + valueOfShiWanWei);
//
//    }
//}

//class Solution21 {
//    public static void main(String[] args) {
//        for (var n = 1; n <= 100_000; n++) {
////            if (Math.sqrt(n + 100) % 1 == 0 && Math.sqrt(n + 268) % 1 == 0)
//            if (isSquare(n + 100) && isSquare(n + 268))
//                System.out.println(n);
//        }
//    }
//
//    public static boolean isSquare(int num) {
//        double a = 0;
//        try {
//            a = Math.sqrt(num);
//        } catch (Exception e) {
//            return false;
//        }
//        int b = (int) a;
//        return a - b == 0;
//    }
//}

//class Solution20 {
//    public static void main(String[] args) {
//        SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.print("Input date(yyyy-mm-dd): ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//
//        // parse 可能抛出异常, setLentient判断日期格式合法
//        try {
//            formatDateTime.setLenient(true); // 严格判断日期合法性
//            System.out.println(formatDateTime);
//            Date date = formatDateTime.parse(input); // 读入的字符串parse成Date对象
//            System.out.println(date);
//            System.out.printf("你输入的日期是%tC%ty年的第%tj天", date, date, date);   //得到日期是在这年的第几天
//        } catch (Exception e) {
////            System.out.println("输入日期不合法，请重新输入。");
//            e.printStackTrace();
//        }
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        System.out.print("Input date(yyyy-mm-dd): ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        short year = Short.valueOf(input.substring(0, 4));
//        byte month = Byte.valueOf(input.substring(5, 7));
//        short day = Short.valueOf(input.substring(8, 10));
//        short days = 0;
//        byte[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//// 没有实现对输入的日期合法性做判断
//        for (byte i = 0; i < month - 1; i++) {
//            days += monthList[i];
//        }
//        days += day;
//        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
//            if(month >= 3)
//            days++;
//        }
//        System.out.println("你输入的日期是这一年中的第：" + days + "天。");
//    }
//}

////LeetCode 1.两数之和
//class Solution {
//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] res = new int[2];
//        if (nums == null || nums.length == 0) {
//            return res;
//        }
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int temp = target - nums[i];
//            if (map.containsKey(temp)) {
//                res[1] = i;
//                res[0] = map.get(temp);
//            }
//            map.put(nums[i], i);
//        }
//        return res;
//
//        int[] targetIndex = {0, 0};
//        for (int i = 0; i < nums.length; i++) {
//            int remain = target - nums[i];
//            for (int j = 1; j < nums.length; j++) {
//                if (j != i && nums[j] == remain) {
//                    targetIndex[0] = i;
//                    targetIndex[1] = j;
//                       break;
//                }
//            }
//            if(targetIndex[1] != 0) break;
//        }
//        return targetIndex;
//    }
//
//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(twoSum(new int[]{2,3, 4, 5,2, 0, 6, 7, 8, 9, 0, 0, 12, 13, 141, 5151, 11, 61, 61, 6666623, 636, 364, 56547, -65, 7, -56, -42, -1, 4, 141, 0}, 3)));
//        long endTime = System.currentTimeMillis();
//        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
//    }
//
//}
//
//}

//// 19.不重复的三位数
//public class Solution {
//    public static void printThreeDigitalNumber() {
//        int[] nums = {1, 2};
//        int count = 0;
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                if (i != j)
//                    for (int k = 1; k <= 4; k++) {
//                        if (i != k && j != k) {
//                            System.out.println(i * 100 + j * 10 + k);
//                            count++;
//                        }
//                    }
//            }
//        }
//        System.out.println("There are " + count + " numbers.");
//    }
//
//    public static void main(String[] args) {
//        printThreeDigitalNumber();
//    }
//}

//// 18. 1000以内所有的完全数
////     它所有的真因子（即除了自身以外的约数）的和，恰好等于它本身，完全数不可能是楔形数、平方数、佩尔数或费波那契数。
//public class Solution {
//    public static void printPerfectNumber(int maxValue) {
//        int sum;
//        for (int i = 2; i <= maxValue; i++) {
//            sum = 1;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0)
//                    sum += j;
//            }
//            if (sum == i)
//                System.out.println(i);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Solution.printPerfectNumber(1000);
//    }
//}

//// 17. 9 X 9 口诀表
//public class Solution {
//    public static void print9x9Sheet() {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " x " + j + " = " + i * j + "  ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        print9x9Sheet();
//    }
//}

//// 16. Isosceles Triangle
//public class Solution {
//    public static void printIsoscelesTriangle(int numberOfLine) {
//        for (int i = 1; i <= numberOfLine; i++) {
//            for (int j = 1; j <= numberOfLine - i; j++) {
//                System.out.print(" "); //只管打印前面的空格，
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Solution.printIsoscelesTriangle(20);
//
//    }
//}


//// 14. Prime Numbers
//public class Solution {
//    public static void getPrimeNumbers(int minValue, int maxValue) {
//        int count = 0;
//        boolean signal ;
//
//        for (int i = minValue; i <= maxValue; i++) {
//            signal = true;
//            if (i % 2 == 0 && i != 2 || i == 1) continue;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    signal = false;
//                    break;
//                }
//            }
//            if (signal) {
//                count++;
//                System.out.println(i);
//            }
//        }
//        System.out.println("There are " + count + " prime number between " + minValue + " and " + maxValue);
//    }
//
//    public static void main(String[] args) {
//        Solution.getPrimeNumbers(101, 200);
//    }
//}


//// 13. 水仙花数
//public class Solution {
//    public static void getNarcissisticNumber(int minValue, int maxValue) {
//        for (int i = minValue; i <= maxValue; i++) {
//            int valueOfBaiWei = i / 100;
//            int valueOfShiWei = (i - valueOfBaiWei *100) /10;
//            int valueOfGeWei = (i - valueOfBaiWei *100 - valueOfShiWei * 10);
//
//            if (i == Math.pow(valueOfBaiWei, 3)
//                    + Math.pow(valueOfShiWei, 3)
//                    + Math.pow(valueOfGeWei, 3))
//                System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        getNarcissisticNumber(100,999);
//    }
//}

//12. 星期
//public class Solution {
//    public static void gradeOfScore(int value) {
//        if(value < 0 || value > 100) {
//            System.out.println("输入有误。");
//            return;
//        }
//        value /= 10;
//        switch (value) {
//            case 10:
//            case 9:
//                System.out.println("优");
//                break;
//
//            case 8:
//                System.out.println("良");
//                break;
//
//            case 7:
//                System.out.println("中");
//                break;
//
//            case 6:
//                System.out.println("及格");
//                break;
//
//            default:
//                System.out.println("不及格");
//        }
//    }
//}

// 11. 回文数 解法二
//public class Solution {
//    public static boolean isPalindrome(int x){
//        if (x == 0) return true;
//        if (x < 0 || x % 10 == 0) return false;
//        int reversed = 0;
//        while (x > reversed) {
//            reversed = reversed * 10 + x % 10;
//            x /= 10;
//        }
//        return x == reversed || x == reversed / 10;
//    }
//}

// 11. 回文数 解法一
//public class Solution {
//    public static boolean isPalindrome(String value){
//
//        String reversed = new StringBuffer(value).reverse().toString();
//        return reversed.equals(value);
//
//    }
//}
