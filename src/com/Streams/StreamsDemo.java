package com.Streams;

import java.util.List;

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
    }
}
