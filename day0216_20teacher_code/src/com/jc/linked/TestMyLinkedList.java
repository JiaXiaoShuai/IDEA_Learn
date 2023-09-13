package com.jc.linked;

import org.junit.Test;

public class TestMyLinkedList {
    @Test
    public void test01(){
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("h5");
        list.add("mysql");
        list.add("chai");

        list.remove("hello");
        list.remove("chai");
        list.remove("java");

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("h5");
        list.add("mysql");
        list.add("chai");
        /*System.out.println(list.findNode("h5").getData());*/
        System.out.println("添加没有问题");
        list.remove("hello");
        System.out.println("第一次删除没有问题");
        list.remove("chai");
        System.out.println("第二次删除没有问题");
        list.remove("java");
        System.out.println("第三次删除没有问题");

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
