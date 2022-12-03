package com.jc.review;

public class TestReview {
    public static void main(String[] args) {
        Week w1 = Week.MONDAY;
        String name = w1.name();
        System.out.println(name);//MONDAY
        //w1和 "MONDAY" 它们看起来好像一样，但是是不同类型的对象
        //w1是Week类型
        //"MONDAY"是String类型

        Week[] values = Week.values();

        System.out.println("---------------------------");
        String str1 = "123";
        String str2 = "456";
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(str1 + str2);//123456  拼接
        System.out.println(num1 + num2);//579  求和

        //Java是一种强类型的语言

        System.out.println("-------------------------------");
        Byte b1 = 1;
        Byte b2 = 1;
        System.out.println(b1 == b2);//比较地址

        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);//比较地址

        Integer i3 = 156;
        Integer i4 = 156;
        System.out.println(i3 == i4);//比较地址  false

        System.out.println("---------------------");
        Integer num = 1;
        change(num);
        System.out.println("num = " + num);//1

        System.out.println("---------------------");

    }
    
    public static void change(Integer i){
        i++;//i指向了新对象 2
        System.out.println("i = " + i);
    }
}
