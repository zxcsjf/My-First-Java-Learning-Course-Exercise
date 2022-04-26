package com.OOP;

// Encapsulation : Data hiding.
public class Employee {
    // Alt + Enter
    private int baseSalary;
    private int hourlyRate;
    // Static fields
    public static int numberOfEmployee;

    // Static methods
    public static void printNumberOfEmployee() {
        System.out.println(numberOfEmployee);
    }

    // Constructor Same name as class, 不写返回值类型2。
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }

    public Employee(int baseSalary) {
        // Reuse Our Constructor
        this(baseSalary, 0);
    }


    // Abstraction : Implementation hiding.
    public int calculateWage(int extraHours) {
        return (baseSalary + hourlyRate * extraHours);
    }

    // Method overloading
    public int calculateWage(int extraHours, int bonus) {
        return (baseSalary + hourlyRate * extraHours * bonus);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
