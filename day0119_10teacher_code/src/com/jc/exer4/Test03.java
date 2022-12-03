package com.jc.exer4;

public class Test03 {
    public static void main(String[] args) {
        MyClass01 my = new MyClass01();
        Father01 f = new Father01();
        Son01 s = new Son01();
        Daughter01 d = new Daughter01();
        my.method(f);
        my.method(s);
        my.method(d);
    }
}
class MyClass01{
    public void method(Father01 f) {
        System.out.println("father");
    }
    public void method(Son01 s) {
        System.out.println("son");
    }
}
class Father01{

}
class Son01 extends Father01{

}
class Daughter01 extends Father01{

}
