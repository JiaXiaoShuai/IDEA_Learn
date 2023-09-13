package com.jc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 验证Collections中synchronizedList（）线程同步方法
 */
public class TestCollections implements Runnable{
    private List<Integer> list;
    private static int a = 1;
    public TestCollections(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            /*try {
                Thread.sleep(100); //模拟处理数据需要100毫秒的时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }

    }

    public void run1() {
        list.add(a++);

    }

    synchronized void method(){
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<Integer>());

        TestCollections ts1 = new TestCollections(list1);
        TestCollections ts2 = new TestCollections(list1);

        Thread thread1 = new Thread(ts1);
        Thread thread2 = new Thread(ts2);

        thread1.start();
        thread2.start();
        /*try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        /*ts1.run1();
        ts2.run1();
        System.out.println(list1);*/

        /*try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println(list1);

    }
}
