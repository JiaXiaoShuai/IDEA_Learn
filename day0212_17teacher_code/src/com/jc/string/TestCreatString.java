package com.jc.string;

import com.jc.array.Student;
import org.junit.Test;
/*
2、字符串的对象的创建方式有几种：
（1）直接""把字符串内容引起来，这种方式创建的是字符串的常量对象
（2）使用构造器
（3）String.valueOf()
（4） 与任意字符串进行拼接+，结果也是字符串
（5）任意对象调用toString也都是转为字符串
 */
public class TestCreatString {
    @Test
    public void Test01(){
        String s1 = "hello";
        String s2 = new String();//创建的是一个空字符串
        String s3 = new String("hello");
        char[] arr = {'h','e','l','l','o'};
        String s4 = new String(arr);
        String s5 = new String(arr,0,3);//从索引0开始取值，取三位
        byte[] bytes = {97,98,99};
        String s6 = new String(bytes);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }

    @Test
    public void Test02(){
        String s = String.valueOf(1);
        System.out.println(s);
    }

    @Test
    public void Test03(){
        String s = "";
        s += 123;
        System.out.println(s);
    }

    @Test
    public void Test04(){
        Student s = new Student(1,"张三",90);
        String str = s.toString();
        System.out.println(str);
    }
}
