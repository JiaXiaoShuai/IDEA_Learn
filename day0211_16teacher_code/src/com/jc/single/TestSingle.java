package com.jc.single;

import org.junit.Test;

import java.util.Scanner;

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