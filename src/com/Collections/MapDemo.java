package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
//        List<Customer> customers = new ArrayList<>();
//        for (var customer : customers)
//            if (customer.getEmail() == "e1")
//                System.out.println("Found!");

        // Java: Maps
        // C#: Dictionary
        // Python: Dictionary
        // JavaScript: Objects
        // var person = { name: "John" }

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var c0 = new Customer("o", "e0");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c0.getEmail(), c0);
        map.put(c2.getEmail(), c2);

        // get
        System.out.println(map.get("e1"));
        var unknow = new Customer("Unknow", "");
        System.out.println(map.getOrDefault("e10", unknow));

        // check
        boolean isExist = map.containsKey("e1");
        System.out.println(isExist);

        // remove
        Boolean flag = map.remove("e1", c1);
        System.out.println(flag);

        // replace
        map.replace("e10", new Customer("a++", "e1"));
        System.out.println("map: "+map);

        // iterate * 3
        // keySet
        for (var key : map.keySet())
            System.out.println("key: " + key);

        // entrySet
        for (var entry : map.entrySet()) {
            System.out.println("entry: "+entry);
            System.out.println("entry.getValue(): "+entry.getValue());
            System.out.println("entry.getKey(): "+entry.getKey());
        }

        // values()
        for (var customer : map.values())
            System.out.println("customer: " + customer);
    }
}
