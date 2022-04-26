package com.Collections;

import java.util.*;

public class SetDemo {
    public static void show() {
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("sky");

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("a");
        queue.offer("b+");

        // Put a collection in a Set
        Set<String> set = new HashSet<>(queue);
        System.out.println(set);

        // Set Operation
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "p", "g"));
        Set<String> set2 = new HashSet<>(Arrays.asList("4", ".", "3", "p"));
        // Union
        set1.addAll(set2);
        // Intersection 返回交集
        set1.retainAll(set2);
        // Difference 保留差异，去掉相同
        set1.removeAll(set2);

        System.out.println(set1);

    }
}