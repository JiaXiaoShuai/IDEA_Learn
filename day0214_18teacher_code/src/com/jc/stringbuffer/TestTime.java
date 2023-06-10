package com.jc.stringbuffer;

import org.junit.Test;

/**
 * String、StringBuilder、StringBuffer
 * 这三个效率问题
 */
public class TestTime {
    @Test
    public void test01(){
        long startTime = System.currentTimeMillis();//获取开始时间
        String s = new String("0");
        for (int i = 1; i <=10000 ; i++) {
            s+=i;
        }
        long endTime = System.currentTimeMillis();//获取结束时间
        System.out.println("String拼接+用时：" + (endTime - startTime));//1135
        /*
        Runtime.getRuntime()：获取当前JVM的运行环境
        totalMemory()：总内存
        freeMemory()：空闲内存
        差值：已使用内存
         */
        long memory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("String拼接+memory占用内存: " + memory);
    }
    @Test
    public void test02(){
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("0");
        for(int i=1;i<=10000;i++){
            s.append(i);//也是拼接和追加
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接+用时："+(end-start));//5毫秒
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuilder拼接+memory占用内存: " + memory);//13421824字节
    }
    @Test
    public void testStringBuffer(){
        long start = System.currentTimeMillis();
        StringBuffer s = new StringBuffer("0");
        for(int i=1;i<=10000;i++){
            s.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer拼接+用时："+(end-start));//1毫秒
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuffer拼接+memory占用内存: " + memory);//13421912字节
    }
}

