package com.shanjifei;

import com.OOP.Employee;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        BigDecimal _0_1 = new BigDecimal(0.1);
//        BigDecimal x = _0_1;
//        for(int i = 1; i <= 10; i ++) {
//            System.out.println(i+" x 0.1 is "+x+", as double "+x.doubleValue());
//            x = x.add(_0_1);
//            }
//        int a = 2;
//        int b = 2;
//        int c = 9;
//        System.out.println(a==b?c:(a==c?b:a));

//        String a = "321";
//        int b = Integer.parseInt(a);
//        Scanner scanner10 = new Scanner(System.in);
//
//        int day = scanner10.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            case 7:
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("Please enter a valid number.");
//        }

        byte b1 = 10;
        byte b2 = 20;
        byte b = 0;
//      b = b1 + b2;
        int age = 30;
        long viewCount = 3_123_456_789L;
        float tempeture = 37.6F;
        double price = 19.99;
        char a = 'A';
        boolean isAligible = true;
        long sum = (int) a;
//        byte b1 = (byte)(b + age);

        // reference type
        Date now = new Date();
        now.getTime();

        // String is reference type in java
        String name = "   Shan Jifei";

        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name);

        // Primitive type
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        // Reference type
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "c:\\user\\...";
        System.out.println(message);

        // Arrays
        int[][] numbers = {{1, 2, 3}, {2, 3, 4}};
        System.out.println(Arrays.deepToString(numbers));

        // Consant final
        final float PI = 3.14F;

        // Arithmatic
        double result = (double) 10 / 3;
        System.out.println(result);

        // Casting
        double x7 = 1.1;
        int y1 = (int) x7 + 2;
        System.out.println(y1);

        String x2 = "2.2";
        float y2 = Float.parseFloat(x2) + 2;
        System.out.println(y2);

        // Math class
        int result1 = Math.round(1.1F);
//        Math.ceil();
//        Math.round();
        System.out.println(Math.floorDiv(10, 3));
        long result3 = Math.round(Math.random() * 100);
        System.out.println(result3);

        // Number Format
        //  NumberFormat num = new NumberFormat(); 抽象数据类型，不能实体化
        // 用 factory method
        String result4 = NumberFormat.getPercentInstance().format(0.9);
        System.out.println(result4);

//        // Input
//        // Avoid magic numbers
//        // 不够健壮
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principal: ");
//        int P = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float I = scanner.nextFloat() / MONTHS_IN_YEAR / PERCENT;
//
//        System.out.print("Period(Years): ");
//        int M = scanner.nextByte() * MONTHS_IN_YEAR;
//
//        double Mortage = P * I * Math.pow(1 + I, M) / (Math.pow(1 + I, M) - 1);
//        String mortageFormatted = NumberFormat.getCurrencyInstance().format(Mortage);
//        System.out.println("Mortage: "+ mortageFormatted);

//        // & | ^ ~
//        int a5 = 5;
//        System.out.println(~a5); // 补码按位取反

        // >>>, >>, <<
        // 正整数>>，除以2
        int a6 = 60; // 0011 1100
        int b6 = 2;  // 0000 0001
        System.out.println("移位运算符：");
        System.out.println(a6 >>> 1);
        System.out.println(a6 >> 1);
        System.out.println(a6 << -3); // 验证移位运算周期性
        System.out.println(a6 << 29);
        System.out.println("~a6 = " + ~a6);
        System.out.println(a6 << ~b6 );
        System.out.println(a6 <<(31 - b6));



        // Contrl Flow
        // If Statements

        boolean hasHighIncome = false;
        int income = 120_000;
        if (income > 100_000)
            hasHighIncome = true; //提前设置false，少写一行else
//        hasHighIncome = (income > 100_00);  // 比if语句更简单的方法,但只适合Boolean类型
        System.out.println(hasHighIncome);

        // Ternary operator
        String className = income > 100_000 ? "First" : "Second";

//        // Fizz Buzz
//        System.out.println("Enter a num: ");
//        int num3 = scanner.nextInt();
//
//        if (num3 % 5 == 0 && num3 % 3 == 0)
//            System.out.print("FizzBuzz");
//        else if (num3 % 5 == 0)
//            System.out.println("Fizz");
//        else if (num3 % 3 == 0)
//            System.out.println("Buzz");
//        else System.out.println(num3);

//        // While Loop
//        String input;
//        while (true){
//            System.out.print("enter a number: ");
//            input = scanner.next().toLowerCase();
//
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

        // For-each loop
        String[] fruits = {"Apple", "Orange", "Mango"};
        for (String fruit : fruits)
            System.out.println(fruit);

//        // Strong Mortgage code 增加贷款代码健壮性
//        // Refactor Mortgage code 重构贷款代码
//
//        int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 100_000_000);
//        float annuallyInterest = (float) readNumber("Annual Interest Rate: ", 0, 30);
//        byte years = (byte) readNumber("Period(Years): ", 1, 30);
//        printMortgageSchedule(principal, annuallyInterest, years);
//        printPaymentSchedule(principal, annuallyInterest, years);
//    }
//
//    private static void printMortgageSchedule(int principal, float annuallyInterest, byte years) {
//        double mortgage = calculateMortage(principal, annuallyInterest, years);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println();
//        System.out.println("MORTGAGE");
//        System.out.println("--------");
//        System.out.println("Monthly Payments: " + mortgageFormatted);
//    }
//
//    private static void printPaymentSchedule(int principal, float annuallyInterest, byte years) {
//        System.out.println();
//        System.out.println("PAYMENT SCHEDULE HEADING");
//        System.out.println("------------------------");
//        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
//            double balance = calculateBalance(principal, annuallyInterest, years, month);
//            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
//        }
//    }
//
//    // Refactoring repetitive patterns
//    public static double readNumber(String prompt, int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        double value;
//        while (true) {
//            System.out.print(prompt);
//            value = scanner.nextDouble();
//            if (value >= min && value <= max)
//                break;
//            System.out.println("enter a value between " + min + " and " + max);
//        }
//        return value;
//    }
//
//    // Extract Methods
//    public static double calculateBalance(int principal,
//                                          float annuallyInterest,
//                                          byte years,
//                                          short numberOfPaymentsMade) {
//        // 保留重复的代码片段，因为不想在 Main 方法中重写这段代码
//        float monthlyInterestRate = annuallyInterest / MONTHS_IN_YEAR / PERCENT;
//        int numOfPayments = years * MONTHS_IN_YEAR;
//        double balance = principal
//                * (Math.pow(1 + monthlyInterestRate, numOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
//                / (Math.pow(1 + monthlyInterestRate, numOfPayments) - 1);
//        return balance;
//
//    }
//
//    public static double calculateMortage(int principal,
//                                          float annuallyInterest,
//                                          byte years) {
//        float monthlyInterestRate = annuallyInterest / MONTHS_IN_YEAR / PERCENT;
//        int numOfPayments = years * MONTHS_IN_YEAR;
//
//        return principal * monthlyInterestRate
//                * Math.pow(1 + monthlyInterestRate, numOfPayments)
//                / (Math.pow(1 + monthlyInterestRate, numOfPayments) - 1);
//    }
//
//    final static byte MONTHS_IN_YEAR = 12;
//    final static byte PERCENT = 100;


    }
}