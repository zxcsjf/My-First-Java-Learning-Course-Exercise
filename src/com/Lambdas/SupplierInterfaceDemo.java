package com.Lambdas;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void show() {

        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

        DoubleSupplier randomDouble = () -> new Random().nextDouble();
        var random2 = randomDouble.getAsDouble();
        System.out.println(random2);
    }
}
