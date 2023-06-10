package com.jc.string;

import org.junit.Test;

/**
 * (1)boolean isEmpty():字符串是否为空
 * (2)int length():返回字符串的长度，空格也算
 * (3)String concat(xx):拼接，等价于+
 * (4)boolean equals(Object obj):比较两个字符串是否相等，区分大小写
 * (5)boolean equalsIgnoreCase(Object obj):比较两个字符串是否相等，不区分大小写
 * (6)int compareTo(String other):比较字符串大小，区分大小写，按照Unicode编码比较大小
 * (7)int compareToIgnoreCase(String other):比较字符串大小，不区分大小写
 *
 * (8)String toLowerCase():将字符串中大写字母转换为小写
 * (9)String toUpperCase():将字符串中小写字母转换为大写
 *
 * (10)String trim():去掉字符串前后的空白符
 * (11)public String intern():结果在常量池中共享
 */
public class StringMethod1 {
    @Test
    public void test01(){
        String str = "he   llo";
        System.out.println(str.length());//字符个数
    }

    @Test
    public void test02(){
        String str = "hello";
        String newString = str.toUpperCase();
        System.out.println(str);
        System.out.println(newString);
    }

    @Test
    public void test03(){
        String str = "hello";
        str = str.toUpperCase();
        System.out.println(str);
    }

    @Test
    public void test04(){
        String str = "  Hello   World   ";
        System.out.println("[" + str + "]");
        str = str.trim();
        System.out.println("["+str+"]");
    }

    @Test
    public void test05(){
        String str = "hello";
        String newString = str.trim();
        System.out.println(str == newString);//true
    }

    @Test
    public void test06(){
        String str = "hello ";
        String newString =str.trim();
        newString = str.trim();
        System.out.println(str == newString);//false
    }

    @Test
    public void test07(){
        String str = "hello";
        String str1 = str.intern();
        System.out.println(str1);
    }
}
