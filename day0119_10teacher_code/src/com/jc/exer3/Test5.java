package com.jc.exer3;

public class Test5 {
    public static void main(String[] args) {
        MyClass my = new MySub();
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();
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
}
class MySub extends MyClass{
    public void method(Father d) {
        System.out.println("daughter");
    }
}
class Father{

}
class Son extends Father{

}

class Daughter extends Father{

}
