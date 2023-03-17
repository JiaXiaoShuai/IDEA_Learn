package com.jc.thread;

/**
 * java.lang.Thread类有哪些方法？
 * 构造方法：
 * -public Thread():分配一个新的线程对象
 * -public Thread(String name)：分配一个指定名字的新的线程对象
 * -public Thread(Runnable target)：分配一个带有指定目标新的线程对象
 * -public Thread(Runnable target)：分配一个带有指定目标和指定名字的线程对线
 *
 * String getName():获取线程的名称
 * 如果没有手动指定线程名称，默认是Thread-编号，从0开始
 * 如果需要手动指定线程名称，可以通过构造器，或者setName方法设置线程名称
 *
 * static Thread currentThread():获取当前语句的线程对象
 */
public class ThreadMethod1 {
    public static void main(String[] args) {
        SubThread s1 = new SubThread();
        SubThread s2 = new SubThread("线程2");
        SubThread s3 = new SubThread();
        s1.start();
        s2.start();
        s3.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        }

        ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(getName());
            }
        },"线程6").start();
    }
}
class SubThread extends Thread{
    //子类构造器首行一定会调用父类的构造器，默认调用的就是无参构造

    public SubThread() {
        super();
    }

    public SubThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());//getName()方法从父类Thread继承的
    }
}