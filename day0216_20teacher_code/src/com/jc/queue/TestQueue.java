package com.jc.queue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 队列：先进先出
 * 可以使用ArrayList，更可以使用LinkedList
 * 相比较而已，LinkedList更专业一点，因为它实现了Queue接口。
 * 而且LinkedList还实现了Deque接口（双端队列接口）
 */

public class TestQueue {

    @Test
    public void test05(){
        LinkedList<String> list = new LinkedList<>();
        list.addLast("hello");
        list.addLast("world");
        list.addLast("java");
        list.addLast("mysql");
        list.addLast("chai");
        System.out.println(list);
        //更加代表性的方法，从头操作
        while (!list.isEmpty()) {
            System.out.println(list.removeFirst());
        }

    }
    @Test
    public void test04(){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("hello");
        list.addFirst("world");//挤到队头
        list.addFirst("java");
        list.addFirst("mysql");
        list.addFirst("chai");

        //更加代表性方法，表示从头操作
        while (!list.isEmpty()) {
//            System.out.println(list.removeFirst());
            System.out.println(list.removeLast());
        }

    }

    @Test
    public void test03(){
        LinkedList<String> list = new LinkedList<>();
        list.offer("hello");
        list.offer("world");
        list.offer("java");
        list.offer("mysql");
        list.offer("chai");

        while (!list.isEmpty()) {
            System.out.println(list.poll());//移走第一个元素
        }
    }

    @Test
    public void test02(){
        LinkedList<String> link = new LinkedList<>();
        link.add("hello");
        link.add("world");
        link.add("java");
        link.add("mysql");
        link.add("chai");

        while (!link.isEmpty()) {
            System.out.println(link.remove(0));
        }
        System.out.println(link);
    }

    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("mysql");
        list.add("chai");

        while (!list.isEmpty()) {
            System.out.println(list.remove(0));
        }
        System.out.println(list);
    }
}
