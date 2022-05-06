package com.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.COMEDY),
                new Movie("b", 40, Genre.ACTION),
                new Movie("a", 10, Genre.COMEDY),
                new Movie("c", 15, Genre.THRILLER)


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

        // 1. 产生流的两种方法： generate iterate
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

        // 3. Filter
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));

        // 4. Slicing
        //     limit() skip() paginate data
        // 1000 movies
        // 10 movies per page
        // 3rd page
        // skip(20) = skip( (page - 1) * pageSize)
        // limit(10) = limit(pageSize)
        movies.stream()
                .skip(20)
                .limit(10)
                .forEach(m -> System.out.println(m.getTitle()));

        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 30 )
                .forEach(movie -> System.out.println(movie.getTitle()));

        // 5. sort
        movies.stream()
//                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))  // 3 way is same
//                .sorted(Comparator.comparing(m -> m.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));

        // 6. Unique item
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(m -> System.out.println(m));

        // 7. Peek 检查
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);

        // 8. Reducers
         movies.stream()
                .findAny()
                .ifPresent(m -> System.out.println(m.getTitle()));
//                .get()
//                .findFirst() // optional
//                .max(Comparator.comparing(Movie::getLikes))
//
//                .noneMatch()
//                .allMatch(m -> m.getLikes() > 20)
//                .anyMatch(m -> m.getLikes() > 20)

        // 9. Reducing a Stream
        Optional<Integer> sum = movies.stream()
                .filter(movie -> movie.getLikes() > 100)
                .map(movie -> movie.getLikes())
                .reduce(Integer::sum);

        System.out.println(sum);

        Integer sum2 = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce(0, Integer::sum);

        System.out.println(sum2);

        // 10. Collectors 收集流元素 -> 数据结构
        var result10 = movies.stream()
                             .filter(m -> m.getLikes() > 10)
//                             .collect(Collectors.summarizingInt(Movie::getLikes)); // 1.
//                             .collect(Collectors.toMap(Movie::getTitle, Function.identity())); // 2.
                               .map(Movie::getTitle) // 3. 用分隔符连接值的收集器 Collectors.joining()
                                .collect(Collectors.joining(", "));
        System.out.println("result3: " + result10);

        // 11. Grouping Elements 分组
        var result11 = movies.stream()
                // Downstream: Collector accepting a second Collector as an argument.
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
//                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
//                .collect(Collectors.groupingBy(movie -> movie.getGenre()));

        System.out.println(result11);

        // 12. Partitioning 分类
        var result12 = movies.stream()
                    .collect(Collectors.partitioningBy(m -> m.getLikes() > 20,
                            Collectors.mapping(Movie::getTitle,
                                                Collectors.joining(", "))));

        System.out.println(result12);

        // 13. Primitive Type Stream
        IntStream.generate(() -> (int)(Math.random() * 1000))
                .limit(10)
                .flatMap(y -> IntStream.of(y + 1000))
                .skip(5)
                .sorted()
                .forEach(System.out::println);

    }
}
