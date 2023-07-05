package com.jc.map;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 结论：
 * 所有set底层都是Map
 *
 * 为什么？
 * 因为Map和Set有一个共同的特点：Set不允许元素重复，Map的key不允许重复
 * 所以Set其实就是取Map的key
 *
 * 那么Map不是应该有(key,value)，而Set只有element，或者说只有key，value去哪里了
 * 添加Set元素，被作为底层Map的key
 * 底层map的value是一个PRESENT常量对象
 *
 * 因为PRESENT是同一个，所以就多了一个对象而已，但是通过再次封装，产生了新的一组集合
 * HashMap，LinkedHashMap，TreeMap。。。。。
 * HashSet，LinkedHashSet，TreeSet。。。。
 */
public class TestSetMap {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        /*
        * map = new HashMap<>();
        */

        set.add("Hello");
        /*
         public boolean add(E e) {
                return map.put(e, PRESENT)==null;
         }
         添加到set中的元素，被作为底层map的key
         底层map的value是一个PRESENT常量对象

         private static final Object PRESENT = new Object();
         */
    }
}
