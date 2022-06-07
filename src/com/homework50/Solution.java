package com.homework50;

// class Solution50 {
// public static void main(String[] args) {
// int a = -1234;
//
// System.out.println(abs1(a));
// System.out.println(abs2(a));
//
// a = 1234;
//
// System.out.println(abs1(a));
// System.out.println(abs2(a));
// }
//
// public static int abs1(int a) {
// int i = a >> 31;
// return i == 0 ? a : ~a + 1;
// }
//
// public static int abs2(int a) {
// int i = a >> 31;
// return (a ^ i) - i;
// }
// }

//
// class Solution47 {
// public static void main(String[] args) {
// int[] array = {0, 1, 2, 5, 8};
//
// for (int number : add(array, 6)) {
// System.out.println(number);
// }
// }
//
// private static int[] add(int[] array, int a) {
// int[] result = new int[array.length + 1];
//
// for (int i = 0; i < array.length; i++) {
// if (array[i] <= a) {
// result[i] = array[i];
// }
// if (array[i] <= a && array[i + 1] > a) {
// result[i + 1] = a;
// } else if (array[i] > a) {
// result[i + 1] = array[i];
// }
// }
// return result;
// }
// }



// class Solution45 {
// public static void main(String[] args) {
// System.out.println(factorial(5));
// }
//
// public static int factorial(int n) {
// if (n == 1) {
// return 1;
// }
// return n * factorial(n - 1);
// }
// }

// // 三层循环，条件判断排除，char参与运算的是编码值
// class Solution44 {
// public static void main(String[] args) {
// for (char i = 'x'; i <= 'z'; i++) {
// for (char j = 'x'; j <= 'z'; j++) {
// if (i != j) // 减少比较次数
// for (char k = 'x'; k <= 'z'; k++) {
// if (k != i && k != j)
// if (i != 'x' && k != 'x' && k != 'z') {
// System.out.println("a和" + i + "比");
// System.out.println("b和" + j + "比");
// System.out.println("c和" + k + "比");
// }
// }
// }
// }
// }
// }

// class Solution43 {
// public static void main(String[] args) {
// int peach = 1;
// for (int i = 1; i < 10; i++) {
// peach = (peach + 1) * 2;
// }
// System.out.println("一开始共有" + peach + "个桃子。");
// }
// }






// class Solution39 {
// public static void main(String[] args) {
// int a = 1024;
// int b = 128;
// System.out.println(a + "和" + b + "最大公约数是" + gcd(a, b));
// System.out.println(a + "和" + b + "最小公倍数是" + a * b / gcd(a, b));
// }
//
// public static int gcd(int a, int b) {
// return b == 0 ? a : gcd(b, a % b);
// }
// }

// class Solution38 {
// public static void main(String[] args) {
// System.out.print("请输入1个整数(0~9)：");
// Scanner scanner380 = new Scanner(System.in);
// int a = scanner380.nextInt();
// System.out.print("请再输入1个整数(>0)：");
// int b = scanner380.nextInt();
//
// long sum = 0;
// int number = 0;
// for (int i = 0; i < b; i++) {
// number += (a * Math.pow(10, i));
// sum += number;
// }
//
// System.out.println(sum);
// }
// }



// class Solution36 {
// public static void main(String[] args) {
// int count = 7;
// while (count > 0) {
// System.out.print("请输入1个整数（1~50）：");
// Scanner scanner36 = new Scanner(System.in);
// int numberOfStar = scanner36.nextInt();
//
// for (int i = 0; i < numberOfStar; i++) {
// System.out.print("*");
// }
// count--;
// System.out.println();
// System.out.println("还要输入" + count + "次。");
// System.out.println();
// }
// }
// }

// // 末位从四个奇数选一个，4种情况
// // 开头从剩下的非零6个数选一个，6种情况
// // 中间是A66
// class Solution35 {
// public static void main(String[] args) {
// int sum = 4 * 6;
// for (int i = 1; i <= 6; i++) {
// sum *= i;
// }
// System.out.println("符合要求的奇数共有" + sum + "种。");
// }
// }

// class Solution34 {
// public static void main(String[] args) {
// System.out.print("请输入一个大于等于7位的整数： ");
// Scanner scanner34 = new Scanner(System.in);
// int number = scanner34.nextInt();
//
// int b4 = number / 1_000 % 10;
// int b5 = number / 10_000 % 10;
// int b6 = number / 100_000 % 10;
// int b7 = number / 1000_000 % 10;
//
// System.out.print("这个数右起的4~7位是：");
// System.out.print(b7);
// System.out.print(b6);
// System.out.print(b5);
// System.out.print(b4);
// }
// }



// class Solution32 {
// public static void main(String[] args) {
// System.out.print("Please input a 4 digits int number: ");
// Scanner scanner31 = new Scanner(System.in);
// int number = scanner31.nextInt();
//
// int qianWei = number / 1_000;
// int baiWei = (number - qianWei * 1000) / 100;
// int shiWei = (number - qianWei * 1000 - baiWei * 100) / 10;
// int geWei = (number - qianWei * 1000 - baiWei * 100 - shiWei * 10);
//
// int newGeWei = (qianWei + 5) % 10;
// int newShiWei = (baiWei + 5) % 10;
// int newBaiWei = (shiWei + 5) % 10;
// int newQianWei = (geWei + 5) % 10;
//
// System.out.println(newQianWei * 1000 + newBaiWei * 100 + newShiWei * 10 + newGeWei);
// }
// }











// class Solution26 {
// public static void main(String[] args) {
// while (true) {
// System.out.print("Please enter the first character of the day: ");
// Scanner scanner26 = new Scanner(System.in);
// String string26 = scanner26.nextLine();
// if (string26.toLowerCase().equals("m"))
// System.out.println("You mean Monday");
// else if (string26.toLowerCase().equals("w"))
// System.out.println("You mean Wednesday");
// else if (string26.toLowerCase().equals("f"))
// System.out.println("You mean Friday");
// else if (string26.toLowerCase().equals("t")) {
// System.out.print("Please enter the second character of the day: ");
// Scanner scanner260 = new Scanner(System.in);
// String string261 = scanner260.nextLine();
// if (string261.toLowerCase().equals("u"))
// System.out.println("You mean Tuesday");
// else if(string261.toLowerCase().equals("h"))
// System.out.println("You mean Thursday");
// else System.out.println("Invalid input!");
// } else if (string26.toLowerCase().equals("s")) {
// System.out.print("Please enter the second character of the day: ");
// Scanner scanner262 = new Scanner(System.in);
// String string262 = scanner262.nextLine();
// if (string262.toLowerCase().equals("a"))
// System.out.println("You mean Saturday");
// else if(string262.toLowerCase().equals("u"))
// System.out.println("You mean Sunday");
// else System.out.println("Invalid input!");
// }else if (string26.toLowerCase().equals("exit")) break; // end while.
// else System.out.println("Invalid input!");
// }
// }
// }



// class Solution241 {
// public static void main(String[] args) {
// int max = 20;
// long sum = 0;
// for (int i = 1; i <= max; i++) {
// sum += getFactorial(i);
// }
//
// System.out.println(sum);
// }
//




// class Solution11 {
//     public static void main(String[] args) {
//         int length = 21; // 方便重用代码
//         double[] fibo = new double[length];
//         fibo[0] = 1.0;
//         fibo[1] = 2.0;
//
//         for (int i = 2; i < length; i++) {
//             fibo[i] = fibo[i - 2] + fibo[i - 1];
//         }
//
//         double sum = 0;
//         for (int i = 1; i < length; i++) {
//             sum += (fibo[i] / fibo[i - 1]);
//         }
//
//         System.out.println(sum);
//     }
// }

// class Solution10 {
// public static void main(String[] args) {
// System.out.print("请输入一个正整数: ");
// Scanner scanner10 = new Scanner(System.in);
// String inputString = scanner10.nextLine(); // 读入是String
// char[] inputArray = inputString.toCharArray(); // 后面对数组进行求长、置逆
//
// System.out.println("你输入的是" + inputString.length() + "位数。");
//
// int length = inputArray.length;
// char[] reversed = new char[length];
// for (var i = 0; i < length; i++)
// reversed[i] = inputArray[length - i - 1]; // 注意要多减一
//
// System.out.print("逆序输出的结果是：");
// System.out.println(reversed);
//
// }
// }



// class Solution20 {
//     public static void main(String[] args) {
//         SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy-MM-dd");
//         System.out.print("Input date(yyyy-mm-dd): ");
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//
//
// // parse 可能抛出异常, setLentient判断日期格式合法
//         try {
//             formatDateTime.setLenient(true); // 严格判断日期合法性
//             System.out.println(formatDateTime);
//             Date date = formatDateTime.parse(input); // 读入的字符串parse成Date对象
//             System.out.println(date);
//             System.out.printf("你输入的日期是%tC%ty年的第%tj天", date, date, date); //得到日期是在这年的第几天
//         } catch (Exception e) {
// // System.out.println("输入日期不合法，请重新输入。");
//             e.printStackTrace();
//         }
//     }
// }
//
// import java.util.Scanner;
//
// class Solution {
//     public static void main(String[] args) {
//         System.out.print("Input date(yyyy-mm-dd): ");
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//
//         int year = Short.valueOf(input.substring(0, 4));
//         int month = Byte.valueOf(input.substring(5, 7));
//         int day = Short.valueOf(input.substring(8, 10));
//         int days = 0;
//         int[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
// // 没有实现对输入的日期合法性做判断
//         for (int i = 0; i < month - 1; i++) {
//             days += monthList[i];
//         }
//         days += day;
//         if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
//             if (month >= 3)
//                 days++;
//         }
//         System.out.println("你输入的日期是这一年中的第：" + days + "天。");
//     }
// }

//// LeetCode 1.两数之和
// class Solution {
// public static int[] twoSum(int[] nums, int target) {
//
// int[] res = new int[2];
// if (nums == null || nums.length == 0) {
// return res;
// }
// HashMap<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < nums.length; i++) {
// int temp = target - nums[i];
// if (map.containsKey(temp)) {
// res[1] = i;
// res[0] = map.get(temp);
// }
// map.put(nums[i], i);
// }
// return res;
//
// int[] targetIndex = {0, 0};
// for (int i = 0; i < nums.length; i++) {
// int remain = target - nums[i];
// for (int j = 1; j < nums.length; j++) {
// if (j != i && nums[j] == remain) {
// targetIndex[0] = i;
// targetIndex[1] = j;
// break;
// }
// }
// if(targetIndex[1] != 0) break;
// }
// return targetIndex;
// }
//
// public static void main(String[] args) {
// long startTime = System.currentTimeMillis();
// System.out.println(Arrays.toString(twoSum(new int[]{2,3, 4, 5,2, 0, 6, 7, 8, 9, 0, 0, 12, 13, 141, 5151, 11, 61, 61,
//// 6666623, 636, 364, 56547, -65, 7, -56, -42, -1, 4, 141, 0}, 3)));
// long endTime = System.currentTimeMillis();
// System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
// }
//
// }
//
// }

//// 19.不重复的三位数
// public class Solution {
// public static void printThreeDigitalNumber() {
// int[] nums = {1, 2};
// int count = 0;
// for (int i = 1; i <= 4; i++) {
// for (int j = 1; j <= 4; j++) {
// if (i != j)
// for (int k = 1; k <= 4; k++) {
// if (i != k && j != k) {
// System.out.println(i * 100 + j * 10 + k);
// count++;
// }
// }
// }
// }
// System.out.println("There are " + count + " numbers.");
// }
//
// public static void main(String[] args) {
// printThreeDigitalNumber();
// }
// }

// // 18. 1000以内所有的完全数
// // 它所有的真因子（即除了自身以外的约数）的和，恰好等于它本身，
// // 完全数不可能是楔形数、平方数、佩尔数或费波那契数。
// public class Solution {
// public static void printPerfectNumber(int maxValue) {
// int sum;
// for (int i = 2; i <= maxValue; i++) {
// sum = 1;
// for (int j = 2; j < i; j++) {
// if (i % j == 0)
// sum += j;
// }
// if (sum == i)
// System.out.println(i);
// }
// }
//
// public static void main(String[] args) {
// Solution.printPerfectNumber(1000);
// }
// }

// 17. 9 X 9 口诀表
public class Solution {
    public static void print9x9Sheet() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " x " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print9x9Sheet();
    }
}

// // 6. Isosceles Triangle
// class Solution {
// public static void main(String[] args) {
// Solution.printIsoscelesTriangle(10);
// }
//
// public static void printIsoscelesTriangle(int numberOfLine) {
// for (int i = 1; i <= numberOfLine; i++) {
// for (int j = 1; j <= numberOfLine - i; j++) {
// System.out.print(" "); // 只管打印前面的空格，
// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }


// // 4. 水仙花数
// class Solution4 {
// public static void main(String[] args) {
// getNarcissisticNumber(100, 999);
// }
//
// public static void getNarcissisticNumber(int minValue, int maxValue) {
// for (int i = minValue; i <= maxValue; i++) {
// int geWei = i % 10;
// int shiWei = i % 100 / 10;
// int baiWei = i % 1000 / 100;
//
// if (i == Math.pow(baiWei, 3) + Math.pow(shiWei, 3) + Math.pow(geWei, 3))
// System.out.println(i);
// }
// }
// }
// int valueOfBaiWei = i / 100;
// int valueOfShiWei = (i - valueOfBaiWei * 100) / 10;
// int valueOfGeWei = (i - valueOfBaiWei * 100 - valueOfShiWei * 10);
// if (i == Math.pow(valueOfBaiWei, 3) + Math.pow(valueOfShiWei, 3) + Math.pow(valueOfGeWei, 3))

// 12. 星期
// class Solution2 {
// public static void main(String[] args) {
// System.out.print("Please enter a num(1~7): ");
// Scanner scanner2 = new Scanner(System.in);
//
// int day = scanner2.nextInt();
// switch (day) {
// case 1:
// System.out.println("Monday");
// break;
//
// case 2:
// System.out.println("Tuesday");
// break;
//
// case 3:
// System.out.println("Wednesday");
// break;
//
// case 4:
// System.out.println("Thursday");
// break;
//
// case 5:
// System.out.println("Friday");
// break;
//
// case 6:
// System.out.println("Saturday");
// break;
//
// case 7:
// System.out.println("Sunday");
// break;
//
// default:
// System.out.println("Please enter a valid number.");
// }
// }
// }

// class Solution3 {
// public static void main(String[] args) {
// gradeOfScore(100);
// }
// public static void gradeOfScore(int value) {
// if (value < 0 || value > 100) {
// System.out.println("输入有误。");
// return;
// }
//
// value /= 10;
// if (value == 9 || value == 10) {
// System.out.println("优秀");
// } else if (value == 8) {
// System.out.println("良好");
// } else if (value == 7) {
// System.out.println("中等");
// } else if (value == 6) {
// System.out.println("及格");
// } else {
// System.out.println("不及格");
// }
// // switch (value) {
// // case 10:
// // case 9:
// // System.out.println("优");
// // break;
// //
// // case 8:
// // System.out.println("良");
// // break;
// //
// // case 7:
// // System.out.println("中");
// // break;
// //
// // case 6:
// // System.out.println("及格");
// // break;
// //
// // default:
// // System.out.println("不及格");
// // }
// }
// }

// // 11. 回文数 解法二
// class Solution111 {
// public static void main(String[] args) {
// int count = 0;
// for (int i = 10_000; i < 99999; i++) {
// if (isPalindrome(i)) {
// count++;
// System.out.print(i + " ");
// if (count % 10 == 0)
// System.out.println();
// }
// }
// System.out.println();
// System.out.println("五位回文数共有" + count + "个。");
// }
//
// // LeetCode上学到的解法，增加判断
// public static boolean isPalindrome(int x) {
// if (x == 0)
// return true;
// if (x < 0 || x % 10 == 0)
// return false;
//
// int reversed = 0;
// while (x > reversed) {
// reversed = reversed * 10 + x % 10;
// x /= 10;
// }
// return x == reversed || x == reversed / 10;
// }
// }
//
// // 11. 回文数 解法一
// class Solution110 {
// // 可对任意长度字符串置逆
// public static boolean isPalindrome(String value) {
// String reversed = new StringBuffer(value).reverse().toString();
// return reversed.equals(value);
// }
// }

// class Solution11 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// sc.nextInt();
// sc.nextLine();
// }
// }

// class Solution10 {
// public static void main(String[] args) {
// int a = 1;
// System.out.println(a + "hello");
// }
// }

// class Solution8 {
// public static void main(String[] args) {
// float a = 0.1F;
// double b = 0.1;
// System.out.println(a == b);
// System.out.println(b);
// }
// }