package com.jc.generic;

/**
 * 3.泛型可以在哪里声明
 *（1）在类或者接口名后面声明，这样的类和接口被称为泛型类和泛型接口，或者是参数化的类型
 *      public interface Comparable<T>{
 *          public int compareTo(T o);//这个不是泛型方法
 *      }
 * (2)在方法的返回值类型前面，这样的方法成为泛型方法。
 * java.util.Arrays类:
 *      public static <T> List<T> asList(T... a){
 *          return new ArrayList<>(a);
 *      }
 */
public class TestGenericType {

}
