package com.jc.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 三、泛型方法
 * 1、在java.util.Arrays工具类中，就有这样一些泛型方法：
 * （1）public static <T> List<T> asList(T... a):这个T类型代表未知的形参类型
 * 即在设计这个方法时，无法确定形参的类型。形参是要添加到List集合中的元素。
 * <p>
 * （2） public static <T> T[] copyOf(T[] original ,int newLength):复制一个新的数组
 * 这里新的数组的类型不确定，原数组的类型也不确定。用T来表示
 */
public class TestGenericMethod {
    @Test
    public void test01() {
        Arrays.asList("hello", "java", "world");//ctrl+alt+v  直接跳出来了
        List<String> strings = Arrays.asList("hello", "java", "world");
        /*
         * 由方法的实参类型，自动推断了方法形参的类型是String
         * */

        System.out.println(strings);
    }

    @Test
    public void test02() {
//        （1）创建一个Collection集合（暂时创建ArrayList集合对象），并指定泛型为<String>
        Collection<String> coll = new ArrayList<>();
        //（2）添加如下单词到集合中，
//hello,java,world,atguigu,love,you,mom,dad,noon
        List<String> list = Arrays.asList("hello", "java", "world", "love", "you", "mom", "dad", "noon");
        coll.addAll(list);
    }

    @Test
    public void test03(){
        List<String> list = Arrays.asList("hello", "java", "world", "love", "you", "mom", "dad", "noon");

//        list.add("java");//UnsupportedOperationException
//        list.remove("java");//UnsupportedOperationException
        //因为Arrays工具类的asList方法返回的集合是一个“只读”集合。不能添加元素、删除元素。
        System.out.println(list.getClass());//返回对象运行时类型 class java.util.Arrays$ArraysList


    }
    @Test
    public void test04(){
        String[] arr = {"hello", "java", "world", "love", "you", "mom", "dad", "noon"};
        String[] strings = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(strings));
    }
}
