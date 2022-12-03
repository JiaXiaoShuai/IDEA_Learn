package com.jc.interfacetype;

/*
7.5 接口
7.5.1 接口的概念
1、生活中接口代表 “连接口”，代表一种“标准”。
USE接口和type-c接口
2、Java中接口，是一种数据类型，和类是平级的数据类型。
代表一种行为操作的标准。

Collection接口：集合（容器）的父接口。
容器的行为操作标准：
添加元素、删除元素、遍历元素...
 add      remove   iterate

3、接口的作用
（1）解决类的单继承限制问题
（2）接口可以表示事物之间的has-a的关系
Mouse has a USB的标准/功能.
KeyBoard has a USB的接口/功能。

 */
public class TestInterface {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setUsb(new Mouse());
        c.setUsb(new Keyboard());
    }
}
