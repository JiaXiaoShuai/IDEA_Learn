package com.jc.unsafe;

/**
 * 局部变量是不能共享的
 * 因为每一个线程对象，都会调用一次run方法，而方法的每一次调用在“栈“中都会开辟独立内存空间
 * 这里三个对象调用run方法，i变量都是独立的
 */
public class UnSafeDemo1 {
    public static void main(String[] args) {
        Windows w1 = new Windows("窗口1");
        Windows w2 = new Windows("窗口2");
        Windows w3 = new Windows("窗口3");
        w1.start();
        w2.start();
        try {
            w1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            w2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("11111111111111111111111111111111");
        System.out.println("22222222222222222222222222222222");
        System.out.println("33333333333333333333333333333333");
        /*w3.start();*/
        /*try {
            w3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
class Windows extends Thread{

    public Windows() {
    }

    public Windows(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(getName()+"卖出1张票，剩余"+i+"张");
        }
    }
}