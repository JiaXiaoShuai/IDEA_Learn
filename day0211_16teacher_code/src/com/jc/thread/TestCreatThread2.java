package com.jc.thread;
/*
第二种方式：实现Runnable接口
步骤：
（1）编写线程类，实现Runnable接口
（2）重写接口的抽象方法public void run（）
（3）创建自定义线程类的对象
（4）创建一个Thread类的对象，同时让Thread对象代理我们自定义线程的对象
创建它的目的是为了调用start方法
（5）启动线程
线程调度器会调用t对象的run方法，以为这里启动的是t线程
Thread类的run()
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
这里的target对象就是创建Thread对象时传入的Runnable接口的实现类对象。即被代理的对象
当my实参给target赋值后，target就不会为null，就会执行my对象的run方法

 */
public class TestCreatThread2 {
    public static void main(String[] args) {
        MyThread2 my = new MyThread2();
        Thread t = new Thread(my);
//        t.start();

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10; i++) {
                    System.out.println("线程："+i);
                }
            }
        }).start();*/


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10; i++) {
                    System.out.println("线程："+i);
                }
            }
        });
        t1.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("main方法："+i);
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("线程："+i);
        }
    }
}