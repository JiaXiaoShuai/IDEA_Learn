package com.jc.list;

import org.junit.Test;

import java.util.Arrays;

public class TestMyArrayList {
    @Test
    public void test01(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("cong");
        list.add(2,"ai");
        list.add("jia");
        System.out.println(list.toString());
        System.out.println(list.indexOf("cong"));
    }
}
