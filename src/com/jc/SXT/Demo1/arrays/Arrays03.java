package com.jc.SXT.Demo1.arrays;

import java.util.Arrays;

/**
 * 数组的工具使用
 */
public class Arrays03 {
    public static void main(String[] args) {
        int[] intArray = {23,12,45,32,13,41,6,78,90,43,65};
        int[] arrs = intArray;

        //排序
        Arrays.sort(arrs);
        for(int i : arrs){
            System.out.print(i+"\t");
        }

        for(int i : intArray){
            System.out.print(i+"\t");
        }
        System.out.println("*");
        int[] arr = {23,12,45,32,13,41,6,78,90,43,65};
        for(int x = 0; x < arr.length;x++){
            for (int i = 0; i < arr.length-1; i++) {

                if(arr[i]>arr[i+1]){
                    int k = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = k;
                }else{
                    //continue;
                }
            }
        }

        for(int x : arr){
            System.out.print(x+"\t");
        }
        System.out.println("");
        int[] arr01 = {23,12,45,32,13,41,6,78,90,43,65};
        Arrays.sort(arr01);
        for(int x : arr01){
            System.out.print(x+"\t");
        }
        /*
        //对比for循环排序数组是否一样
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]==arr01[i]);
        }*/
    }
}
