package com.jc.exer.exer5;

import java.util.Comparator;

public class ArrayTools {

    /**
     * 对Employee[]数组进行排序
     * @param arr 参数为Employee类型的数组
     */
    public static void sort(Object[] arr){
        Employee[] em = (Employee[]) arr;
        for (int i = 1; i < em.length; i++) {
            for (int j = 0; j < em.length-i; j++) {
                if(em[j].compareTo(em[j+1]) > 0) {
                    Employee e;
                    e = em[j+1];
                    em[j+1] = em[j];
                    em[j] = e;
                }
            }
        }
    }


    /**
     * 对数组进行排序
     * @param arr
     * @param c
     */
    public static void sort(Object[] arr, Comparator c){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(c.compare(arr[j],arr[j+1]) > 0){
                    Object ob = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = ob;

                }
            }
        }

    }

    public static void print(Object[] arr){
        for(Object obj : arr){
            System.out.println(obj.toString());
        }
    }

}
