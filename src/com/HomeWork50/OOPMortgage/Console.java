package com.HomeWork50.OOPMortgage;

import java.util.Scanner;

public class Console {


    // Refactoring repetitive patterns
    public static double readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("enter a value between " + min + " and " + max);
        }
        return value;
    }


}
