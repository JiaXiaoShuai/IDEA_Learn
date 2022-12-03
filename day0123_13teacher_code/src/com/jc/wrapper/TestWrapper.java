package com.jc.wrapper;

/*
7.3 包装类
7.3.1 包装类是什么？为什么要有包装类？
Java是面向对象的语言，但是Java不是纯面向对象语言，因为java保留了C语言的8种基本数据类型
和void
这些类型不属于面向对象

为什么要保留这些类型呢？
因为这些类型有丰富的运算符可以支持
而且这些类型有固定大小的内存空间
这些特性没必要重新再设计新的，直接沿用

但是java除了这些以外又都是面向对象的，很多的API方法，或者新特性都是针对“对象”而设计的
比如：集合，泛型等。只支持对象，不支持基本数据类型

java为了解决这样的问题，希望基本数据类型的数据也能用于集合，也能使用一些新特性，就给
它们提供了“包装类”。

byte<---->Byte
short <---> Short
int  <---->Integer
long <---->Long
float<---->Float
double<---->Double
char<----->Character
boolean<---->Boolean
void <----->Void    这个很少使用，代表空类型


7.3.2 基本数据类型与包装类之间如何转换？
基本数据类型和包装类毕竟是两种类型，肯定需要转换才能使用。

基本数据类型的数据 -> 包装类的对象  ： 装箱
包装类的对象     ->基本数据类型的数据 ：拆箱

在JDK1.5之前，装箱和拆箱必须手动进行，毕竟麻烦。
在JDK1.5之后，装箱和拆箱可以自动进行，非常方便。

但是自动的装箱与自动的拆箱，只支持对应类型之间。

 */
public class TestWrapper {
    public static void main(String[] args) {
        //手动装箱
        int i = 0;
        Integer objNum1 = new Integer(i);
        Integer objNum2 = Integer.valueOf(i);

        //手动拆箱
        int num = objNum1.intValue();
        byte num1 = objNum1.byteValue();


        System.out.println("______________________");
        //自动装箱
        int j = 1;
        Integer obj = i;

        //自动拆箱
        int h = obj;
        //byte k = obj;//报错，可以是byte k = obj.byteValue();

        System.out.println("------------------------");
        //但是自动的装箱与自动的拆箱，只支持对应类型之间。
        int x = 1;
//        Double d = x;//错误  因为int类型的x只能自动装箱为 Integer类型的对象，而Integer类型的对象是不能赋值给Double
        //Integer不能自动转换为Double，它们是引用数据类型，又不是父子类

        double dNum = 1.0;
        Double dObj = dNum;//可以

        Double dou = (double)x;//强转后可以装箱
    }

}
