package com.jc.SXT.Demo2.methodDemo2;


/**
 *这个类主要是用来实践可变参数
 *
 * 可变参数必须是列表中的最后一个参数
 * 一个方法的参数列表只能有一个可变参数
 */
public class Test02 {
    /**
     * 含有可变参数的方法并打印
     * @param arr 可变参数
     */
    public static void showArrays(int... arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,45,67,8,9};
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int g = 5;
        showArrays(arr);
        System.out.println("");
        showArrays(a,b,c,d);
    }
}
