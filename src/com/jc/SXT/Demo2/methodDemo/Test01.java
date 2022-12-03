package com.jc.SXT.Demo2.methodDemo;

public class Test01 {
    public static void main(String[] args) {

        System.out.println(getSum(1,3));
    }

    /*
     * 定义一个方法，返回两个整数的和
     * 适用范围 public
     * static
     *
     * 返回值类型 int
     * */

    public static int getSum(int a, int b) {
        int c = a + b;
        return c;
    }
}
