package com.jc.exer.exer2;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i==5){
                ChatThread ct = new ChatThread("y线程");
                ct.run();
                try {
                    ct.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ChatThread extends Thread{
    public ChatThread() {
    }

    public ChatThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("是否结束（输入Y/y结束）:");
            /*char confirm = sc.next().charAt(0);
            if(confirm == 'Y'||confirm == 'y'){
                break;
            }*/

            String answer = sc.nextLine();
            if(!answer.equals("") && Character.toUpperCase(answer.charAt(0))=='Y'){
                break;
            }
        }
        sc.close();
    }
}