package com.jc.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

public class TestThread {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.completedFuture("异步线程");

        future.thenAccept(result -> System.out.println(result));
        A a = new A();
        a.start();

        Thread th = new Thread(()-> System.out.println("wo"));
        th.start();


//        new FutureTask<String>(() ->  "woshi");

        Thread thr = new Thread(new FutureTask<String>(() ->{
            System.out.println("thr的线程");
            return "sss";
        }));
        thr.start();

    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("woshinidie");
    }
}