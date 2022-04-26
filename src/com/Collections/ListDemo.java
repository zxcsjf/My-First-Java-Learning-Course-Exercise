package com.Collections;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        // List<E> interface
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "c", "a");

        list.set(0, "a+");
        list.remove("c");

        System.out.println(list.subList(0, 2));

    }
}
