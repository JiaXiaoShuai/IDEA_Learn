package com.jc.function;

import java.util.Iterator;

/**
 * 2、函数式接口
 *      函数式接口是指一种特殊的接口，SAM接口（single Abstract Method）只有唯一抽象方法的接口
 *      说明：抽象只有唯一的一个，但是对于非抽象方法不限制
 *
 *  函数式接口的概念是JDK1.8引入的，然后它除了要求接口是SAM特征之外，还强烈建议接口的声明上方加一个注解：
 *  @FunctionalInterface 函数式接口的注解
 *
 *  回忆之前学过的接口中，哪些接口符合SAM接口特征的？
 *
 *  (1)java.util.Comparator<T>     int compare(T t1 ,T t2)
 *  (2)java.lang.Comparable<T>     int compare(T t1,T t2)
 *  (3)java.lang.Runnable          void run()
 *  (4)java.util.function.Predicate   boolean test()
 *  (5)java.lang.Iterable<T>       Iterator<T> iterator()
 *  (6)java.io.FileFilter          boolean accept(File pathname)
 *
 *  java.io.Serializable接口，不是，没有抽象方法
 *  java.lang.Cloneable接口，不是，没有抽象方法
 *  java.util.Iterator<E>接口，不是，有两个抽象方法
 *           boolean hasNext()
 *             E next()
 *     java.util.Collection<E>、List<E>、Set<E>、Queue<E>、Deque<E>、Map<K,V>，不是，有很多抽象方法
 *
 *
 *     上面这些SAM接口中，哪些有@FunctionalInterface注解：
 *      (1)java.util.Comparator<T>     int compare(T t1 ,T t2)
 *     (2)java.lang.Runnable           void run()
 *      (3)java.util.function.Predicate   boolean test()（这个其实也是新的）
 *      （4）java.io.FileFilter       boolean accept(File pathname)
 *
 *   Java8在java.util.function包中新增了很多很多的函数式接口。
 */
public class TestFunctionInterface {

}
