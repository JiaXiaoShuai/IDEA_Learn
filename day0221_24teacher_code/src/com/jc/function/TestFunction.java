package com.jc.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/**
 * 举例：
 * 去实现一个字符串数组的排序。要求字符串排序过程中忽略字母的大小写
 * <p>
 * 函数式编程思想和面向对象的编程思想的差别在于：
 * 面向对象的一等公民是对象，干什么事之前都要现有对象。
 * 函数式编程思想的一等公民是函数，函数就是方法，最重要的就是方法的（形参列表）和方法体
 * 把函数当成数据、参数等进行传递
 */
public class TestFunction {
    @Test
    public void test02(){
        String[] arr = {"hello","Bob","Rose","java","chai"};
        /*
        数组的排序，Arrays工具类中有现成的方法sort
         */
//        Arrays.sort(arr);//sort方法，默认的是按照元素的自然排序，String类的自然排序是按照Unicode编码值排序
        Comparator<String> comparator = (o1,o2) -> o1.compareToIgnoreCase(o2);
        Arrays.sort(arr,comparator);
    }
    @Test
    public void test01() {
        String[] arr = {"hello", "Bob", "Rose", "java", "chai"};
        /*
        数组的排序，Arrays工具类中有现成的方法sort
         */
//        Arrays.sort(arr);//sort方法，默认的是按照元素的自然排序，String类的自然排序是按照Unicode编码值排序
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);//方法体就是函数的实现体
            }
        });
        /*
        为了告诉Arrays.sort方法，对字符串排序时，不区分大小写这个规则，
        我们new了一个Comparator接口的实现类对象，使用匿名内部类的形式实现Comparator接口的同时创建对象。
         */

        System.out.println(Arrays.toString(arr));
    }
}
