package com.jc.exer;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

public class Exercise3 {
    @Test
    public void test(){
        //使用Lambda表达式给Supplier接口的变量赋值，实现产生1个100以内的整数功能。
        /*
        第一步：Supplier接口是什么样
        它是函数式接口，抽象方法 T get()  无参有返回值
        第二步：搞清楚get方法的返回值类型是什么
        返回1个100以内的整数，类型是Integer
         */
        Supplier<Integer> s =  () -> (int)(Math.random()*100);
        System.out.println(s);//打印s是得不到这个随机数呢
        System.out.println(s.get());//通过get方法就是得到随机数的方式
    }

    @Test
    public void test2(){
        //使用Lambda表达式给Supplier接口的变量赋值，实现产生1个100以内的整数功能。
        /*
        第一步：Supplier接口是什么样
        它是函数式接口，抽象方法 T get()  无参有返回值
        第二步：搞清楚get方法的返回值类型是什么
        返回1个100以内的整数，类型是Integer
         */
        Random random = new Random();
        Supplier<Integer> s =  () -> random.nextInt(100);
        System.out.println(s);//打印s是得不到这个随机数呢
        System.out.println(s.get());//通过get方法就是得到随机数的方式
    }
}
