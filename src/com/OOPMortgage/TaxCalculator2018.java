package com.OOPMortgage;

public class TaxCalculator2018 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax() {
        getTaxableIncome(100, 60);
        return taxableIncome * 0.3; // 改变具体实施方式时，TaxReport不用重新编译
    }
}
