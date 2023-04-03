package com.jc.thread;

/*
和线程的状态有关的方法：
public static void sleep(long millis)throws InterruptedException：线程休眠，单位毫米
public static void yield()：让当前线程暂停一下
    当前线程暂停下，让出CPU，但是下一次CPU有可能还是调用它。
void join() throws InterruptedException ：等待该线程终止。  该线程是调用join方法的线程。
void join(long millis) ：等待该线程终止的时间最长为 millis 毫秒。如果millis时间到，将不再等待。
void join(long millis, int nanos) ：等待该线程终止的时间最长为 millis 毫秒 + nanos 纳秒。
 */
public class ThreadMethod3 {
    public static void main(String[] args) {
        /*for(int i=10; i>=1; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新年到！");*/

        Thread t = new Thread("偶数线程"){
            @Override
            public void run(){
                for(int i=2; i<=20; i+=2){
                    System.out.println(getName() +":" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();

        for(int i=1; i<=100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if(i==5) {
                //让奇数线程暂停一下
//                Thread.yield();
                //让奇数线程停止，彻底让出CPU，让偶数线程执行完再继续
                /*try {
                    t.join();//偶数线程加塞，阻塞了奇数线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                try {
                    t.join(5000);//偶数线程加塞5秒，阻塞了奇数线程5秒，5秒之后又抢CPU
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
