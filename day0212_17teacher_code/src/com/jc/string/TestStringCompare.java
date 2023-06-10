package com.jc.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 字符串比较
 * （1）比较地址值：==
 * 只有两个字符串常量池中的字符串==比较时才会返回true，其他的都是false
 * （2）比较字符串的内容
 * boolean equals（另一个字符串）：String类重写的Object类的equals，严格区分大小写
 * boolean equalsIgnoreCase（另一个字符串）：忽略大小写的比较内容
 * （3）比较大小
 * String实现了java.lang.Comparable,支持自然排序比较大小，int compareTo（Object obj），按照字符的Unicode编码值比较大小
 * String类中补充了一个int comparableToIgnoreCase(另一个字符串)忽略大小写比较大小
 *
 * java.text.Collator:字符串的定制排序规则，而且是区分语言环境的String比较
 */
public class TestStringCompare {
    @Test
    public void test01(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
    }

    @Test
    public void test02(){
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//false
        System.out.println(s2.equals(s3));//true

        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s2.equalsIgnoreCase(s3));//true
    }

    @Test
    public void test03(){
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.compareTo(s2));//32   h-H=32  正整数，表示s1 > s2
    }

    @Test
    public void test04(){
        String[] arr = {"hello","Hello","Lily","haha","Bob"};
        Arrays.sort(arr);//调用元素的compareTo方法比较大小，自然排序大小，严格区分大小写
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s1.compareToIgnoreCase(s2);//忽略大小写的比较
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
