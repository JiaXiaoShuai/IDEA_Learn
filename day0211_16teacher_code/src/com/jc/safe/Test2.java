package com.jc.safe;

/**
 * 主要是为了测试多个类的对象的多线程问题
 * 目前只能用静态方法去展现多线程锁，动态方法无法展现出来（对象问题）
 * 多个类接口继承Runnable接口也不行，因为会重写run方法，一个对象一个方法独立的
 * 所以还得是继承Thread类然后，用synchronized锁住run（）方法调用的静态方法,
 * 而且多个类不能直接继承Thread类
 * 因为直接继承Thread类会导致run（）方法重写，所以只能继承已经继承Thread类的类（间接继承）
 * synchronized：同步
 */

public class Test2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1();
        Thread t1 = new Thread(a1,"A1");
        Thread t2 = new Thread(b1,"B1");
        t1.start();
        t2.start();
    }
}

class A1 implements Runnable{
    public A1() {
    }


    private  int i = 100;

    @Override
    public  void run() {
        while(i>=1){
            /*if(i>=1){
                try {
                    Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
                System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
            }*/
            saleOneTicket();
        }
    }

    //卖一张票，比喻生活中，上一次卫生间
    //非静态方法的锁对象是this，调用这个方法的对象
    //当前线程对象调用这个方法
    public  synchronized void saleOneTicket(){
        if(i>=1){
            try {
                Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
        }
    }
}

class B1 implements Runnable{
    private static int i = 100;

    @Override
    public  void run() {
        while(i>=1){
            /*if(i>=1){
                try {
                    Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
                System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
            }*/
            saleOneTicket();
        }
    }

    //卖一张票，比喻生活中，上一次卫生间
    //非静态方法的锁对象是this，调用这个方法的对象
    //当前线程对象调用这个方法
    public static synchronized void saleOneTicket(){
        if(i>=1){
            try {
                Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
        }
    }
}

class C1 extends A{
    public C1(String name) {
        super(name);
    }
}