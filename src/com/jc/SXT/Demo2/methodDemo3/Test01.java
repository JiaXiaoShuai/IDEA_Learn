package com.jc.SXT.Demo2.methodDemo3;

import java.util.Scanner;

/**
 * 测试递归算法recursion
 */
public class Test01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//当前时刻
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要计算的阶乘");
        long result = factorial(sc.nextLong());
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("递归耗时："+(endTime-startTime));
    }

    //阶乘
    public static long factorial(long a){
        if(a == 1){
            return 1;
        }else{
            return a* factorial(a-1);
        }
    }
}
