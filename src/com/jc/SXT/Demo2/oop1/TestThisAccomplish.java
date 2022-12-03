package com.jc.SXT.Demo2.oop1;

/**
 * 测试this关键字的实现
 */
public class TestThisAccomplish {
    public static void main(String[] args) {
        TestThis te = new TestThis(1,"jia",false,18);
        /*System.out.println(te.age);*/
        System.out.println(te.getAge());
        System.out.println(te.getA());
    }
}
