package com.Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryUnaryOperatorDemo {
    public static void show() {
        // (a, b) -> a + b -> square
        BinaryOperator<Integer> add = (a, b) -> a + b;
        UnaryOperator<Integer> square = a -> a*a;

        System.out.println(add.andThen(square).apply(1,2));
    }
}
