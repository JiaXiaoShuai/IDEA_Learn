package com.jc.safe2;

/*
Ticket代表票，里面可以有票的号码等，票的总数量。
 */
public class Ticket {
    private final int MAX_TOTAL = 100;
    private int total = MAX_TOTAL;//初始化

    //sale：卖
    //锁对象：非静态方法，是this
    public synchronized void sale(){
        if(total>0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total--;
            System.out.println(Thread.currentThread().getName() +"卖出一张票，剩余" + total);
        }else{
            System.out.println("没有票了");
        }
    }

    public boolean check(){
        return total>0;
    }
}
