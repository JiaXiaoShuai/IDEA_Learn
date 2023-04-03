package com.jc.safe2;

public class SaleDemo5 {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        new Thread("窗口一"){
            public void run(){
                while(t.check()) {
                    t.sale();
                }
            }
        }.start();

        new Thread("窗口二"){
            public void run(){
                while(t.check()) {
                    t.sale();
                }
            }
        }.start();

    }
}
