package com.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // 命令式编程 Imperative Programming
        // how to do
        int count = 0;
        for (var movie : movies)
            if (movie.getLikes() > 10)
                count++;
        System.out.println(count);

        // 申明式编程 Declarative(Function) Programming
        // stream says what to do
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(count2);

        // 1. 创建流
        Collection<Integer> x = List.of(1, 2, 3, 4, 5);
        x.stream()
                .forEach(n -> System.out.println(n));

        var list1 = new ArrayList<Double>(2);
        list1.add(0, (double) 2);
        list1.add(1, (double) 9);
        list1.stream()
                .forEach(n -> System.out.println(n));

        int[] numbers1 = {1, 2, 3};
        Arrays.stream(numbers1).forEach(n -> System.out.println(n));

        Stream.of(1, 2, 3, 4);

        // Lazy evaluation
        var stream2 = Stream.generate(() -> Math.random());
        stream2.limit(10)
                .forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));

        // 2. 映射 mapping stream
        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(n -> System.out.println(n));
        // Stream<List<x>> -> Stream<x>
        var stream3 = Stream.of(List.of(1, 2, 3), Set.of(4, 5, 6));
        stream3
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));

        // Filter
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));

        // Slicing


    }
}
