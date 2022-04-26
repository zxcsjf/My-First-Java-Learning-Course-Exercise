package com.Generics;

public class KeyValuePairs<T, V> {
    private T key;
    private V value;


    public KeyValuePairs(T key, V value) {
        this.key = key;
        this.value = value;
    }
}
