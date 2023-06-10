package com.jc.unsafe;

/*
局部变量是不能共享的。
因为每一个线程对象，都会调用一次run方法，而方法的每一次调用在“栈”中都会开辟独立内存空间。
这里三个对象三次调用run方法，i变量都是独立的。
 */
public class UnSafeDemo1 {
    public static void main(String[] args) {
        Window  w1 = new Window("窗口一");
        Window  w2 = new Window("窗口二");
        Window  w3 = new Window("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}
class Window extends Thread{
    public Window(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=10; i>=1; i--){
            System.out.println(getName() +"卖出1张票，剩余" + i +"张");
        }
    }
}