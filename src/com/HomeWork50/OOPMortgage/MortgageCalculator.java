package com.HomeWork50.OOPMortgage;

// 8.这个类完全不关心如何展示数据，只关心计算。
public class MortgageCalculator {
    // 6.计算用的数据，从主函数移出来
    final private static byte MONTHS_IN_YEAR = 12;
    final private static byte PERCENT = 100;
    // 2.使用封装思想，data
    private int principal;
    private float annuallyInterest;
    private byte years;

    // 5.Constructor : Code -> Generate
    public MortgageCalculator(int principal, float annuallyInterest, byte years) {
        this.principal = principal;
        this.annuallyInterest = annuallyInterest;
        this.years = years;
    }

    // 1.Extract Methods
    // 3.Change signature
    // 4.delete static keyword
    public double calculateBalance(short numberOfPaymentsMade) {
        // 保留重复的代码片段，因为不想在 Main 方法中重写这段代码
        float monthlyInterestRate = getMonthlyInterestRate();
        int numOfPayments = getNumOfPayments();
        double balance = principal
                * (Math.pow(1 + monthlyInterestRate, numOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numOfPayments) - 1);
        return balance;

    }

    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        int numOfPayments = getNumOfPayments();

        return principal * monthlyInterestRate
                * Math.pow(1 + monthlyInterestRate, numOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numOfPayments) - 1);
    }
//8. 把计算剩余贷款的逻辑移到Calculator class中.
    public double[] getRemainingBalance() {
        double[] balance = new double[getNumOfPayments()];
        for (short month = 1; month <= balance.length; month++)
            // 5. calculateBalance不是静态方法，改为calculator.对象
            balance[ month - 1] =  calculateBalance(month);
        return balance;
    }

    // 7.Extract method 提取出getters
    private int getNumOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterestRate() {
        return annuallyInterest / MONTHS_IN_YEAR / PERCENT;
    }
}
