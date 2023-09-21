package com.jc.reflect;

/**
 * 哪些代码会让类初始化延迟进行？
 * （1）如果通过一个子类使用从父类继承的静态变量，静态方法时。延迟子类的初始化。
 * （2）如果使用某个类声明数组，使用数组，不会导致这个类初始化
 * （3）如果使用某个类的静态的常量，也不会导致这个类初始化
 *
 */
public class TestClassInitLazy {
    public static void main(String[] args) {
        int i = Student.i;

        Student[] arr = new Student[3];
        System.out.println(arr.length);

        System.out.println(Student.MAX);

        Student student = new Student();

        Student student1 = new Student();
    }
}

class Teacher{
    static int i = 1;
    static{
        System.out.println("Teacher静态代码块");
    }
    {
        System.out.println("Teacher动态代码块");
    }
}

class Student extends Teacher{
    public static final int MAX = 100;
    static{
        System.out.println("Student静态代码块");
    }
    {
        System.out.println("Student动态代码块");
    }
}

