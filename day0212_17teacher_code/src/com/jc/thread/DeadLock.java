package com.jc.thread;

/**
 * 死锁：
 * 当两个或更多个线程，回想等待对方想要的锁/资源时，可能会出现死锁的情况，要尽量避免同步的嵌套
 */
public class DeadLock {
    public static void main(String[] args) {
        Object money = new Object();
        Object goods = new Object();

        Owner ow = new Owner(goods,money);
        Customer cu = new Customer(goods,money);

        Thread t1 = new Thread(ow);
        Thread t2 = new Thread(cu);
        t2.start();
        t1.start();

    }
}

//卖家
class Owner implements Runnable {
    private Object goods;//商品
    private Object money;//钱

    public Owner(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {//下方的try_catch是为了制造出没有死锁的情况，即使没有这个语句，也会出现，但是概率较小
        /*try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        synchronized (goods) {//锁对象时goods，要进入第一层同步代码块，需要先占有goods锁

            System.out.println("先发货");

            synchronized (money) {//锁对象时money，要进入第二层同步代码块，需要占用money锁
                //因为第二层同步代码块是在第一层里面，所以此时占用money锁时，并没有释放goods锁
                System.out.println("再给钱");
            }
        }
    }
}

class Customer implements Runnable {
    private Object goods;
    private Object money;

    public Customer(Object goods, Object money) {
        /*super();*/
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (money) {
            System.out.println("先给钱2");
            synchronized (goods) {
                System.out.println("再发货2");
            }
        }
    }
}