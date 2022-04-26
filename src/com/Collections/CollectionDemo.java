package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show() {
        // NOT var
        // For Programming against Interface, more Loosely couple.
        Collection<String> collection = new ArrayList<>();

        // object of ArrayList<Object>()
        // NOT Collection<E> interface.
        var collection2 = new ArrayList<>();

        collection.add("hello");
        collection.add(" world.");
        Collections.addAll(collection, "a", "b", "c", "hi!");
        boolean containsA = collection.contains("b");

        Object[] objectArray = collection.toArray() ;
        String[] stringArray = collection.toArray(new String[0]);

        stringArray[0].toUpperCase();

        System.out.println(stringArray[0]);
        collection2.addAll(collection);
        System.out.println(collection.equals(collection2));
    }
}
