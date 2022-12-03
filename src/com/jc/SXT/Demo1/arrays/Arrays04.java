package com.jc.SXT.Demo1.arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //在数组中快速找到某个元素索引(需要数组有从小到大的排序)
        int[] arr = {23,4,56,76,734,678,23,658,342,45,236,6,};
        Arrays.sort(arr);
        for(int x : arr){
            System.out.print(x + "\t");
        }
        System.out.println("");
        //Arrays.binarySearch  找到返回索引值，没找到返回负数
        int index = Arrays.binarySearch(arr,342);
        System.out.println(index);

        //快速遍历数组，返回字符串形式
        String arrs = Arrays.toString(arr);
        System.out.println(arrs);

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = Arrays.copyOf(arr1,6);
        arr1[0] = 90;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }
}
