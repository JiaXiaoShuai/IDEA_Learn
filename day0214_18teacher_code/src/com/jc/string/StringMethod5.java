package com.jc.string;

import org.junit.Test;

/**
 * 5.字符串截取
 * （14）String substring(int beginIndex):返回一个新字符串，他是此字符串的从beginIndex开始截取到最后的一个字符串
 * （15）String substring(int beginIndex,int endIndex):返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex（不包含）的一个子字符串
 */
public class StringMethod5 {
    @Test
    public void Test01(){
        String str = "hellojavaworld";
        String s1 = str.substring(5);


        System.out.println("s1 = " + s1);

        String s2 = str.substring(0, 5);
        System.out.println("s2 = " + s2);

        String s3 = str.substring(5, 10);
        System.out.println("s3 = " + s3);
    }
}
