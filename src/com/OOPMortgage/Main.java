package com.OOPMortgage;

public class Main {

    public static void main(String[] args) {

        TaxCalculator2018 calculator = new TaxCalculator2018(20_000);
//        TaxReport texReport = new TaxReport(calculator); // 1.Constructor 注入
//        texReport.show();
//
//        // 2.Setters Injection 可以在运行时改变依赖。
//        texReport.setCalculator(new TaxCalculator2019(20_000));
//        texReport.show();

        // 3.Method Injection
        // 3.1不在新建report时传入calculator，而是在show()传入
        // 3.2也不用setter改变注入，直接在show()new一个新的注入
        TaxReport report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019(20_000));

//        TextBox box1 = new TextBox();
//
//        box1.setText("Hello World!");
//        System.out.println(box1);
//
//        // Polymorphism 多态性例子
//        UIControl[] controls = {  new TextBox(), new CheckBox()};
//        for (UIControl control : controls)
//            control.render();

//        Point point1 = new Point(1, 2);
//        Point point2 = new Point(1, 2);


//        // Strong Mortgage code 增加贷款代码健壮性
//        // Refactor Mortgage code 重构贷款代码
//        // 使用封装和抽象技术以后的贷款计算器
//        int principal = (int) Console.readNumber("Principal ($1K - $1M): ", 1_000, 100_000_000);
//        float annuallyInterest = (float) Console.readNumber("Annual Interest Rate: ", 0, 30);
//        byte years = (byte) Console.readNumber("Period(Years): ", 1, 30);
//
//        MortgageCalculator calculator = new MortgageCalculator(principal, annuallyInterest, years);
//
//        MortgageReport report = new MortgageReport(calculator);
//        report.printMortgageSchedule();
//        report.printPaymentSchedule();
    }


}

