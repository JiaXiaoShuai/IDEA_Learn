package com.jc.reference;

import java.util.Arrays;
import java.util.function.Function;

/*
17.4.3 数组构造引用

当Lambda表达式是创建一个数组对象，并且满足Lambda表达式形参，
正好是给创建这个数组对象的长度，就可以数组构造引用：
* 数组类型名::new
 */
public class TestArray {
    public static void main(String[] args) {
        //如果使用Lambda表达式给一个Function接口的变量赋值
        //需求：给定一个长度，你返回一个对应长度的String[]数组给我
        /*
        功能型接口Function<T,R>，有一个抽象方法 R apply(T t)
        形参的类型：Integer
        返回值类型：String[]
         */
//        Function<Integer,String[]> fun = t -> new String[t];
        Function<Integer,String[]> fun = String[] :: new;

        String[] arr = fun.apply(5);
        System.out.println(Arrays.toString(arr));
    }
}
