package com.jc.api;
/*
（4）public native int hashCode()：返回该对象的哈希码值。支持此方法是为了提高哈希表（例如 java.util.Hashtable 提供的哈希表）的性能。
哈希表示一个数组+链表或数组+链表/红黑树的结构。

数组的优点：
    根据[下标]可以快速的定位到某个元素。

哈希表是一个容器，用来装对象。当哈希表中的对象有很多的时候，要查询到某个对象是否存在，工作会很大。
如何提高查询的效率？希望能够充分利用数组的优点。

但是，对于任意一个对象来说，它在查找之前，并不知道它的[下标]。
问题就转换为，如何找到快速的计算下标的方式。

[下标】 = 对象的hashCode值 & (数组的长度 - 1)。

哈希表存储对象就是这个公式来定位存储位置。
hashCode值  & (数组的长度 - 1) 计算的结果范围[0, 数组的长度-1]


因为Java中hashCode值是通过某个“算法”计算出来的一个int值，那么这个算法，可能是某个散列函数，可能是某个JVM地址值等。
本类Java希望，不同的对象，它的hashCode值是不同的，但是现实中，可能出现，两个不同的Java对象，它的hashCode相等了。

（1）如果两个对象equals返回true，那么这两个的hashCode一定要相同。
（2）如果两个对象hashCode值不相同，那么这两个对象equals也一定要不相等。
（3）如果两个对象的hashCode相同的，那么这个两个对象equals不一定相同

在重写equals方法时，一定要一起重写hashCode方法，保持它俩的上述规定。

 */
public class MethodHashCode {
    public static void main(String[] args) {
        //"Aa"和"BB"都是String类型的对象，但是它们是不同的对象
        System.out.println("Aa".hashCode());//2112
        System.out.println("BB".hashCode());//2112
        System.out.println("Aa".equals("BB"));//false
        System.out.println("Aa" == "BB");//false
    }
}
