package com.jc.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * java.lang包的类/接口使用，不用import导入包，其他包的类需要导入import
 * <p>
 * 1.java.math
 *  (1)BigInteger:大整数
 *      byte,short,int,long 当遇到这些整数类型都无法表示的更大整数时，就可以使用BigInteger
 * <p>
 * 2.RoundingMode枚举类
 *  CEILING:向正无限大方向向舍入的舍入模式
 *  DOWN:向零方向舍入的舍入模式
 *  FLOOR:向负无限大方向舍入的舍入模式
 *  HALF_DOWN:向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向下舍入
 *  HALF_EVEN:像最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向相邻的偶数舍入
 *  HALF_UP:向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向上舍入
 *  UNNECESSARY:用于断言请求的操作具有精确结果的舍入模式，因此不需要舍入
 *  UP:远离零方向舍入的舍入模式
 * <p>
 * 3.BigDecimal
 *  之前说小树类型有float和double，这两个类型都是不精确的，浮点型
 *  如果希望比float和double更精确的计算，需要使用BigDecimal。或者说数据范围超过float，double时，也要用BigDecimal
 */
public class TestBigIntegerDecimal {
    @Test
    public void test01() {
        BigInteger b1 = new BigInteger("8233434534234234343454562342");
        BigInteger b2 = new BigInteger("8233434534234234343454562345");

        /*
         * 基本数据类型运算直接使用运算符
         * 包装类对象的计算，先转为基本数据类型，在计算
         * BigInteger等对象的计算只能调用方法
         * */

        System.out.println("b1 + b2 =" + b1.add(b2));
        System.out.println("b1 - b2 =" + b1.subtract(b2));
        System.out.println("b1 * b2 =" + b1.multiply(b2));
        System.out.println("b1 / b2 = " + b1.divide(b2));
        System.out.println("b1 % b2 =" + b1.remainder(b2));
    }

    @Test
    public void test02() {
        BigDecimal b1 = new BigDecimal("294820.28034928509823094234");
        BigDecimal b2 = new BigDecimal("324.2198492847592834792835792");

        /*
         * 基本数据类型运算直接使用运算符
         * 包装类对象的计算，先转为基本数据类型，在计算
         * BigInteger等对象的计算只能调用方法
         * */

        System.out.println("b1 + b2 =" + b1.add(b2));
        System.out.println("b1 - b2 =" + b1.subtract(b2));
        System.out.println("b1 * b2 =" + b1.multiply(b2));
//        System.out.println("b1 / b2" + b1.divide(b2));//除不尽会报异常
        System.out.println("b1 / b2 =" + b1.divide(b2, 20, RoundingMode.FLOOR));
        System.out.println("b1 / b2 = " + b1.divide(b2, 19, RoundingMode.FLOOR));
        System.out.println("b1 % b2 =" + b1.remainder(b2));
    }
}
