package com.OOP;

public class Main {
    public static void main(String[] args) {
        // OOP Encapsulation
        Employee employee = new Employee(50_000, 50);
        Employee employee2 = new Employee(50_000);

        int wage1 = employee.calculateWage(30);
        System.out.println(wage1);
        int wage2 = employee2.calculateWage(30);
        System.out.println(wage2);

        System.out.println(Employee.numberOfEmployee);
        Employee.printNumberOfEmployee();

    }
}
