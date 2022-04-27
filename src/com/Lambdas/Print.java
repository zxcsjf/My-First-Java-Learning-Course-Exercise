package com.Lambdas;

import java.util.function.Consumer;

public class Print implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.printf(s);
    }
}
