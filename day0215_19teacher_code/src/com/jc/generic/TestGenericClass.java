package com.jc.generic;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

/**
 * 二、泛型类和泛型接口
 * 1.泛型类和泛型接口有很多：
 * 下面以collection、ArrayList集合一级Iterator迭代器为例演示，泛型类与泛型接口的使用
 * <p>
 * 注意：<E>、<T>等泛型类型，只能指定为引用数据类型，不能指定为基本数据类型和void
 */

public class TestGenericClass {
    @Test
    public void Test01() {
        /*
        java.util.Collection接口：
            声明public interface Collection<E>
            说明Collection在使用时，需要指定泛型的具体类型
            这里<E>:是代表集合的元素的类型

        java。util.ArrayList类：
        声明public class ArrayList<E>
         */

        Collection<String> coll = new ArrayList<>();
        coll.add("wo");
        coll.add("ai");
        coll.add("ni");

        for (String s : coll) {
            System.out.println(s);
        }
    }

    @Test
    public void test02() {
        /*
        java.util.Collection接口：
        声明public interface Collection<E>
        说明Collection再使用时，需要指定泛型的具体类型。
        这里<E>：是代表集合的元素的类型。

        java.util.ArrayList类：
        声明public class ArrayList<E>
         */
        Collection<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("java");
        strings.add("world");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test03() {
//        （1）创建一个Collection集合（暂时创建ArrayList集合对象），并指定泛型为<Integer>
        Collection<Integer> nums = new ArrayList<>();
//（2）添加5个[0,100)以内的整数到集合中，
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            nums.add(random.nextInt(100));
        }
//（3）使用foreach遍历输出5个整数，
        System.out.println("5个元素");
        for (Integer num : nums) {
            System.out.println(num);
        }

//（4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Integer>
        //java.util.function.Predicate<T>接口，抽象方法boolean test(T t);
        nums.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

//（5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>。
        //java.util.Iterator<T>接口
        Iterator<Integer> ita = nums.iterator();
        while(ita.hasNext()){
            Integer num = ita.next();
            System.out.println(num);
        }

    }
}
