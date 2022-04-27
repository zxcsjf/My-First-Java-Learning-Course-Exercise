package com.Lambdas;

public class LambdasDemo {


    public LambdasDemo(String message) {
    }

    private static void print(String message) {
        System.out.println(message);
    }

    // 5. delete static, make it an instance field.
    private  String prefix = "-";

    // 5. delete static, make it an instance method.
    public static void show() {
//        // 10. lambda expression use to constructor.
//        //    method reference:: use to constructor.
//            greet(message -> new LambdasDemo(message));

//        // 9. lambda expression use to instance.
//        //    method reference:: use to instance.
//        var demo = new LambdasDemo();
//        greet(message -> demo.print(message));
//        greet(demo::print);

//        // 8. lambda expression:
//        //      passing a parameter to an existing method(static/instance)
//        greet(message -> print(message));
//        greet(LambdasDemo::print);

//        // 7. Method Reference ::
        greet(System.out::println);
//
        String postfix = "+";
//        // 4. lambda expression are objects !
//        //    but can be used to represent anonymous function.
//        Printer printer = message -> System.out.println(message);
//        greet(printer);
//
//        // 3. Lambda expression as an argument to method.
//        //     need ( 0 or >= 2 parameters) -> { multi expression }
//        // 5. lambda expression: this reference enclosing object
//        // 6. can access local variable declared in the closing object
//        //    and static/ instance field in the closing class.
//        greet(message -> System.out.println( this.prefix + message + postfix));
//
//        // 2. Use Anonymous Inner class, but Ugly
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//             // 5.  this. reference the current instance of anonymous匿名 inner class.
//             // 5. but anonymous class can have state, fields
//            }
//        });
//
//        // 1. Not want to create a new class ConsolePrinter.
//        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("hello world!");
    }
}
