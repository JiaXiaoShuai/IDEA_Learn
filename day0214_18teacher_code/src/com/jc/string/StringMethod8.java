package com.jc.string;

import org.junit.Test;

/**
 * 8.字符串替换
 * （29）String replace(xx,xx):不支持正则
 * （30）String replaceFirst(正则，value)：替换第一个匹配的部分
 * (31)String replaceAll(正则，value):替换所有部分
 */
public class StringMethod8 {
    @Test
    public void test01(){
        String str = "我是嫩爹";
        str = str.replace("嫩","你");
        System.out.println(str);
    }

    @Test
    public void test02(){
        String str = "hello244world.java;887";
        //里面的非字母去掉
        System.out.println(str.replaceFirst("[^a-zA-z]+", ""));
        System.out.println(str.replaceAll("[^a-zA-z]+", ""));
        System.out.println(str.replace("[^a-zA-Z]+", ""));
        System.out.println(str);

    }

}
