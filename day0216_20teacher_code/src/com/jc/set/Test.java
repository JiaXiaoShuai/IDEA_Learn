package com.jc.set;

import java.util.Iterator;
import java.util.Objects;

public class Test extends Exception implements Iterable{
    private int id;
    private String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    /*@org.junit.Test
    public void test01(){
        Test a = new Test(1,"jia");
//        a.iterator();
        Test b = new Test(1,null);
        System.out.println(a.equals(b));//只有无参构造才可以使用@Test方法
    }*/

    public static void main(String[] args) {
        Test a = new Test(1,"jia");
//        a.iterator();
        Test b = new Test(1,null);
        System.out.println(a.equals(b));
    }


    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        try {
            boolean b = id == test.id && name.equals(test.name);
        }catch (NullPointerException e){
            System.out.println("调用的对象的name属性为空了");
        }
        return id == test.id && name.equals(test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id == test.id && Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }*/
}


class A extends Test{

    public A(int id, String name) {
        super(id, name);
    }

    @Override
    public Iterator iterator() {
        return super.iterator();
    }


}