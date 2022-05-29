package com.homework50.extension;

/**
 * 【递归】有5个人坐在一起，问第五个人多少岁？他说比第4个 人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个 人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。 最后问第一个人，他说是10岁。请问第五个人多大
 *
 * @author zxcsjf
 * @since 2022/05/29 13:45
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println("第5个人" + getAge(5) + "岁。");
    }

    private static int getAge(int i) {
        if (i == 1) {
            return 10;
        } else {
            return getAge(i - 1) + 2;
        }
    }
}
