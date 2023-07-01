package com.jc.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * List接口：
 * 可以重复，有序，根据索引操作等
 * Queue接口：
 * 先进先出
 * Deque接口：
 * 可以先进先出，可以后进先出，可以先进后出。。。。。因为两头操作
 * Set接口
 * <p>
 * Set系列的集合有什么特点：
 * 不允许有元素重复，有一些是有序的，有一些是无序的
 * 底层存储的顺序和添加的顺序绝对不一致
 * Set也是Collection接口的子接口，但是没有扩展新方法，所以用的都是Collection接口的方法
 * Set的实现类有：HashSet，TreeSet，LinkedHashSet
 */
public class TestSet {

    @Test
    public void test06(){
        HashSet<>
    }

    @Test
    public void test05(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");
        System.out.println(set);
        /*
        不可重复，有序（按照添加顺序）
        这里的话，底层不是按照添加顺序存储的，但是会有一个链表记录它们添加的顺序
         */

    }

    @Test
    public void test04() {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();//光看长度不行
                int lengthResult = o1.length()-o2.length();
                return  lengthResult==0?o1.compareToIgnoreCase(o2):lengthResult;
            }
        });
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println("元素个数：" + set.size());
        System.out.println(set);
        /*
        有序（有大小顺序） 且不重复
        这个例子中，是依据String的定制排序排列的，依据字符串的长度排序
         */
    }

    @Test
    public void test03() {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println(set.size());
        System.out.println(set);
        /*
        有序（有大小顺序），且不重复
        这个例子中，是依据String的定制排序排列的，希望是忽略大小写的排序
         */
    }

    @Test
    public void test02() {
        TreeSet<String> set = new TreeSet<>();
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println("元素个数：" + set.size());
        System.out.println(set);
        /*
        有序（有大小顺序），且不重复
        这个例子中，是依据string的自然排序排列的，而自然顺序就是Unicode编码值排序
         */
    }

    @Test
    public void test01() {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");
        set.add("hello");

        System.out.println("元素个数：" + set.size());
        System.out.println(set);
        /*
        无序，且不重复
         */
    }
}
