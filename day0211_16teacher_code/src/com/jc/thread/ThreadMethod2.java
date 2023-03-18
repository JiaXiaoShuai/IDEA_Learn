package com.jc.thread;

/**
 * public final int getPriority():返回线程优先级
 * public final void setPriority(int newPriority):改变线程的优先级
 * 线程优先级高的，更多机会/概率被优先调用
 * 优先级有范围：【MIN_PRIORITY，MAX_PRIORITY】,即【1,10】
 * 3个常量值
 * MIN_PRIORITY:1
 * NORM_PRIORITY:5
 * MAX_PRIORITY:10
 */
public class ThreadMethod2 {
    public static void main(String[] args) {
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        Thread t = new Thread() {
            @Override
            public void run() {
                /*for (int i = 2; i <=10 ; i+=2) {
                    System.out.println("自定义线程:"+i);
                }*/

                System.out.println(getName() + ":" + getPriority());
            }
        };

//        t.setPriority(100);//java.lang.IllegalArgumentException 非法参数异常
        //当设置的优先级不在MIN_PRIORITY到MAX_PRIORITY范围内，就会报这个异常
        //t.setPriority(Thread.MAX_PRIORITY);
//        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        /*for (int i = 1; i <= 10; i += 2) {
            System.out.println("主线程:"+i);
        }*/

        System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());
    }
}
