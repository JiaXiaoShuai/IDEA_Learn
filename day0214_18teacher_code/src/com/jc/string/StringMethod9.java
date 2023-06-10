package com.jc.string;

import org.junit.Test;

/*
（32）String[] split(正则)：按照某种规则进行拆分
 */
public class StringMethod9 {
    @Test
    public void test01(){
        String str = "Hello World java atguigu";
        //按照空格拆分出每一个单词
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test02(){
        String str = "Hello World java    jc";
        //按照空格拆分出每一个单词
        String[] strings = str.split(" +");
        for (String string : strings) {
            System.out.println(string);
        }

    }

    @Test
    public void test03(){
        String str = "12@4Hello2World3java4atguigu";
        //拆分单词，按照数字间隔拆分
        str =  str.replaceFirst("^\\d+","");//去掉开头的数字
        System.out.println(str);
        String[] strings = str.split("\\d");//按照数组拆分
        System.out.println(strings.length);
        for (String a:strings){
            System.out.println(a);
        }

    }

    @Test
    public void test04(){
        String str = "张三.23|李四.24|王五.25";

        //第一个拆出每一个学生的信息
        String[] studentString = str.split("\\|");//把|转为普通的字符，而不是或
        for (String studentInfo : studentString) {
            /*
            studentInfo：
                张三.23
                李四.24
                王五.25
             */
            //再把每一个学生的信息，拆分为姓名和年龄
            String[] strings = studentInfo.split("\\.");//把.转为普通的字符，而不是任意字符的意思
            //strings[0]是姓名，string[1]是年龄
            Student student = new Student(strings[0], Integer.parseInt(strings[1]));
            System.out.println(student);
        }

    }
}
