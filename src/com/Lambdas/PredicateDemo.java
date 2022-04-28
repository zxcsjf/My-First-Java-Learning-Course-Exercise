package com.Lambdas;

import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void show() {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        // 不要钻牛角尖，信任底层代码
        // 按照申明式编程来写，关心：what to do, 而不是how to do
        System.out.println(hasLeftBrace.and(hasRightBrace).test("{sky}"));
        System.out.println(hasLeftBrace.negate().test("{sky"));
        System.out.println(hasLeftBrace.or(hasRightBrace).test("{sky"));

    }
}
