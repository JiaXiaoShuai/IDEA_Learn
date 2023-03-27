package com.jc.thread;

import org.junit.Test;

/**
 * 守护线程的概念（非重点，了解）
 * <p>
 * 什么是守护线程，它有什么特点？
 * 线程分为被守护线程和守护线程
 * 当系统中所有的被守护线程都结束后，守护线程就算自己的事情没有做完，也会自动结束
 * 即系统中不会只有守护线程在单独运行
 * 后台运行的GC线程等就是守护线程，当main方法线程结束了，GC线程就没有必要存在了
 * <p>
 * 2如何设置守护线程？
 * public final void setDaemon(boolean on)
 */
public class DaemonThread {
    public static void main(String[] args) {
        MyDaemon my = new MyDaemon();
        my.setDaemon(true);//把my线程变为守护线程，这里main线程就是非守护线程
        my.start();

        for (int i = 1; i < 100; i++) {
            System.out.println("main:"+i);
        }
    }

    @Test
    public void Test01(){
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=100 ; i++) {
                    System.out.println("自定义线程:"+i);
                }
            }
        }.start();//在JUnit的测试方法中，启动的其他线程，都默认是守护线程，有可能当前线程任务还未完成，答案是Junit方法运行结束了，也会自动结束
        System.out.println("test方法");
    }

}

class MyDaemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("我一直守护着你....");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}