package com.jc.unsafe;
/*
实例变量，不是所有对象共享的，而是每一个对象独立的。
 */
public class UnSafeDemo2 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("窗口一");
        Ticket t2 = new Ticket("窗口二");
        Ticket t3 = new Ticket("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
class Ticket extends Thread{
    private int i = 10;

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(i >= 1){
            i--;
            System.out.println(getName()+"卖出1张，剩余"+i+"张");
        }
    }
}