package com.OOPMortgage;

public class TaxReport {
//    private TaxCalculator calculator;

    // 1.建造器注入
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
//
//    public void show(){
//        double tax = calculator.calculateTax();
//        System.out.println(tax);
//    }

    // 3. Method 注入
    public void show(TaxCalculator calculator){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // 2. setter注入
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
