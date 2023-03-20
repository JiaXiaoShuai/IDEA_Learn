package com.jc.exer.unsafe;

/*
静态变量也可以被多个线程共享
 */
public class UnSafeDemo4 {
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
    private static int i = 10;

    public TicketSale(String name) {
        super(name);
    }

    @Override
    public void run() {
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
}