package com.jc.array;

import org.junit.Test;

import java.util.Scanner;

/**
 * 1.找最大值
 *      （1）先假设第一个元素最大，复制给max
 *      （2）后面的元素与max比较，如果有比max大的，就重新修改max的值
 *
 * 2.找最大值及其下标
 *  （1）最大值只有一个
 *      设置两个变量，一个是max，一个是index
 *      A： 先假设第一个元素最大，赋值给max，index=0
 *      B：后面的元素与max比较，如果有比max大的。就重新修改max的值和index的值
 *  （2）最大值有多个
 *      A：先找到最大的值
 *      B：在数组中遍历，那些元素和最大值一样
 *
 * 3.顺序查找
 *  从头往后遍历数组，与目标元素一一比较
 *
 *  4.
 */
public class TestArray {
    @Test
    public void Test01(){
        System.out.println("Hello,World");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
