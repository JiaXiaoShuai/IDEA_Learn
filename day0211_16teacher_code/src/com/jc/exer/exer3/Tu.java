package com.jc.exer.exer3;

public class Tu extends Thread{
    private long time;
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(99);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子跑了:"+i+"米。");
            if(i==10||i==20){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long endTime = System.currentTimeMillis();

        time = endTime-startTime;
    }
    public long getTime() {
        return time;
    }
}