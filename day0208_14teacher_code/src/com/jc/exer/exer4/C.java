package com.jc.exer.exer4;

public class C extends B implements A{

    public void px(){
        System.out.println(super.x);
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new C().px();
    }
}

interface A{
    static final int x = 0;
}

class B{
    int x = 1;
}