package com.jc.SXT.Demo2.methodDemo2;

/**
 * 测试String按引用传递的问题
 */
public class Test04 {
    public static void main(String[] args) {
        String name1= "张三";
        Test04.changeName(name1);
        System.out.println(name1);

        int age = 18;
        Test04.changeAge(age);
        System.out.println(age);
    }
    public static void changeAge(int age){
        age = 24;

    }

    public static void changeName(String name){
        name = "李四";
    }
}
