package com.Generics;

public class Main {
    public static void main(String[] args) {

        // dome of Iterable and Iterator Interface
        var lists = new GenericList<String>();
        lists.add("s");
        lists.add("t");
        lists.add("r");

//        var iterator = lists.iterator();
//        while (iterator.hasNext()) {
//            var current = iterator.next();
//            System.out.println(current);
//        }
        // for-each loop 功能和上面的while loop等效。
        for(var item : lists)
            System.out.println(item);


//        var user = new User(10);
//        Utils.printUser(user);
//
//        var users = new GenericList<Instructor>();
//        Utils.printUsers(users);

//        var max = Utils.max(new User(10), new User(20));
//        System.out.println(max);

//        var user1 = new User(1);
//        var user2 = new User(2);
//
//        if (user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 = user2");
//        else
//            System.out.println("user1 > user2");


//        var message = new String("hello world");
//        var message2 = "hello world";
//        System.out.println(message==message2);
//
//        var list1 = new GenericList<Integer>();
//        list1.add(100);                         // Boxing
////        list1.add(Integer.valueOf(100));
//        int number = list1.get(0);              // Unboxing
//
//        System.out.println(number);
//
//        var list = new GenericList<User>();
//        list.add(new User());
//        User name = list.get(0);
//        System.out.println(String.valueOf(name));


//        List list = new List();
//        list.add(Integer.valueOf(1));
//        list.add("Hello");
//        int number = (int)list.get(0);
//
//        System.out.println(number);
    }
}
