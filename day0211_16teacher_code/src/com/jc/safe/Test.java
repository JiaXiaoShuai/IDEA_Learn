package com.jc.safe;

/**
 * 主要是为了测试多个类的对象的多线程问题
 * 目前只能用静态方法去展现多线程锁，动态方法无法展现出来（对象问题）
 */

public class Test {
    public static void main(String[] args) {
        A a1 = new B("B");
        A a2 = new C("C");
        a1.start();
        a2.start();
    }
}

class A extends Thread{
    public A() {
    }

    public A(String name) {
        super(name);
    }

    private static int i = 10;

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

class B extends A{
    public B(String name) {
        super(name);
    }
}

class C extends A{
    public C(String name) {
        super(name);
    }
}