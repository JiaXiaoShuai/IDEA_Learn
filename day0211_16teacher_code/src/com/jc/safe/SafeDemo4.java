package com.jc.safe;


/*
静态变量也可以被多个线程共享
 */
public class SafeDemo4 {
    public static void main(String[] args) {
        TicketSale t1 = new TicketSale("窗口一");
        TicketSale t2 = new TicketSale("窗口二");
        TicketSale t3 = new TicketSale("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
class TicketSale extends Thread{
    private static int i = 1000;

    public TicketSale(String name) {
        super(name);
    }

    @Override
    public  void run() {
        while(i>=1){
            saleOneTicket();
        }
    }

    /*
   静态方法的锁对象是TicketSale类在内存中的Class对象。
     */
    public static synchronized void saleOneTicket(){
        if(i>=1){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;

            System.out.println(Thread.currentThread().getName() +"卖出1张票，剩余" + i +"张");
        }
    }


}
/*
class TicketSale extends Thread{
    private static int i = 10;

    public TicketSale(String name) {
        super(name);
    }


   // 此时非静态方法的锁对象是this，分别是上面的t1,t2,t3

    @Override
    public synchronized void run() {
        while(i>=1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;

            System.out.println(getName() +"卖出1张票，剩余" + i +"张");
        }
    }


}*/
