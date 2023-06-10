package com.jc.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Exercise2 {

    @Test
    public void test01(){
        long startTime = System.currentTimeMillis();//开始时间
        int index1 = 0;
        int index2 = 0;
        for (int i = 3; i < 1000; i++) {
            if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                System.out.println(i);
                index1++;
            }
        }


        long middleTime = System.currentTimeMillis();


        for (int i=2; i<=100; i++){
            boolean flag = true;
            //找i不是质数的证据
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                index2++;
            }
        }


        long endTime = System.currentTimeMillis();


        System.out.println(startTime+" "+middleTime+" "+endTime);
        System.out.println("第一个方法运行的时间为：" + (middleTime - startTime)+"计数为："+index1);
        System.out.println("第二个方法运行的时间为：" + (endTime - middleTime)+"计数为："+index2);
    }

    public static void main(String[] args) {
        //（1）创建一个Collection集合primeNumbers（暂时new ArrayList())
        Collection primeNumbers = new ArrayList();
        //（2）添加100以内的质数到primeNumbers集合中
        //        质数是大于1的自然数，并且只能被1和它本身整除。
        //1不是质数
        //两次循环计数
        int index1 = 0;
        int index2 = 0;
        long startTime = System.currentTimeMillis();//开始时间
        for (int i = 3; i < 100; i++) {
            if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                System.out.println(i);
                index1++;
            }
        }
        long middleTime = System.currentTimeMillis();
        for (int i=2; i<=100; i++){
            boolean flag = true;
            //找i不是质数的证据
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                index2++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(startTime+" "+middleTime+" "+endTime);
        System.out.println("第一个方法运行的时间为：" + (middleTime - startTime)+"计数为："+index1);
        System.out.println("第二个方法运行的时间为：" + (endTime - middleTime)+"计数为："+index2);
    }


}
