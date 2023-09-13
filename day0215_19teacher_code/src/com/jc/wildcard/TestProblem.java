package com.jc.wildcard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/*
<?>的容器，是无法添加任意元素。可以删除元素
<? extends 上限>的容器，是无法添加任意元素。可以删除元素
<? super 下限>的容器，是允许添加元素，但是元素类型有限制，必须是下限或下限子类对象。可以删除元素
 */

public class TestProblem {
    @Test
    public void test01(){
        Collection<?> collection = new ArrayList<>();
//        collection.add("wo");
//        collection.add(1);
//        collection.add('A');
//        collection.addAll(collection);
    }

    @Test
    public void test02(){
        Collection<? extends Number> coll = new ArrayList<>();
//        coll.add(1);
//        coll.add(2.9);
//        Number n = new Integer(1);
//        coll.add(n);
    }

    @Test
    public void test03(){
        Collection<? super Number> coll = new ArrayList<>();
        Object o = new Object();
        coll.add(1);
        coll.add(2.0);
//        coll.add(o);
    }

    @Test
    public void test04(){
//        Collection<? extends Number> coll1 = Arrays.asList("HAVA");
        Collection<? extends String> coll4 = Arrays.asList("HAVA");
        System.out.println(coll4);
//        System.out.println(coll5); //方法体内需要讲究变量的顺序，需要在调用之前
        Collection<? extends Number> coll5 = Arrays.asList(1);
        Collection<? > coll2 = Arrays.asList(1);
        Collection<? super String> coll3 = Arrays.asList("HAVA");

        method();
        method01();

    }
    public void method(){
        System.out.println("da");
    }

    public static void method01(){
        System.out.println("ba");
    }
}
