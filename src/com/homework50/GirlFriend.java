package com.homework50;

public class GirlFriend {
    private int age;
    private int income;
    private int loveCount;
    private int relationProgress;

    public GirlFriend(int age, int income, int loveCount, int relationProgress) {
        this.age = age;
        this.income = income;
        this.loveCount = loveCount;
        this.relationProgress = relationProgress;
    }

    public String canWeMarry(){
        if (age <= 26 && income >= 6000 && loveCount <= 3 && relationProgress >= 90)
            return "Yes!";
        else return "No!";
    }
/**
 * description
 * @param null 
 * @return
 * @author ShanJifei
 * @since 2022/05/23 8:43
 */
    public String canWeHaveAChild() {
        return "NO!";
    }
}
