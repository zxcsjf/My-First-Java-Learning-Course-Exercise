package com.HomeWork50;

class Solution42 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        // System.out.println(Fibo1(45));
        long memory1 = Runtime.getRuntime().freeMemory();
        System.out.println(Fibo2(100_000));
        long memory2 = Runtime.getRuntime().freeMemory();
        long end1 = System.currentTimeMillis();

        System.out.println("消耗内存" + (memory1 - memory2) + "字节。");
        System.out.println("耗时" + (end1 - start1) + "ms");
    }

    // 递归，自顶向下，效率低
    public static long Fibo1(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibo1(n - 1) + Fibo1(n - 2);
    }

    // 循环，自底向上，效率高
    public static long Fibo2(long n) {
        long[] result = {0, 1};
        if (n < 2) {
            return n;
        }
        long first = 0;
        long second = 1;
        long fibn = 0;
        for (long i = 1; i < n; i++){
            fibn = first + second;
            first = second;
            second = fibn;
        }
        return fibn;
    }
}

// class Solution41 {
//     public static void main(String[] args) {
//         System.out.println("请输入一个int数组：");
//         Scanner scanner41 = new Scanner(System.in);
//
//         String[] nums = scanner41.nextLine().split(" ");
//         int[] num = new int[nums.length];
//         for (int i = 0; i < num.length; i++) {
//             num[i] = Integer.valueOf(nums[i]);
//         }
//
//         int max = num[0];
//         int min = num[0];
//         for (int i = 1; i < num.length; i++) {
//             max = max >= num[i] ? max : num[i];
//             min = min <= num[i] ? min : num[i];
//         }
//
//         for (int i = 0; i < num.length; i++) {
//             if (max == num[i]){
//                 int temp = num[0];
//                 num[0] = num[i];
//                 num[i] = temp;
//             }
//
//             if (min == num[i]){
//                 int temp = num[num.length - 1];
//                 num[num.length - 1] = num[i];
//                 num[i] = temp;
//             }
//         }
//
//             System.out.println(Arrays.toString(num));
//     }
// }

// class Solution40 {
//     public static void main(String[] args) {
//         System.out.println("请输入一个正整数：");
//         Scanner scanner40 = new Scanner(System.in);
//         int number = scanner40.nextInt();
//         double sum = 0;
//
//         while (number > 0) {
//             sum += 1.0 / number;
//             number -= 2;
//         }
//
//         System.out.println(sum);
//     }
// }

// class Solution39 {
//     public static void main(String[] args) {
//         int a = 512;
//         int b = 128;
//         System.out.println(a + "和" + b + "最大公约数是" + Gcd(a, b));
//         System.out.println(a + "和" + b + "最小公倍数是" + a * b / Gcd(a, b));
//     }
//
//     public static int Gcd(int a, int b) {
//         return b == 0 ? a : Gcd(b, a % b);
//     }
// }

// class Solution38 {
//     public static void main(String[] args) {
//         System.out.print("请输入1个整数(0~9)：");
//         Scanner scanner380 = new Scanner(System.in);
//         int a = scanner380.nextInt();
//         System.out.print("请再输入1个整数(>0)：");
//         int b = scanner380.nextInt();
//         long sum = 0;
//         int number = 0;
//         for (int i = 0; i < b; i++) {
//             number += (a * Math.pow(10, i));
//             sum += number;
//
//         }
//
//         System.out.println(sum);
//
//     }
// }

// class Solution37 {
//     public static void main(String[] args) {
//         int totalBottle = 0;
//         int bottle;
//         int price = 3;
//         int remainMoney = 20;
//         int moneyOfBottle = 1;
//
//         while (remainMoney >= 3){
//             bottle =  remainMoney / price;
//             totalBottle += bottle;
//             remainMoney = remainMoney % price + bottle * moneyOfBottle;
//         }
//         System.out.println("总共可以喝" + totalBottle + "瓶");
//         System.out.println("还剩" + remainMoney + "元");
//         if (remainMoney == 2){
//             System.out.println("可以再借1元，凑足3元，买一瓶，喝完用瓶子换1元还钱");
//             System.out.println("这样可以喝" + (totalBottle+1) + "瓶。");
//         }
//     }
// }

// class Solution36 {
//     public static void main(String[] args) {
//         int count = 7;
//         while (count > 0) {
//             System.out.print("请输入1个整数（1~50）：");
//             Scanner scanner36 = new Scanner(System.in);
//             int numberOfStar = scanner36.nextInt();
//
//             for (int i = 0; i < numberOfStar; i++) {
//                 System.out.print("*");
//             }
//             count--;
//             System.out.println();
//             System.out.println("还要输入" + count + "次。");
//             System.out.println();
//         }
//     }
// }

// // 末位从四个奇数选一个，4种情况
// // 开头从剩下的非零6个数选一个，6种情况
// // 中间是A66
// class Solution35 {
//     public static void main(String[] args) {
//         int sum = 4 * 6;
//         for (int i = 1; i <= 6; i++) {
//             sum *= i;
//         }
//         System.out.println("符合要求的奇数共有" + sum + "种。");
//     }
// }

// class Solution34 {
//     public static void main(String[] args) {
//         System.out.print("请输入一个大于等于7位的整数： ");
//         Scanner scanner34 = new Scanner(System.in);
//         int number = scanner34.nextInt();
//
//         int b4 = number / 1_000 % 10;
//         int b5 = number / 10_000 % 10;
//         int b6 = number / 100_000 % 10;
//         int b7 = number / 1000_000 % 10;
//
//         System.out.print("这个数右起的4~7位是：");
//         System.out.print(b7);
//         System.out.print(b6);
//         System.out.print(b5);
//         System.out.print(b4);
//     }
// }

// class Solution33 {
// public static void main(String[] args) {
// System.out.println("1~99范围的同构数有：");
// for (int i = 1; i < 10; i++) {
// if (i == i * i % 10) System.out.println(i);
// }
// for (int i = 10; i < 100; i++) {
// int geWei = i * i % 10;
// int shiWei = i * i / 10 % 10;
// if (i == shiWei*10 + geWei) System.out.println(i);
// }
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

// class Solution31 {
// public static void main(String[] args) {
// System.out.print("Please enter a int number：");
// Scanner scanner31 = new Scanner(System.in);
// int number = scanner31.nextInt();
// if (number%2 == 0)
// System.out.println(number + "是偶数。");
// else if(number%2 == 1)
// System.out.println(number + "是奇数。");
// else System.out.println("Invalid number!");
// }
// }

// class Solution30 {
// public static void main(String[] args) {
// System.out.print("Please enter a int number：");
// Scanner scanner30 = new Scanner(System.in);
// int number = scanner30.nextInt();
// int count = 0;
// while (true) {
// if (number % 9 == 0) count++;
// else break;
// number /= 9;
// }
//
// System.out.println("这个数能被" + count + "个9整除。");
// }
// }

// class Solution29 {
// public static void main(String[] args) {
// float h = 200L;
// float sum = 0L;
// int number = 10; // 便于reuse
// for (int i = 1; i <= number; i++) {
// sum += h;
// h /= 2;
// }
// System.out.println("第十次落地共经过" + (sum-100) + "米");
// System.out.println("第十次反弹高度" + h/2 + "米");
// }
// }

// class Solution28 {
// public static void main(String[] args) {
// System.out.println("Please enter 3 Integer for compare: ");
// Scanner scanner281 = new Scanner(System.in);
// int a = scanner281.nextInt();
// Scanner scanner282 = new Scanner(System.in);
// int b = scanner282.nextInt();
// Scanner scanner283 = new Scanner(System.in);
// int c = scanner283.nextInt();
//
// System.out.println("Max is " + ((a >= b && a >= c) ? a : (b >= a && b >= c ? b : c)));
// }
// }

// class Solution27 {
// public static void main(String[] args) {
// System.out.println("Please enter 3 Integer for compare: ");
// Scanner scanner271 = new Scanner(System.in);
// int a = scanner271.nextInt();
// Scanner scanner272 = new Scanner(System.in);
// int b = scanner272.nextInt();
// Scanner scanner273 = new Scanner(System.in);
// int c = scanner273.nextInt();
//
// if (a >= b && a >= c)
// System.out.println("Max is " + a);
// if (b >= a && b >= c)
// System.out.println("Max is " + b);
// if (c >= b && c >= a)
// System.out.println("Max is " + c);
//
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

// class Solution25 {
// public static void main(String[] args) {
// int sum = 0;
// for (int i = 1; i <= 100; i += 2)
// sum += i;
// System.out.println(sum);
// }
// }

// class Solution24 {
// public static void main(String[] args) {
// long sum = 0;
// long fibo = 1;
// int n = 1;
// while (n <= 20) {
// fibo = fibo * n++; // 完成计算通项
// sum = sum + fibo; // 完成求和
// }
// System.out.println(sum);
//// long sum = 0;
//// for (int i = 1; i <= 20; i++)
//// sum+=getFactorial(i);
////
//// System.out.println(sum);
// }
//
//// public static long getFactorial(int value) {
//// long result = 1;
//// for (int i = 1; i <= value; i++)
//// result *= i;
//// return result;
//// }
//
// }

// class Solution23 {
// public static void main(String[] args) {
// int length = 21; // 方便重用代码
// float[] fibo = new float[length];
// fibo[0] = 1F;
// fibo[1] = 2F;
// for (int i = 2; i < length; i++)
// fibo[i] = fibo[i - 2] + fibo[i - 1];
//
// float sum = 0;
// for (int i = 1; i < length; i++) {
// sum += (fibo[i] / fibo[i - 1]);
// }
//
// System.out.println(sum);
// }
// }

// class Solution22 {
// public static void main(String[] args) {
// Scanner scanner22 = new Scanner(System.in);
// String rawInput;
// char[] rawArray;
// while (true) {
// System.out.print("请输入一个不超过五位数: ");
// rawInput = scanner22.nextLine(); // 读入是String
// rawArray = rawInput.toCharArray(); // 后面对数组进行求长、置逆
// if (rawInput.length() > 5) System.out.println("Invalid Number! Please renter!");
// else {
// System.out.println("你输入的是" + rawInput.length() + "位数。");
// break;
// }
// }
//
// int length = rawArray.length;
// char[] reversed = new char[length];
// for (var i = 0; i < length; i++)
// reversed[i] = rawArray[length - i - 1]; // 注意要多减一
//
// System.out.println(reversed);
//
// }
// }

// class Solution21 {
// public static void main(String[] args) {
// for (var n = 1; n <= 100_000; n++) {
//// if (Math.sqrt(n + 100) % 1 == 0 && Math.sqrt(n + 268) % 1 == 0)
// if (isSquare(n + 100) && isSquare(n + 268))
// System.out.println(n);
// }
// }
//
// public static boolean isSquare(int num) {
// double a = 0;
// try {
// a = Math.sqrt(num);
// } catch (Exception e) {
// return false;
// }
// int b = (int) a;
// return a - b == 0;
// }
// }

// class Solution20 {
// public static void main(String[] args) {
// SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy-MM-dd");
// System.out.print("Input date(yyyy-mm-dd): ");
// Scanner scanner = new Scanner(System.in);
// String input = scanner.nextLine();
//
//
// // parse 可能抛出异常, setLentient判断日期格式合法
// try {
// formatDateTime.setLenient(true); // 严格判断日期合法性
// System.out.println(formatDateTime);
// Date date = formatDateTime.parse(input); // 读入的字符串parse成Date对象
// System.out.println(date);
// System.out.printf("你输入的日期是%tC%ty年的第%tj天", date, date, date); //得到日期是在这年的第几天
// } catch (Exception e) {
//// System.out.println("输入日期不合法，请重新输入。");
// e.printStackTrace();
// }
// }
// }

// class Solution {
// public static void main(String[] args) {
// System.out.print("Input date(yyyy-mm-dd): ");
// Scanner scanner = new Scanner(System.in);
// String input = scanner.nextLine();
//
// short year = Short.valueOf(input.substring(0, 4));
// byte month = Byte.valueOf(input.substring(5, 7));
// short day = Short.valueOf(input.substring(8, 10));
// short days = 0;
// byte[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//// 没有实现对输入的日期合法性做判断
// for (byte i = 0; i < month - 1; i++) {
// days += monthList[i];
// }
// days += day;
// if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
// if(month >= 3)
// days++;
// }
// System.out.println("你输入的日期是这一年中的第：" + days + "天。");
// }
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

//// 18. 1000以内所有的完全数
//// 它所有的真因子（即除了自身以外的约数）的和，恰好等于它本身，完全数不可能是楔形数、平方数、佩尔数或费波那契数。
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
//
// }
//
// public static void main(String[] args) {
// Solution.printPerfectNumber(1000);
// }
// }

//// 17. 9 X 9 口诀表
// public class Solution {
// public static void print9x9Sheet() {
// for (int i = 1; i <= 9; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " x " + j + " = " + i * j + " ");
// }
// System.out.println();
// }
// }
//
// public static void main(String[] args) {
// print9x9Sheet();
// }
// }

//// 16. Isosceles Triangle
// public class Solution {
// public static void printIsoscelesTriangle(int numberOfLine) {
// for (int i = 1; i <= numberOfLine; i++) {
// for (int j = 1; j <= numberOfLine - i; j++) {
// System.out.print(" "); //只管打印前面的空格，
// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
//
// public static void main(String[] args) {
// Solution.printIsoscelesTriangle(20);
//
// }
// }

//// 14. Prime Numbers
// public class Solution {
// public static void getPrimeNumbers(int minValue, int maxValue) {
// int count = 0;
// boolean signal ;
//
// for (int i = minValue; i <= maxValue; i++) {
// signal = true;
// if (i % 2 == 0 && i != 2 || i == 1) continue;
// for (int j = 2; j <= Math.sqrt(i); j++) {
// if (i % j == 0) {
// signal = false;
// break;
// }
// }
// if (signal) {
// count++;
// System.out.println(i);
// }
// }
// System.out.println("There are " + count + " prime number between " + minValue + " and " + maxValue);
// }
//
// public static void main(String[] args) {
// Solution.getPrimeNumbers(101, 200);
// }
// }

//// 13. 水仙花数
// public class Solution {
// public static void getNarcissisticNumber(int minValue, int maxValue) {
// for (int i = minValue; i <= maxValue; i++) {
// int valueOfBaiWei = i / 100;
// int valueOfShiWei = (i - valueOfBaiWei *100) /10;
// int valueOfGeWei = (i - valueOfBaiWei *100 - valueOfShiWei * 10);
//
// if (i == Math.pow(valueOfBaiWei, 3)
// + Math.pow(valueOfShiWei, 3)
// + Math.pow(valueOfGeWei, 3))
// System.out.println(i);
// }
// }
//
// public static void main(String[] args) {
// getNarcissisticNumber(100,999);
// }
// }

// 12. 星期
// public class Solution {
// public static void gradeOfScore(int value) {
// if(value < 0 || value > 100) {
// System.out.println("输入有误。");
// return;
// }
// value /= 10;
// switch (value) {
// case 10:
// case 9:
// System.out.println("优");
// break;
//
// case 8:
// System.out.println("良");
// break;
//
// case 7:
// System.out.println("中");
// break;
//
// case 6:
// System.out.println("及格");
// break;
//
// default:
// System.out.println("不及格");
// }
// }
// }

// 11. 回文数 解法二
// public class Solution {
// public static boolean isPalindrome(int x){
// if (x == 0) return true;
// if (x < 0 || x % 10 == 0) return false;
// int reversed = 0;
// while (x > reversed) {
// reversed = reversed * 10 + x % 10;
// x /= 10;
// }
// return x == reversed || x == reversed / 10;
// }
// }

// 11. 回文数 解法一
// public class Solution {
// public static boolean isPalindrome(String value){
//
// String reversed = new StringBuffer(value).reverse().toString();
// return reversed.equals(value);
//
// }
// }
