package com.jc.safe2;

/**
 * 实例变量可以共享，但是前提必须得是同一个对象
 * 锁的对象一定要确定准确，否则会出现锁不住的现象
 */
public class SafeDemo3 {
    public static void main(String[] args) {
        TicketRunnable t = new TicketRunnable();
        Thread t1 = new Thread(t,"窗口一");
        Thread t2 = new Thread(t,"窗口二");
        Thread t3 = new Thread(t,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketRunnable implements Runnable{
    private int i = 100;
    private Object lock = new Object();

    @Override
    public void run() {
        while(i > 1){
            synchronized (TicketRunnable.class)
            /*synchronized (lock)*/
            /*synchronized (this)*/ {
                if(i >= 1){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i--;
                    System.out.println(Thread.currentThread().getName() + "卖出1张票，剩余" + i + "张");
                }
            }
        }
    }
}