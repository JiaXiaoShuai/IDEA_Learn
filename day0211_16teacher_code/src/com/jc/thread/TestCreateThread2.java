package com.jc.thread;

/*
第二种方式：实现Runnable接口
步骤：
（1）编写线程类，实现Runnable接口
（2）重写接口的抽象方法public void run()
（3）创建自定义线程类的对象
（4）创建一个Thread类的对象，同时让Thread对象代理我们的自定义线程对象
创建它的目的是为了调用start方法
（5）启动线程

线程调度器会调用t对象的run方法，因为这里启动的是t线程。（t.start())
Thread类的run()
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

 这里的target对象就是创建Thread类对象时传入的Runnable接口的实现类对象，即被代理对象。
 当my实参给target赋值后，target就不会为null，就会执行my对象的run方法。
 */
public class TestCreateThread2 {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t = new Thread(my);//让t对象代理my对象
        t.start();

/*        new Thread( new Runnable(){
            @Override
            public void run() {
                //让这个线程打印[1-10]的偶数
                for(int i=2; i<=10; i+=2){
                    System.out.println("自定义线程： " + i);
                }
            }
        }).start();*/

/*        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                //让这个线程打印[1-10]的偶数
                for(int i=2; i<=10; i+=2){
                    System.out.println("自定义线程： " + i);
                }
            }
        });
        t.start();*/


        //在main线程中，打印[1-10]的奇数
        for(int i=1; i<=10; i+=2){
            System.out.println("main:" + i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        //让这个线程打印[1-10]的偶数
        for(int i=2; i<=10; i+=2){
            System.out.println("自定义线程： " + i);
        }
    }
}