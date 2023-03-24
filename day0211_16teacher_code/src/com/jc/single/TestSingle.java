package com.jc.single;

import org.junit.Test;

import java.util.Scanner;

/**
 * 什么是单例设计模式？
 * 设计模式：是前面的很多程序员根据自己的经验，总结出来的代码的套路，代码的模板
 * 常见的经典的设计模式一共有23种，设计模式不分语言
 * 单例设计模式是指某个类的对象在整个应用程序中只有唯一的一个
 * 例如：手机系统中 时钟
 * Java的JVM运行环境
 * 后期的Spring框架中容器管理对象、、、、
 *
 * 如何实现单例设计模式
 * （1）构造器私有化
 * （2）在类的内部创建好这个类的唯一的对象
 *
 * 单例设计模式的形式
 * （1）饿汉式
 * 饿:很着急，无论你是否用到这个类的对象，在类初始的时候，就直接创建了它的对象。
 * （2）懒汉式
 * 懒：不着急，等你需要这个对象的时候，在创建这个对象
 *
 * 面试题：请写出单例设计模式的示例代码。
 * 面试题：请写出懒汉式单例设计模式的示例代码。
 * 面试题：请写出饿汉式单例设计模式的示例代码。
 */

public class TestSingle {
    public static void main(String[] args) {
        Runtime runtime1 = Runtime.getRuntime();//得到当前JVM的运行环境
        Runtime runtime2 = Runtime.getRuntime();//得到当前JVM的运行环境
        System.out.println(runtime1 == runtime2);
    }

    @Test
    public void test01() {
        One o1 = One.INSTANCE;
        One o2 = One.INSTANCE;
        System.out.println(o1 == o2);
    }

    @Test
    public void test02() {
        Two o1 = Two.INSTANCE;
        Two o2 = Two.INSTANCE;
        System.out.println(o1 == o2);
    }

    @Test
    public void test03() {
        Three o1 = Three.getInstance();
        Three o2 = Three.getInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void test04() {
        Four o1 = Four.getInstance();
        Four o2 = Four.getInstance();
        System.out.println(o1 == o2);
    }
    Four o3;
    Four o2;

    @Test
    public void test05() {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                o3 = Four.getInstance();
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                o2 = Four.getInstance();
            }
        };
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(o2 == o3);


    }

    @Test
    public void test06(){
//        Five.method();

        Five o1 = Five.getInstance();
        Five o2 = Five.getInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void name() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}



class One {
    public static final One INSTANCE = new One();

    private One() {
    }
}

enum Two {
    INSTANCE;
}

class Three {
    private static Three instance = new Three();

    private Three() {
    }

    public static Three getInstance() {
        return instance;
    }
}

class Four {
    private static Four instance;

    private Four() {

    }

    public synchronized static Four getInstance() {
        if (instance == null) {
            instance = new Four();
        }
        return instance;
    }
}


class Five{
    private Five(){}

    private static class Inner{
        /*       static {
                   System.out.println("内部类的静态代码块");
               }*/
        static Five instance = new Five();
    }

    public static Five getInstance(){
        return Inner.instance;
    }

   /* static {
        System.out.println("外部类的静态代码块");
    }

    public static void method(){
        System.out.println("外部类的method方法");
    }*/
}