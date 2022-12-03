package com.jc.xiaobai.oop4;

/**
 * 测试继承
 */
public class Father {
    String name;
    int age;
    char sex;

    Father() {
        super();
    }

    Father(char sex) {
        this.sex = sex;
    }

    Father(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Father(String name, int age, char sex) {
        this(name, age);
        this.sex = sex;
    }

    protected void a() {
        age = 30;
        System.out.println("这个父类a方法被调用了");
        System.out.println("father今年：" + age + "岁了");
    }

    void b() {
        System.out.println("这个父类的b方法被调用了");
        System.out.println("father的名字叫" + name);
    }

    void c() {
        System.out.println("这个父类的c方法被调用了");
        System.out.println("father的性别是：" + sex);
    }

    static void f(){
        System.out.println("父类的静态方法");
    }
}
