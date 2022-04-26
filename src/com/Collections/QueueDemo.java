package com.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.offer("b+");
        queue.offer("c");

//        var front1 = queue.peek(); // return the first element or null.
//        var front2 = queue.element(); // return the first element or throw an exception.

        var front3 = queue.poll();  // delete the first element and return, when empty, return null.
        var front4 = queue.remove(); // delete the first element and return, when empty, throw an exception.

        System.out.println(queue);
    }
}
