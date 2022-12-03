package com.jc.api;

import java.util.Scanner;

/*
6.5.4  Object根父类
1、在Java中，所有类都有一个公共的父类，那就是java.lang.Object类。被称为Java的根父类。
2、API（Application Programming Interface，应用程序编程接口），就是我们平时说的帮助文档。
通过查看这个文档，可以了解某个库/工具组件，它有哪些包，哪些类，每一个类有哪些方法可以给我们使用。
但是这个和查看源码是不同。查看API文档只是看到方法等的简介，是看不到源码。

JDK的核心类库（JRE中的核心类库）有提供官方API。官方下载的API是网页版的，而且是全英文版。

3、Object类在API中的概述
类 Object 是类层次结构的根类。每个类都使用 Object 作为超类（父类）。所有对象（包括数组）都实现这个类的方法。

理解上面的话：
（1）Java的类都是直接或者间接的继承Object类，
如果一个类名后面没有写“extends 父类"，那么表示它直接继承Object。
如果一个类名后面写了"extends 父类"，那么表示它间接继承Object。

（2）既然Object是所有类的父类，那么Object类型的变量，可以和任意类型的对象构成“多态引用”。
一旦多态引用了，在编译时，只能调用父类Object类中的方法了。

Java中规定：Object[]数组，可以接收任意类型的对象数组。
Java中规定： int[]、char[]等，它们之间是不能互相转换，它们和Object[]之间也不能互相转换

（3）所有“对象”（包括数组对象）都可以调用Object类中声明的方法。

但是基本数据类型的值，是不能调用方法的。

（4）Object有一个无参构造，所有类对象的创建都会直接会间接的调用这个构造器。
 */
public class TestObject {//它默认继承Object

    public static void main(String[] args) {
        Object obj1 = "hello"; //=左边的obj1是Object类型，=右边是String，它是引用数据类型，是String类型的对象
        Object obj2 = new TestObject();
        Object obj3 = new Scanner(System.in);

        Object[] arr1 = new String[5];
        Object[] arr2 = new A[5];

    /*    double[] nums = new int[5];//错误的
        Object[] arr3 = new int[5];//错误的*/
        Object obj4 = new int[5];//这种情况是把=右边的当成一个普通对象了

        String s1 = "hello";
        A a = new A();
        System.out.println(a.hashCode());//这个hashCode（）方法从Object类继承的。

        int num = 1;
//        System.out.println(num.hashCode());//错误，num不是对象
    }
}

class A{//它默认继承Object

}
class B extends A{//直接父类是A，但是A是默认继承Object，相当于B也是Object的子类。

}