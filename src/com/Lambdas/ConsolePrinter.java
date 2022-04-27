package com.Lambdas;

// Sometime Not need to reuse this class
// So not need to create this class.
// Use Anonymous class !
public class ConsolePrinter implements Printer{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
