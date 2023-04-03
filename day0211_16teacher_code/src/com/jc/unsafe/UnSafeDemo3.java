package com.jc.unsafe;

/*
实例变量可以共享，但是前提必须是同一个对象。
 */
public class UnSafeDemo3 {
    public static void main(String[] args) {
        TicketRunnable t = new TicketRunnable();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();

    }
}
class TicketRunnable implements Runnable{
    private int i = 10;

    @Override
    public void run() {
        while(i>=1){

            try {
                Thread.sleep(1000);//这里加入休眠是为了让问题暴露的明显问题
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
        }
    }
}