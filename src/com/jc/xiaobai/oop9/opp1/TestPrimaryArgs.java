package com.jc.xiaobai.oop9.opp1;

/**
 * 基本数据类型的方法调用
 */
public class TestPrimaryArgs {
    public static void main(String[] args) {
        //定义两个变量
        int num1 = 10;
        int num2 = 20;
        //输出交换前的两个变量的值
        System.out.println("交换前：num1="+num1+",num2= "+num2);

    }
    public static void swap(int num1,int num2){
        int temp = num2;
        num2 = num1;
        num1 = temp;
    }
}
