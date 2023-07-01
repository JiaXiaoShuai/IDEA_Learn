package com.jc.set;

import java.util.Iterator;

public class Test implements Iterable{
    @Override
    public Iterator iterator() {
        return null;
    }

    @org.junit.Test
    public void test01(){
        A a = new A();
        a.iterator();
    }
}


class A extends Test{

}