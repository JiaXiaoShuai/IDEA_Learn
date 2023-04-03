package com.jc.safe;

/*
实例变量可以共享，但是前提必须是同一个对象。

    @Override
    public void run() {
        if (target != null) {
            target.run(); //这里三个Thread对象的target是同一个，都是TicketRunnable的对象t
        }
    }
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
    private int i = 10;

    @Override
    public void run() {
        while(i>=1){
            saleOneTicket();
        }
    }

    //卖一张票，比喻生活中，上一次卫生间
    //非静态方法的锁对象是this，调用这个方法的对象
    //当前线程对象调用这个方法
    public synchronized void saleOneTicket(){
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
/*
class TicketRunnable implements Runnable{
    private int i = 1000;

    @Override
    public synchronized void run() {
        while(i>=1){

            try {
                Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
        }
    }
}*/
