package com.jc.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class TestMyArrayList {

    @Test
    public void test08(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("aii");
        list.add("ai");

        list.remove(2);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void test07(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("ai");
        list.add("ai");

        for (String s : list) {
            System.out.print("\t"+s);
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }

    @Test
    public void test06(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("ai");
        list.add("ai");
//        list.removeAll("ai");
        list.removeAll("jia");
        list.transferToString();
    }

    @Test
    public void test05(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("ai");
        list.add(2,null);
        list.add("jia");
        list.add("ai");
        list.lastRemove("jia");
        list.transferToString();
        list.removeAll("ai");
        list.transferToString();
    }

    @Test
    public void test04(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("cong");
        list.add(2,null);
        list.add("ku");
        /*list.add("ai");*/
        list.remove(0);
        list.transferToString();
        list.remove(1);
        list.transferToString();
    }

    @Test
    public void test03(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("cong");
        list.add(2,null);
        list.add("ku");
        System.out.println(list.toString());
//        System.out.println(list.indexOf001("ku"));//报错空指针异常,因为循环到了插入的空值，
        System.out.println(list.indexOf("ku"));//报错空指针异常
        System.out.println(list.contain(null));
        System.out.println(list.lastIndexOf(null));
        System.out.println(list.contain("j"));
    }

    @Test
    public void test02(){
        MyArrayList<Object> list = new MyArrayList<>();
        list.add("jia");
        list.add("cong");
        list.add(2,"null");
        list.add("ku");
        list.add(12);
        System.out.println(list.toString());
        System.out.println(list.get(4).getClass());
//        System.out.println(list.indexOf001("ku"));//报错空指针异常,因为循环到了插入的空值，
//        System.out.println(list.indexOf("ku"));//报错空指针异常
    }

    @Test
    public void test01(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jia");
        list.add("cong");
        list.add(2,"ai");
        list.add("jia");
        System.out.println(list.toString());
        System.out.println(list.indexOf("jia"));
    }
}
