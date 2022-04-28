package com.Lambdas;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void show() {
        Function<String, Integer> map = str -> str.length();

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        String temp = replaceColon.apply("value:sky");
        var fin = addBraces.apply(temp);
        System.out.println(fin);

        // 申明式编程 Declaration programming
        // 不说how to do，只说what needs to be done.
        var res = replaceColon.
                andThen(addBraces).
                apply("value::sky");
        System.out.println(res);
        // 底层逻辑是：
        System.out.println(addBraces.apply(replaceColon.apply("value:::sky")));

        // compose method, reverse
        var result = addBraces.
                compose(replaceColon).
                apply("value:sky");
        System.out.println(result);

    }

}
