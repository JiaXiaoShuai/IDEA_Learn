package com.jc.inter;

/*
第4个经典接口：
    java.lang.Iterable接口：实现这个接口允许对象成为 "foreach" 语句的目标。
    这个接口有一个抽象方法：Iterator iterator()

    java.util.Iterator接口，它是迭代器接口

foreach：是JDK1.5增加的一个新语法，叫做增强for循环。
        作用：遍历数组和集合容器的元素的。

        JDK1.5之后，所有数组类型都默认实现java.lang.Iterable接口，即支持foreach循环遍历数组。
        JDK1.5之后，很多的集合也都实现java.lang.Iterable接口，即支持foreach循环遍历元素。

foreach语法：
    for(元素的类型  元素临时名称 : 数组或集合容器对象名){
    }

    元素临时名称：局部变量名称，自己命名就可以，它就是临时代表一个元素。
 */
public class TestIterable {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int num : arr){
            System.out.println(num);//num代表的数组的元素
        }

        System.out.println("------------------------");
        MyContainer my = new MyContainer();
        my.add("hello");
        my.add("world");
        my.add("java");
        my.add("mysql");
        my.add("bigdata");
        my.add("chai");

        /*Object[] allElements = my.getAllElements();
        for (int i = 0; i < allElements.length; i++) {
            System.out.println(allElements[i]);
        }*/

        for(Object obj : my){
            System.out.println(obj);
        }


    }
}
