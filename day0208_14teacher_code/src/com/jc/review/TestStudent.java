package com.jc.review;

public class TestStudent {
    public static void main(String[] args) {
        Student[] arr = new Student[4];
        arr[0] = new Student(3,"张三");
        arr[1] = new Student(2,"李四");
        arr[2] = new Student(1,"熊大");
        arr[3] = new Student(4,"熊二");

        MyArrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
