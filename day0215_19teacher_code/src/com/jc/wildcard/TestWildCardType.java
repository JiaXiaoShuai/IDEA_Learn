package com.jc.wildcard;

/**
 * 3.类型通配符使用有三种形式
 * <?>:表示？代表任意类型都可以
 * <? extends 上限>: 表示？代表上限或上限的子类类型
 * <? super 下限>：表示？代表下限或下限的父类
 */

/*
    声明一个集合工具类MyCollections，要求包含：
- public static boolean different(Collection\<?> c1, Collection<?> c2)：比较两个Collection集合，此时两个Collection集合的泛型可以是任意类型，如果两个集合中没有相同的元素，则返回true，否则返回false。
- public static <T> void addAll(Collection<? super T> c1, T... args)：可以将任意类型的多个对象添加到一个Collection集合中，此时要求Collection集合的泛型指定必须>=元素类型。
- public static <T> void copy(Collection<? super T> dest,Collection<? extends T> src)：可以将一个Collection集合的元素复制到另一个Collection集合中，此时要求原Collection泛型的类型<=目标Collection的泛型类型。
 */
public class TestWildCardType {
}
