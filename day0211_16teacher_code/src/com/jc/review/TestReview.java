package com.jc.review;

import org.junit.Test;

/**
 * 文档注释的演示。javadoc.exe
 * @author Irene
 * @since JDK1.8
 */
public class TestReview {
    /**
     * 这是Java程序的入口，它是main方法，又称为主方法
     * @param args String[] 它是命令行参数，使用格式 java  主类名  参数1 参数2 ...
     */
    public static void main(String[] args) {

    }

    /**
     * 求两个整数相除的方法
     * @param a int 被除数
     * @param b int 除数
     * @return int 商，两个整数相除，结果只保留整数部分
     * @throws ArithmeticException 当除数为0的时候会报算术异常
     */
    @Deprecated
    public int divide(int a, int b)throws ArithmeticException{
        return a/b;
    }

    @Test
    public void test(){

    }
}
