package com.jc.exer.exer4;

public class Gui extends Thread {
    private long time;
    public Gui(String name) {
        super(name);
    }

    public void run(){
        long start = System.currentTimeMillis();
        for(int i=1; i<=30; i++){
            try {
                Thread.sleep(1000);//休眠1秒，模拟每打印1个数字，代表跑了1米，花了1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() +"跑了" + i +"米");

            if(i==10 || i==20){
                try {
                    Thread.sleep(1000);//休息1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        time = end-start;
        System.out.println(getName()+"耗时：" + time);
    }
    public long getTime() {
        return time;
    }
}
