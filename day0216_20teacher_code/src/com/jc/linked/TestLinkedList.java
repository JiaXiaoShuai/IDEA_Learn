package com.jc.linked;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("jia");
        list.add("cong");
        list.add("hello");
        list.remove("hello");
        Iterator<String> iterator = list.iterator();
        System.out.println(list.indexOf("jia"));
        System.out.println(list.toArray());

        for (String s : list) {
            System.out.println(s);
        }


        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size());
    }
}
