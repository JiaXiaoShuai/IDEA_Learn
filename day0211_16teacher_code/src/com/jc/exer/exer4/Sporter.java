package com.jc.exer.exer4;

public class Sporter extends Thread {
    private long time;
    private long runtimePerMeter;//跑1米的时间
    private long restTime;//休息时间
    private static boolean flag = true;//所有Sporter对象共享
    private final int MAX_DISTANCE = 30;//最多跑30米
    private int distance;//已经跑了几米

    public Sporter(String name, long runtimePerMeter, long restTime) {
        super(name);
        this.runtimePerMeter = runtimePerMeter;
        this.restTime = restTime;
    }

    public void run(){
        long start = System.currentTimeMillis();
        while(distance < MAX_DISTANCE && flag){
            try {
                Thread.sleep(runtimePerMeter);
                distance++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() +"跑了" + distance +"米");

            if(distance==10 || distance==20){
                try {
                    Thread.sleep(restTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if(distance == MAX_DISTANCE){
            System.out.println(getName()+"已经到达终点");
            flag = false;
        }

        long end = System.currentTimeMillis();
        time = end-start;
        System.out.println(getName()+"耗时：" + time);
    }
    public long getTime() {
        return time;
    }

    public int getDistance() {
        return distance;
    }
}
