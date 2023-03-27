package com.jc.communicate2;

/**
 * 问题升级：饭店招人了。招了一个厨师，沈彦和他的女朋友。
 */
public class TestCommunicate {

    public static void main(String[] args) {
        Workbench w = new Workbench();
        //小肖做饭线程
        new Thread("小肖"){
            @Override
            public void run() {
                while(true){
                    w.put();
                }
            }
        }.start();

        //小沈做饭线程
        new Thread("小沈"){
            @Override
            public void run() {
                while(true){
                    w.put();
                }
            }
        }.start();

        //花花取饭线程
        new Thread("花花"){
            @Override
            public void run() {
                while(true){
                    w.take();
                }
            }
        }.start();

        //菲菲取饭线程
        new Thread("菲菲"){
            @Override
            public void run() {
                while(true){
                    w.take();
                }
            }
        }.start();

    }
}

class Workbench{
    private final int MAX_TOTAL = 1;
    private int total;//菜的数量
    //同步方法的锁对象，非静态方法的锁对象是this

    Object obj = new Object();
    public synchronized void put(){

        while(total >= MAX_TOTAL) {
            //做菜的线程停下来等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total++;
        System.out.println(Thread.currentThread().getName()+"做了一份菜，数量:"+total);
        this.notifyAll();
    }

    public synchronized void take(){
        while(total <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total--;
        System.out.println(Thread.currentThread().getName()+"取走了一份菜，数量："+total);
        this.notifyAll();
    }
}
