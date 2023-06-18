package com.jc.review;

public class TestMyArrays {
    public static void main(String[] args) {
        String[] strings = {"hello","world","java"};
        /*Object[] objects = MyArrays.copyOf(strings, 5);
        for (Object object : objects) {
            System.out.println(((String)object).length());
        }*/

        String[] newArr = MyArrays.copyOf(strings, 5);
        for (String s : newArr) {
            System.out.println(s);
        }
    }
}
