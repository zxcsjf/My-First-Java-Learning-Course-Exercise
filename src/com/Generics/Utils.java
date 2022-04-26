package com.Generics;

public class Utils {
    // Generic Method
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static <T, V> void print(T key, V value){
        System.out.println(key + ": " + value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }

    // class Instructor extends User
    public static void printUsers(GenericList<? extends User> users){
    //  1. with extends <? extends User>, only READ from list
    // class CAP#1 extends User
        User x = users.get(0);
//        users.add(new User(10));

//    // 2. with super <? super User> , only ADD to list
//        users.add(new User(10));
//        users.add(new Instructor(20));
//        Object x = users.get(0); // get 丢失信息
//    // compiler treat users like temp :
//    // GenericList<Object> temp = new GenericList<>();
    }
}
