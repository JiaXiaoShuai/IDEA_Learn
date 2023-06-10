package com.jc.exer.exer2;

import java.util.Scanner;

/*
自定义线程类ChatThread：问是否结束（输入Y/y结束），如果输入的不是y，继续问是否结束，直到输入y才结束。
主线程打印[1,10]，每隔10毫秒打印一个数字，现在当主线程打印完5之后，
就让自定义线程类加塞，直到自定义线程类结束，主线程再继续。
 */
class ChatThread extends Thread{
    public void run(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("是否结束（输入Y/y结束）？");
            /*char confirm = input.next().charAt(0);

            if(confirm == 'Y' || confirm == 'y'){
                break;
            }*/
            String answer = input.nextLine();
            if(!answer.equals("") && Character.toUpperCase(answer.charAt(0))== 'Y' ){
                break;
            }
        }
        input.close();
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i);
            if(i==5){
                ChatThread t = new ChatThread();
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
