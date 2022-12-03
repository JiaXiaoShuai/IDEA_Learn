package com.jc.review;

import java.util.Comparator;

public class MyArrays {
    public static void sort(Object[] arr){
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
//                if(((Employee)arr[j]).getId() > ((Employee)arr[j+1]).getId()){//不合适
                if(((Comparable)arr[j]).compareTo(arr[j+1]) > 0){//对
                    Object  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sort(Object[] arr, Comparator c){
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
//                if(((Employee)arr[j]).getAge() > ((Employee)arr[j+1]).getAge()){//不合适
                if(c.compare(arr[j],arr[j+1]) > 0){//对
                    Object  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
