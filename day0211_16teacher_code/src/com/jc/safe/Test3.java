package com.jc.safe;

public class Test3 {
    public static void main(String[] args) {
        K k = new K("K");
        J j = new J("J");
        k.start();
        j.start();
    }
}

class K extends Thread {
    public K(String name) {
        super(name);
    }

    private static int i = 100;

    @Override
    public void run() {
        while (i >= 1) {
            saleOneTicket();
        }
    }

    public static synchronized void saleOneTicket() {
        if (i >= 1) {
            try {
                Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            System.out.println(Thread.currentThread().getName() + "卖出1张票，剩余" + i + "张");
        }
    }
}

class J extends Thread {
    public J(String name) {
        super(name);
    }

    private static int i = 100;

    @Override
    public void run() {
        while (i >= 1) {
            saleOneTicket();
        }
    }

    public static synchronized void saleOneTicket() {
        if (i >= 1) {
            try {
                Thread.sleep(10);//这里加入休眠是为了让问题暴露的明显问题
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            System.out.println(Thread.currentThread().getName() + "卖出1张票，剩余" + i + "张");
        }
    }
}