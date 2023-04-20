package com.jc.review.exer3;

public class Test03 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();

        MyClass my = new MyClass();//my没有多态引用，只看MyClass类就可以了
        my.method(f);//father
        /*
        实参f的编译时类型仍然是Father，找最匹配的public void method(Father f)
         */
        my.method(s);//son
        /*
        实参s的编译时类型是Son，找最匹配的public void method(Son s)
         */
        my.method(d);//father
        /*'
        实参d的编译时类型是Daughter，找最匹配，没有，找兼容的，public void method(Father f)
         */
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
class Father{

}
class Son extends Father{

}
class Daughter extends Father{

}
