package com.jc.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.和字符，或字符数组有关
 * (16)char charAt(index):返回【index】位置的字符
 * (17)char[] toCharArray():将此字符串转换为一个新的字符数组返回
 *
 * (18)String(char[] value):返回指定数组中表示该字符序列的String(构造方法)
 * (19)String(char[] value,int offset,int count):返回指定数组中表示该字符序列的String
 *
 * (20)static String copyValueOf(char[] data):返回指定数组中表示该字符序列的String
 * (21)static String copyValueOf(char[] data,int offset,int count):返回指定数组中表示该字符序列的String
 * (22)static String valueOf(char[] data,int offset,int count):返回指定数组中表示该字符序列的String
 * (23)static String valueOf(char[] data):返回指定数组中表示该字符序列的String
 * 这两对是对应一样的功能
 */
public class StringMethod3 {
    @Test
    public void test01(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入性别：");
        char gender = input.next().charAt(0);
        /*
        input.next()，通过对象调用next方法，说明next()是非静态方法
        input.next()的返回值类型String类型，因为只有String类型才有charAt()方法，
        即input.next()的结果是一个字符串对象

        xx.charAt(0)：字符串对象再调用charAt()方法
        (0)是表示取字符串的第一个字符，即返回字符串内部的char[] value数组的第一个元素。
        */
        System.out.println("gender = " + gender);//输出并换行
        /*
        System.out：是System类的一个静态常量对象，因为通过System类名.访问的
        println方式是out对象调用，它是非静态方法，而且不是System类中的
         */
        input.close();
    }

    @Test
    public void test02(){
        String str = "hello";
        char[] chars = str.toCharArray();

        chars[0] = 't';
        System.out.println(str);
        System.out.println(Arrays.toString(chars));
    }

    @Test
    public void test03(){
        char[] arr = {'h','e','l','l','o'};
        System.out.println(new String(arr));
        System.out.println(new String(arr, 1, 4));
        System.out.println(String.copyValueOf(arr));
        System.out.println(String.copyValueOf(arr, 1, 4));
        System.out.println(String.valueOf(arr));
        System.out.println(String.valueOf(arr, 1, 4));
    }
}
