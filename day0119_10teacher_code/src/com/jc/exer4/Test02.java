package com.jc.exer4;

public class Test02 {
    public static void main(String[] args) {
        Father f = new Father();
        Father s = new Son();
        Father d = new Daughter();

        MyClass my = new MyClass();
        my.method(f);
        my.method(s);
        my.method(d);
    }
}
class MyClass{
    public void method(Father f) {
        System.out.println("father");
    }
    public void method(Son s) {
        System.out.println("son");
    }
    public void method(Daughter f) {
        System.out.println("daughter");
    }
}
class Father{

}
class Son extends Father{

}
class Daughter extends Father{

}
