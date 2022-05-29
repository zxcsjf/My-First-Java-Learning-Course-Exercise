package com.OOPMortgage;

import java.text.NumberFormat;

// 7.只关心用一个calculator，打印表单。
public class MortgageReport {

    // 10. 用NumberFormat.getCurrencyInstance()，实体化一个对象currency，作为class的一个field,可以在两个地方重用。
    // 并且IDEA默认是final，一旦建立，不能更改
    private final NumberFormat currency;

    // 1.不希望每个贷款报告只有一个计算器，所以删去static关键字，成为instance field.
    private MortgageCalculator calculator;

    // 6.用Constructor初始化calculator。
    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }
    // 4.改签名，但是注意years，在public class MortgageCalculator中用过years，创一个getters, 获取年份。
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE HEADING");
        System.out.println("------------------------");
// 8. 用getRemainingBalance() 返回balance数组，把计算逻辑放到 MortgageCalculator. 这种封装思想
        for (double balance : calculator.getRemainingBalance())
            System.out.println(currency.format(balance));
// 9. 可以安全的删去getYears，把计算器中的fields改为private

//        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
//            // 5. calculateBalance不是静态方法，改为calculator.对象
//            double balance = calculator.calculateBalance(month);
//            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
//        }
    }

    // 2.删去static关键字，方法可以调用calculator
    // 3.改签名，删去(principal, annuallyInterest, years)
    public void printMortgageSchedule() {
//        初始化calculator，已经在field中做过了，所以删去。
//        calculator = new MortgageCalculator(principal, annuallyInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
