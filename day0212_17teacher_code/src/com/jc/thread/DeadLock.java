package com.jc.thread;

/**
 * 死锁：
 * 当两个或更多个线程，回想等待对方想要的锁/资源时，可能会出现死锁的情况，要尽量避免同步的嵌套
 */
public class DeadLock {
    public static void main(String[] args) {

    }
}
//卖家
class Owner implements Runnable{
    private Object goods;//商品
    private Object money;//钱

    public Owner(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized(goods){//锁对象时goods，要进入第一层同步代码块，需要先占有goods锁
            System.out.println("先给钱");
            synchronized(money){//锁对象时money，要进入第二层同步代码块，需要占用money锁
                        //因为第二层同步代码块是在第一层里面，所以此时占用money锁时，并没有释放goods锁
                System.out.println("发货");
            }
        }
    }
}

class Customer implements Runnable{
    private Object goods;
    private Object money;

    public Customer(Object goods,Object money){
        /*super();*/
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized(money){
            System.out.println("先给钱");
            synchronized(goods){
                System.out.println("发货");
            }
        }
    }
}