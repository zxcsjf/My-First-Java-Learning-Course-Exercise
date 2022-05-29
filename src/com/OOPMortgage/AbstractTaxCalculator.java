package com.OOPMortgage;

public abstract class AbstractTaxCalculator implements TaxCalculator{
    protected static double getTaxableIncome(
            double income,
            double expenses ){
        return income - expenses;
    }
}
