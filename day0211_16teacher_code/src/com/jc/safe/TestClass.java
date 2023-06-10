package com.jc.safe;

public class TestClass {
    public static void main(String[] args) {
        Object obj = "hello";
        Class aClass = obj.getClass();//获取变量的运行时类型
        //obj的对象的运行时类型String
        System.out.println("aClass = " + aClass);


        Object obj2 = "hello";
        Class aClass2 = obj2.getClass();//获取变量的运行时类型
        //obj的对象的运行时类型String
        System.out.println("aClass2 = " + aClass2);

        System.out.println(aClass == aClass2);
    }
}
