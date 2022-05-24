package com.HomeWork50;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // /*对于整数字面值常量（包括常量的运算）而言，因为它的值一定不会发生变化，而且整型数据值的位数十分容易判断,
        // 所以编译器能够自动判断整型常量是否在接收数据类型的范围内。
        // 体现在语法上就是：将一个整型字面值（包括常量的运算）赋值给整型时，
        // 如果该常量在整型数据类型的取值范围内，是可以赋值成功的。*/
        // byte b = 1 + 2;
        // int a = 1;
        // byte b2 = a + 2;
        //
        // // byte b = 130;
        // /*byte、short、char使用的时候尤其注意取值范围，若参与运算都会自动提升到int*/
        // // byte b1 = 1, b2 = 2, b;
        // // b = b1 + b2;
        // // char c = b1 + b2;
        // // long d = 111_1111_1111; // 一共11个1
        //
        // /* 1. 只要表达式中存在任一变量，那么表达式的最终结果数据类型就遵循"表达式的类型提升"。
        // * 2. 除此之外，我们可以发现String作为字符串类型，也可以使用" + "在表达式中参与运算，称之为"字符串的拼接"。
        // *    任何表达式一旦有字符串拼接运算，那么结果必然是String类型。
        // * 3. char类型比较特殊，在参与数值类型的计算时，是编码值参与了运算。
        // * */
        // System.out.println('a');
        // System.out.println('a' + 1); // char 转换为int 运算
        // System.out.println("hello" + 'a' + 1); // 拼接成string，拼接
        // System.out.println('a' + 1 + "hello"); // char 转换为int 运算， 拼接成string
        // System.out.println("5 + 5 = " + 5 + 5); // 两个 + 都是拼接
        // System.out.println(5 + 5 + " = 5 + 5"); // 第一个 + 是运算，后一个 + 是拼接
        // System.out.println(5 + 5.0);
        // System.out.println(5 + "5" + 5.0); // 拼接
        //
        // var npy1 = new GirlFriend(23, 8000, 3, 90);
        // System.out.println(npy1.canWeMarry());
        // System.out.printf("%x");
        // Solution.printPerfectNumber(1_000);

        //// 15
        // double a = 0;
        // a = 10 / 3.0;
        // System.out.println(a);
        //
        // int b = 0;
        // b = 10 / 3;
        // System.out.println(b);

        // 14 prime number
        // Solution.getPrimeNumbers(101, 200);

        // 13
        // Solution.getNarcissisticNumber(100,999);

        // 12
        // Solution.gradeOfScore(90);

        // 11
        // System.out.println(Solution.isPalindrome(123454321));
        // System.out.println(Solution.isPalindrome("123456789999999987654321"));

        // Scanner scanner10 = new Scanner(System.in);
        //
        // int day = scanner10.nextInt();
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

    }
}
