package com.jc.reference;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
17.4 方法引用与构造器引用
1、什么是方法引用？
它是指一种新的语法格式：
    类名 :: 方法名
    对象名 :: 方法名

 2、方法引用用在哪里？
 作用：方法引用是   用于简化Lambda表达式的语法。

 3、注意：不是所有的Lambda表达式都可以用方法引用进行简化的，只有满足以下情况时，才能用它进行简化：
 （1） Lambda体只有一个语句，并且这个语句是通过调用一个现有的类或对象的方法来完成的。
      并且在调用方法时，所使用的实参正好时Lambda表达式的形参，整个使用过程中，没有额外的数据出现。
 （2） Lambda体只有一个语句，并且这个语句是通过调用一个现有的对象的方法来完成的。
    此时调用方法的对象是Lambda表达式的第一个形参，
    并且Lambda表达式的剩下的形参，正好作为该方法的实参，
   整个使用过程中，没有额外的数据出现。
 */

public class TestReference {
    @Test
    public void test04(){
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();
        */
        new Thread(() -> System.out.println("hello")).start();//不能用方法引用进行简化
    }

    @Test
    public void test03(){
        String[] arr = {"hello","Bob","Rose","java","chai"};
        Arrays.sort(arr, (s1, s2) -> s1.compareToIgnoreCase(s2));
//        Arrays.sort(arr, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test02(){
//        Stream.generate(() -> Math.random()).forEach(num -> System.out.println(num));
        Stream.generate(Math::random)
                .forEach(System.out::println);
        Stream.generate(()->Math.round(3.1))
                .forEach(System.out::println);
    }

    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");

//        list.forEach(t -> System.out.println(t));//Lambda表达式
        list.forEach(System.out::println);//方法引用
    }
}
