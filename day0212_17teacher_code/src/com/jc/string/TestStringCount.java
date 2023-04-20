package com.jc.string;

import org.junit.Test;

import java.util.Arrays;

/*
3、字符串对象的个数问题
 */
public class TestStringCount {
    @Test
    public void test01(){
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //问上面的代码，有几个字符串对象？ 3个
    }

    @Test
    public void test02(){
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //问上面的代码，有几个字符串对象？ 2个
    }

    @Test
    public void test03() {
        String s1 = "hello";
        String s2 = "hello";
        //问上面的代码，有几个字符串对象？ 1个
    }

    @Test
    public void test04(){
        String s1 = "hello"; //存储在常量池中的一个字符串对象
        String s2 = new String("hello");//一个在常量池中，一个是在堆中
        char[] arr = {'h','e','l','l','o'};
        String s3 = new String(arr);//String内部也有char[] value， value数组和arr数组什么关系
        //内部的value数组是根据arr复制的一个新数组
        arr[1] = 'a';
        System.out.println(Arrays.toString(arr));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
