package com.jc.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 2.List集合
 * （1）List特点：
 * 有序，可以重复、线性、可以根据索引操作元素
 *
 * （2）
 * List接口的方法
 * java.util.List<E>,注意不要导错包了（java.awt.List这个类是界面下拉框用的）
 * List接口是Collection的子接口，所以Collection接口的所有方法，他都有
 * 我们下面主要介绍他新增的方法，比Collection接口多的方法
 * A：添加
 * void add(int index,E ele)
 * boolean addAll(int index,Collection<? extends E> eles)
 * B：删除
 * E remove（int index）：指定位置元素删除
 * C：修改
 * E set（int index，E ele）：
 */
public class TestList {


    @Test
    public void test02(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");

        List<String> list2 = Arrays.asList("h5", "atguigu");
        list.addAll(1, list2);
        System.out.println(list);
    }
    @Test
    public void test01(){
        List list01 = new ArrayList<>();
        list01.add("张三");
        list01.add("李四");
        list01.add("王五");

        List list02 = Arrays.asList("张二麻子");
        list01.addAll(list02);
        System.out.println(list01);

        list01.add(1,"贾小帅");
        System.out.println(list01);

        list01.add(3,list02);
        System.out.println(list01);

        ListIterator listIterator = list01.listIterator();
        while(listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(next);
        }

    }
}
