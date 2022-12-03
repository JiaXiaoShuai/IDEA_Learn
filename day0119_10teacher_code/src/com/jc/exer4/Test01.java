package com.jc.exer4;

public class Test01 {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.num);
        System.out.println(((B) a).num);
        System.out.println(((A) ((B) a)).num);
        System.out.println("-------------------");
        B b = new B();
        System.out.println(b.num);
        System.out.println(((A) b).num);
        System.out.println(((B) ((A) b)).num);
    }
}

class A {
    int num = 1;
}

class B extends A {
    int num = 2;
}

