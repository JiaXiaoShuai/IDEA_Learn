package com.jc.string;

import org.junit.Test;

/**
 * 1.字符串的特点
 * （1）java.lang.String类是final声明的，不能被继承
 * （2）String类的底层是如何表示一串字符的？
 * JDK1.9之前：char【】
 * JDK1.9之后：byte【】
 *
 * 为什么要代替？
 * 主要是考虑内存
 * char占用两个字节
 * 程序中大多数情况下，字符串的值都是由ASCII码表示范围的字符构造器，即由字母、数字字符组成。
 * ASCII码表示范围的字符的编码范围是[0,127]可以用1个字节搞定
 *
 * （3）String类的对象是不可变的
 * A：字符串的任何修改都会返回新对象
 * B：字符串常量对象可以实现“共享”。字符串常量对象存储在常量池中，共享之后可以节省大量的内存
 *
 * 什么是字符串常量对象呢？“”直接表示的对象，就是字符串常量对象
 *
 * 为什么String类的对象不可变？哪些设计是保证String类的对象不可变的呢？
 * A：private final char value【】；final修饰意味着value数组能能指向新的数组
 * B：String类中所有的方法的设计，只要涉及到字符串内容的修改的，都会返回一个新对象
 *
 */
public class TestString {
    @Test
    public void Test01(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);//true
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
    }

    @Test
    public void test02(){
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);//false
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));//对象的地址
    }
    /*
      基本数据类型，形参的修改和实参无关
      int a是基本数据类型
      引用数据类型，形参如果修改对象的属性值，会影响实参
      形参修改了对象的地址值，不会影响实参
     */

    private void change(String str,Integer i,int a,MyData my){
        str += "Word";//修改地址值，字符串只要修改，就会产生新对象，str指向新字符串对象
        i += 2;//包装对象也是不可变的，只要修改，就会产生新对象，i指向新Integer对象
        a += 2;//基本数据类型不变
        my.x += 2;//my的地址没变，变得是属性值x
    }

    @Test
    public void Test03(){
        String s = "hello";
        Integer i = 1;
        int a =1;
        MyData my = new MyData();
        my.x = 1;
        change(s,i,a,my);
        System.out.println("s = "+ s);//hello
        System.out.println("i = "+ i);//1
        System.out.println("a = "+ a);//1
        System.out.println("x = "+ my.x);//3
    }
}

class MyData{
    int x;
}
