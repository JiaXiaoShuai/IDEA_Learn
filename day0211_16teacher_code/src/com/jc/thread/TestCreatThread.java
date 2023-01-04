package com.jc.thread;
/*
一个进程至少要有一个进程，java程序至少要有一个main线程，是主线程
java中开启另一个线程的方法
（1）继承Thread类
（2）实现Runnable接口
（3）实现Callable接口
（4）线程池
第一种继承Thread类：
步骤：
（1）编写一个类，让他继承Thread类
（2）重写父类的public void run（）{}
这个run()方法不是由程序员调用的，而且线程调度时，自动调用
要让一个线程做什么事，必须把这个代码写到run中
把run方法的方法体，称为线程体
（3）创建自定义线程类的对象
（4）启动线程
调用自定义线程类的对象的start()
 */
public class TestCreatThread {
    public static void main(String[] args) /*throws Exception*/{
        MyThread my = new MyThread();
//        my.start();//这个start方法是从Thread类继承
//        my.run();//不要手动调用run方法
    /*new Thread(){
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("自定义线程："+i);
            }
        }
    }.start();
    */
    Thread t = new Thread(){
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("自定义线程："+i);
            }
        }
    };
    t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程："+i);
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("自定义线程："+i);
        }
    }
}
