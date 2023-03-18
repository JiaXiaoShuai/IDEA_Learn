package com.jc.thread;

/**
 * @Deprecated
 * public final void stop()：提前停止线程。已过时。
 *
 * 提前结束一个线程呢？标记法
 * 案例：
 * 声明一个PrintEvenThread线程类，继承Thread类，重写run方法，实现打印[1,100]之间的偶数，要求每隔1毫秒打印1个偶数。
 * 声明一个PrintOddThread线程类，继承Thread类，重写run方法，实现打印[1,100]之间的奇数。
 * 在main线程中：
 * （1）创建两个线程对象，并启动两个线程
 * （2）当打印奇数的线程结束了，让偶数的线程也停下来，就算偶数线程没有全部打印完[1,100]之间的偶数。
 */
public class ThreadMethod4 {
    public static void main(String[] args) {
        PrintEvenThread p1 = new PrintEvenThread("偶数");
        PrintOddThread p2 = new PrintOddThread("奇数");
        p1.start();
        p2.start();

        try {
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p1.setFlag(false);
    }
}
class PrintEvenThread extends Thread{
    private boolean flag = true;

    public PrintEvenThread() {
    }

    public PrintEvenThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 2; i <=100&&flag ; i+=2) {
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class PrintOddThread extends Thread{

    public PrintOddThread() {
    }

    public PrintOddThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i+=2) {
            System.out.println(getName()+":"+i);
        }
    }
}