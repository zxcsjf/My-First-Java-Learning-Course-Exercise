package com.Exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AccountException {
//        try (
//             FileWriter writer = new FileWriter("...");
//                FileReader reader = new FileReader("file.txt")
//        ) {
//            writer.write(1);
//            int value = reader.read();
//        } catch (IOException e) {
//            System.out.println(e.getCause());
//            e.printStackTrace();
//        }

        ExceptionDemo.show();
    }
}
