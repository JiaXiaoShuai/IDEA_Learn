package com.jc.block;
/*
静态代码块
1.语法格式
【修饰符】 class 类名{
    {
        非静态代码块：给实例变量初始化
    }
   static {
        静态代码块：给静态变量初始化
    }
}

2.静态代码块的作用：
给静态变量初始化
3.执行特点
（1）在类加载后对类进行初始化时执行。
肯定比new对象早。类要先初始化，才能new对象
（2）每一个类只会执行一次
 */
public class TestBlock {
    static{
        System.out.println("TestBlock类静态代码块");
    }

    {
        System.out.println("TestBlock类非静态代码块");
    }

    public static void main(String[] args) {
        TestBlock t1 = new TestBlock();
        TestBlock t2 = new TestBlock();
    }
}
