package com.homework50.extension;

/**
 * 【递归经典问题-不死神兔】有一对兔子，从出生后第3个月起 每个月都生一对兔子，小兔子长到第三个月后每个月又生一对 兔子，假如兔子都不死，问每个月的兔子对数为多少？ （其实 就是斐波那契数列
 *
 * @author zxcsjf
 * @since 2022/05/29 13:40
 */
public class Solution1 {
    public static void main(String[] args) {
        int month = 45;

        long start2 = System.currentTimeMillis();
        long memory3 = Runtime.getRuntime().freeMemory();
        System.out.println("第" + month + "个月兔子有" + Fibo2(month) + "对.");
        long memory4 = Runtime.getRuntime().freeMemory();
        long end2 = System.currentTimeMillis();
        System.out.println("循环消耗内存" + (memory3 - memory4) + "字节。");
        System.out.println("循环耗时" + (end2 - start2) + "ms");

        System.out.println();
        long start1 = System.currentTimeMillis();
        long memory1 = Runtime.getRuntime().freeMemory();
        System.out.println("第" + month + "个月兔子有" + Fibo1(month) + "对.");
        long memory2 = Runtime.getRuntime().freeMemory();
        long end1 = System.currentTimeMillis();
        System.out.println("递归消耗内存" + (memory1 - memory2) + "字节。");
        System.out.println("递归耗时" + (end1 - start1) + "ms");
    }
    // 递归，自顶向下，效率低
    public static long Fibo1(int n) {
        if (n < 2) {
            return n;
        }
        return Fibo1(n - 1) + Fibo1(n - 2);
    }
    // 循环，自底向上，效率高
    public static long Fibo2(long n) {
        if (n < 2) {
            return n;
        }
        long first = 0;
        long second = 1;
        long fibn = 0;
        for (long i = 1; i < n; i++) {
            fibn = first + second;
            first = second;
            second = fibn;
        }
        return fibn;
    }
}
