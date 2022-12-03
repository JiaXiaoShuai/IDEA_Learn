package com.jc.SXT.Demo2.methodDemo2;

import java.util.Arrays;

/**
 *这个类主要是为了排序一个int类型的数组（从小到大）
 */

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {3,45,23,67,43,7,6,23,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 升序排列一个int型的数组
     * @param arr 要排序的数组
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
