package com.Exceptions;

import java.io.IOException;

public class ExceptionDemo {

    public static void show() throws AccountException {
        Account account = new Account();
        try {
            account.deposit(10);
            account.withdraw(10);
        } catch (AccountException | IllegalArgumentException e) {
            System.out.println(e.getCause());
        }
//        try {
//            account.deposit(-100);
//        } catch (IllegalArgumentException e) {
//            System.out.println("logging...");
//            throw e; // Rethrowing Exception
//        }
    }

//    public static void show(){
//        sayHello("Shanjifei");
//    }
//
//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
}
