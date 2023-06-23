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
 * <p>
 * （2）
 * List接口的方法
 * java.util.List<E>,注意不要导错包了（java.awt.List这个类是界面下拉框用的）
 * List接口是Collection的子接口，所以Collection接口的所有方法，他都有
 * 我们下面主要介绍他新增的方法，比Collection接口多的方法
 * a：添加
 * void add(int index,E ele)
 * boolean addAll(int index,Collection<? extends E> eles)
 * b：删除
 * E remove（int index）：指定位置元素删除
 * c：修改
 * E set（int index，E ele）：
 * d:查询
 * E get(int index):获取指定位置的元素
 * int indexOf(Object o):查询o对象在当前List集合的位置，如果有重复的多个相同的元素，只返回第1个
 * int lastIndexOf(Object o):查询o对象在当前List集合的位置，如果有重复的多个相同的元素，只返回最后一个
 * List<E> subList(int fromIndex, int toIndex):截取一段[fromIndex,toIndex)
 * e:遍历
 * ListIterator<E> listIterator()
 * ListIterator<E> listIterator(int index)
 *
 * Iterator<E> 接口：
 * boolean hasNext()
 * E next():
 * void remove();
 *
 * ListIterator<E>是Iterator<E>的子接口
 */
public class TestList {

    @Test
    public void test08(){
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("jia");//[5]

        ListIterator listIterator = list.listIterator(3);
        while(listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(next);
        }


    }
    @Test
    public void test07(){
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("jia");//[5]

        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(next);
        }

        while(listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(1);//hasNext()已经遍历到最后了，所以while的循环体不会再执行了
        }
    }

    @Test
    public void test06(){
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("jia");//[5]

        System.out.println(list.get(3));
        System.out.println(list.indexOf("Hello"));
        System.out.println(list.lastIndexOf("hello"));
        System.out.println(list.subList(2, 4));
    }
    @Test
    public void test05(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add(0,"world");

        list.set(1,"fuck");
        System.out.println(list);
    }
    @Test
    public void test04(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.remove(Integer.valueOf(30)));
        System.out.println(list);
    }
    @Test
    public void test03() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add(0, "world");
        list.remove(1);
        System.out.println(list);
    }

    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");

        List<String> list2 = Arrays.asList("h5", "atguigu");
        list.addAll(1, list2);
        System.out.println(list);
    }

    @Test
    public void test01() {
        List list01 = new ArrayList<>();
        list01.add("张三");
        list01.add("李四");
        list01.add("王五");

        List list02 = Arrays.asList("张二麻子");
        list01.addAll(list02);
        System.out.println(list01);

        list01.add(1, "贾小帅");
        System.out.println(list01);

        list01.add(3, list02);
        System.out.println(list01);

        ListIterator listIterator = list01.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            System.out.println(next);
        }

    }
}
