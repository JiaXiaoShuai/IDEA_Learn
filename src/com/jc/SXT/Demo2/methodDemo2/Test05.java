package com.jc.SXT.Demo2.methodDemo2;

public class Test05 {
    public static void main(String[] args) {
        String name1= "张三";
        Test04.changeName(name1);
        System.out.println(name1);

        int age = 18;
        Test04.changeAge(age);
        System.out.println(age);
    }
}
