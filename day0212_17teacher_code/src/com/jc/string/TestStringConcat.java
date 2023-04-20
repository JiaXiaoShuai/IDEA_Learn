package com.jc.string;

import org.junit.Test;

/**
 * 5.字符串的拼接
 * （1）+
 * （2）concat（String s）
 *
 * +
 * A：如果左右两边都是指向常量池中的字符串拼接，结果还是在常量池
 * 常量池的字符串，只要内容相同，就是共享对象（同一个对象）
 *
 * B：如果左右两边有任意一方不是指向常量池中的字符串常量，结果就在堆中
 * 堆中的字符串不会共享
 *
 * String s1 = “hello”；s1是指向常量池中的字符串的变量
 *  final String s1 = "hello"; s1是指向常量池中的字符串的常量
 *  final String s1 = new String("hello"); s1指向堆中的 字符串的常量
 *
 *  C：只要字符串操作后面最后有调用intern（）方法，结果一定在常量池
 *
 *  总结：只有三种在常量池
 *  （1）“xxx”+“yyy”
 *  （2）（。。。。。）.intern()
 *  (3)final String 变量1 = “XXX”；
 *  final String 变量2 = “YYY”；
 *  变量1+变量2
 */
public class TestStringConcat {

    @Test
    public void test01(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";

        String s4 = s1 + "world";//拼接结果在堆
        String s5 = s1 + s2;//拼接结果在堆
        String s6 = "hello" + "world";//拼接结果在常量池中  "helloworld"
        String s7 = s1.concat(s2);
        System.out.println(s3 == s7);//false

        //==比较地址值
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//true
        System.out.println(s3 == s7);//false

        //equals比较字符串的内容
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//true
        System.out.println(s3.equals(s6));//true
    }

    @Test
    public void test02(){
        final String s1 = "hello";
        final String s2 = "world";
        String s3 = "helloworld";

        String s4 = s1 + "world";//拼接结果在堆
        String s5 = s1 + s2;//拼接结果在堆
        String s6 = "hello" + "world";//拼接结果在常量池中  "helloworld"
        String s7 = s1.concat(s2);
        System.out.println("s7:"+(s3 == s7));//false

        //==比较地址值
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true

        //equals比较字符串的内容
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//true
        System.out.println(s3.equals(s6));//true
    }

    @Test
    public void test03(){
        String s1 = new String("hello");
        String s2 = new String("world");
        String s3 = "helloworld";

        String s4 = s1 + "world";//拼接结果在堆
        String s5 = s1 + s2;//拼接结果在堆
        String s6 = "hello" + "world";//拼接结果在常量池中  "helloworld"
        String s7 = s1.concat(s2);
        System.out.println("s7:"+(s3 == s7));

        //==比较地址值
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//true

        //equals比较字符串的内容
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//true
        System.out.println(s3.equals(s6));//true
    }

    @Test
    public void test04(){
        final String s1 = new String("hello");
        final String s2 = new String("world");
        String s3 = "helloworld";

        String s4 = s1 + "world";//拼接结果在堆
        String s5 = s1 + s2;//拼接结果在堆
        String s6 = "hello" + "world";//拼接结果在常量池中  "helloworld"
        String s7 = s1.concat(s2);
        System.out.println("s7:"+(s3 == s7));

        //==比较地址值
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//true

        //equals比较字符串的内容
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//true
        System.out.println(s3.equals(s6));//true
    }

    @Test
    public void test05(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";

        String s4 = (s1 + "world").intern();//无论拼接结果是什么，只要最后有intern()，结果都放到常量池中
        String s5 = (s1 + s2).intern();
        String s6 = "hello" + "world";//拼接结果在常量池中  "helloworld"

        String s7 = s1.concat(s2).intern();
        System.out.println("s7:"+(s3 == s7));

        //==比较地址值
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true


        //equals比较字符串的内容
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//true
        System.out.println(s3.equals(s6));//true
    }
}
