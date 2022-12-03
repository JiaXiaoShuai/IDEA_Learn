package com.jc.init;

public class TestFather {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.getInfo());
        System.out.println("-----------------------");
        Father f2 = new Father(10,10);
        System.out.println(f2.getInfo());
    }
}
