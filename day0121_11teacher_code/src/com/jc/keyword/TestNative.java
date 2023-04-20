package com.jc.keyword;

/*
学习关键字：
1、把单词的意思先弄明白
英语单词的意思和Java中的意思
2、它可以用在哪里
3、用它和不用它有什么区别

6.5.2 native关键字（了解）
1、native:
单词本身的意思：本地的，原生的
Java中：本地的

2、它可以用在哪里
它只能用在一个地方，方法的返回值类型前面，作为方法的一个修饰符。

方法的修饰符：
    权限修饰符：public ,protected, 缺省,private
    其他修饰符：native

3、用它是什么意思呢？
用它修饰的方法，在.java中看不到这个方法的方法体 。
【修饰符】 class 类{
    【权限修饰符】 native 返回值类型 方法名（【形参列表】);
}

这种方法，表示它是本地方法，调用的是C语言编写的本地系统的方法，即它的方法体在C中。

4、演示

 */
public class TestNative {
    public static void main(String[] args) {
        MyData my = new MyData();
        System.out.println(my.hashCode());//它就是一个数字  460141958
        /*
        跟踪源码：按住Ctrl键，单击hashCode()方法
         */
    }
}

class MyData {
}
