package com.jc.review.exer2;

public class Exer2 {
    public static void main(String[] args) {
        Father f = new Father();
        Father s = new Son();
        Father d = new Daughter();

        MyClass my = new MyClass();
        /*
        第一个问题，my有没有多态引用？没有，从my角度来说，不需要考虑多态现象。
        第二个问题，my调用的method方法，去哪个类找？只MyClass类中找就可以，和其他类无关。

        第三个问题，method方法有三个形式，即重载的形式，那么怎么确定调用的是哪一个？
        重载方法找寻原则：
        A：先找最匹配的
        什么叫最匹配的？
            实参的“编译时”类型和形参的“声明”类型一致，个数也一致。
        B：再找唯一可以兼容的
        什么叫兼容？
            实参的“编译时”类型 < 形参的“声明”类型
            形参是可变参数的话，实参的个数在它允许的范围内
         */
        my.method(f);//father
        /*
        实参f的编译时类型是 Father，和哪个方法的形参最匹配呢？public void method(Father f) 就它了
         */

        my.method(s);//father
        /*
        实参s的编译时类型是 Father，和哪个方法的形参最匹配呢？public void method(Father f) 就它了
         */
        my.method(d);//father
        /*
        实参d的编译时类型是 Father，和哪个方法的形参最匹配呢？public void method(Father f) 就它了
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