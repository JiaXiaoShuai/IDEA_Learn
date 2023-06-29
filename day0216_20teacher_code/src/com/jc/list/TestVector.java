package com.jc.list;

import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Test
    public void test01(){
        Vector<String> v = new Vector<>();
        v.add("s");
        v.add("s");
        v.set(1,"o");
//        System.out.println(v.get(7));//报错ArrayIndexOutOfBoundsException
    }
}
