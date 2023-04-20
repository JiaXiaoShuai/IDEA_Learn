package com.jc.array;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void Test01(){
        MyArrayList my = new MyArrayList();
        my.add("A");
        my.add("B");
        my.add("C");
        my.add("D");
        my.add("E");
        my.add("F");
        my.add("G");
        my.add("H");
        my.add("I");
        my.add(1,"插在这里");

        my.remove(1);
        my.remove(8);

        for (Object o:
             my) {
            System.out.println(o);
        }
     }


}
