package com.jc.review.exer1;

/*
下面这些代码，调用的都是成员变量，不是虚方法。
只看变量或对象的“编译时类型”就可以了。
什么是编译时类型？
（1）对于变量来说，变量声明时，左边的类型就是它的编译时类型
（2）对于强制类型转换来说，()中写的类型是什么，它的编译时类型就是什么。如果有连续多次的强制类型转换，看最后一次。
 */
public class Exer1 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.num);//a变量的编译时类型是A
        //1
        System.out.println(((B)a).num);//((B)a)，的编译时类型就是B
        //2
        System.out.println(((A)((B)a)).num);//((A)((B)a))，最后的类型是(A)，它的编译时类型就是A
        //1
        System.out.println("-------------------");
        B b = new B();
        System.out.println(b.num);//b变量的编译时类型是B
        //2
        System.out.println(((A)b).num);//((A)b)，编译时类型是A
        //1
        System.out.println(((B)((A)b)).num);//((B)((A)b))，编译时类型B
        //2
    }
}
class A{
    int num = 1;
}
class B extends A{
    int num = 2;
}
