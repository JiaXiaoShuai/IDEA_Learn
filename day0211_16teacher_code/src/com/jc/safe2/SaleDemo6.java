package com.jc.safe2;

public class SaleDemo6 {
    public static void main(String[] args) {
        Ticket1 t = new Ticket1();

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
