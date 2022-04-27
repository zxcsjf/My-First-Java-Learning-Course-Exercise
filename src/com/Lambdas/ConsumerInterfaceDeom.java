package com.Lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDeom {
    public static void show() {

        List<Integer> list = List.of(1, 2, 3);

        // 1. Imperative programming: if/else, switch/case, while
        //    命令式编程
        for (var item : list)
            System.out.println(item);

        // 2. Declarative Programming
        //    申明式编程
        list.forEach(item -> System.out.println(item));

        // 3. andThen chaining Consumer
        List<String> list2 = List.of("a", "b", "c");
        Consumer<String> print = (item) -> System.out.println(item);
        Consumer<String> printUpperCase = (item) -> System.out.println(item.toUpperCase());

        list2.forEach(print.andThen(printUpperCase));

        // 4. 验证上面的print后的lambda表达式实际上是
        //    print这个object，实现了Consumer接口，
        //    并且override了accept方法
        var print2 = new Print();
        list2.forEach(print2);

    }
}