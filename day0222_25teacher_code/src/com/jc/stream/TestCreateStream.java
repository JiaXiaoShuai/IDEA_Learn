package com.jc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
4、创建Stream的几种方法
（1）通过集合对象.stream

JDK1.8在
Collection系列集合中增加了方法：
    default Stream<E> stream()

（2）通过数组工具类Arrays.stream方法

（3）Stream接口中有这样的一些静态方法，可以创建Stream
static <T> Stream<T> of(T... values)：有限流
static <T> Stream<T> generate(Supplier<T> s)        ：无限流
static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)：无限流

 */
public class TestCreateStream {
    @Test
    public void test05(){
        /*
        static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
        第二个参数是 UnaryOperator类型的
            public interface UnaryOperator<T> extends Function<T, T> ，说明它是功能型的函数式接口的变形。

            Function<T, R>接口抽象方法 R apply(T t);    参数的类型和返回值的类型可以不同
             UnaryOperator<T> 接口抽象方法 T apply(T t)   参数的类型和返回值的是一样的

         需求：对每一个元素，进行迭代处理，从第一个元素开始，每次迭代都+2，然后一直在上一次的基础上，不断迭代。
         流中的数据，第一个是seed（种子），它的值是1
         */
        Stream<Integer> stream = Stream.iterate(1, t -> t + 2);
        stream = stream.peek(t->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        stream.forEach(System.out::println);
    }
    @Test
    public void test04(){
        Stream<Double> stream = Stream.generate(Math::random);
        stream.forEach(System.out::println);
    }
    @Test
    public void test03(){
        Stream<String> stream = Stream.of("hello", "world", "java");
    }
    @Test
    public void test02(){
        int[] arr = {1,2,3,4,5};
        //创建Stream
        IntStream stream = Arrays.stream(arr);
    }
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("atguigu");

        //（1）创建Stream
        Stream<String> stream = list.stream();
    }
}
