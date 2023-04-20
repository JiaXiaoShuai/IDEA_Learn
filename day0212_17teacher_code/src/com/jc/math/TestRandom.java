package com.jc.math;

import org.junit.Test;

import java.util.Random;

/**
 * java.util.Random类
 */
public class TestRandom {
    @Test
    public void test01(){
        Random rand = new Random();
        System.out.println(rand.nextInt());//所有int型整数
        System.out.println(rand.nextDouble());//0~1之间的小数
        System.out.println(rand.nextBoolean());//true/false

        int i = 1015311779;
        System.out.println(i);
    }

    @Test
    public void test02(){
        int i = 0;
        Random rand = new Random();
        System.out.println(rand.nextInt(10));//[0,10)范围整数
        while (true) {
            i++;
            System.out.println("循环了"+i+"次");
            if (rand.nextInt(10) == 9) {
                System.out.println("找到了");
                break;
            }
        }
    }
}
