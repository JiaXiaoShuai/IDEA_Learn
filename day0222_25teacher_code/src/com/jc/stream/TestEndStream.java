package com.jc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
6、终结操作，所有方法的返回值都不再是一个Stream。
| **方法**                                   | **描述**                                                     |
| ------------------------------------------ | ------------------------------------------------------------ |
| **boolean** **allMatch(Predicate p)**      | 检查是否匹配所有元素                                         |
| **boolean** **anyMatch**(**Predicate p**)  | 检查是否至少匹配一个元素                                     |
| **boolean** **noneMatch(Predicate  p)**    | 检查是否没有匹配所有元素                                     |
| **Optional<T>** **findFirst()**            | 返回第一个元素                                               |
| **Optional<T>** **findAny()**              | 返回当前流中的任意元素                                       |
| **long** **count()**                       | 返回流中元素总数                                             |
| **Optional<T>** **max(Comparator c)**      | 返回流中最大值                                               |
| **Optional<T>** **min(Comparator c)**      | 返回流中最小值                                               |
| **void** **forEach(Consumer c)**           | 迭代                                                         |
| **T** **reduce(T iden, BinaryOperator b)** | 可以将流中元素反复结合起来，得到一个值。返回 T               |
| **U** **reduce(BinaryOperator b)**         | 可以将流中元素反复结合起来，得到一个值。返回 Optional<T>     |
| **R** **collect(Collector c)**             | 将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法 |

Collector 接口中方法的实现决定了如何对流执行收集的操作(如收集到 List、Set、Map)。
另外， Collectors 实用类提供了很多静态方法，可以方便地创建常见收集器实例。
 */
public class TestEndStream {
    @Test
    public void test09(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("ok");
        list.add("atguigu");

        Set<String> set = list.stream()
                .filter(s -> s.contains("o"))
                .peek(System.out::println)
                /*
                <R, A> R collect(Collector<? super T, A, R> collector);
                 */
                .collect(Collectors.toSet());

        System.out.println("list = " + list);
        System.out.println("set = " + set);
    }

    @Test
    public void test08(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("ok");
        list.add("atguigu");
        
        list.stream()
                .filter(s->s.contains("o"))
                .forEach(System.out::println);

        System.out.println("list = " + list);
    }
    
    @Test
    public void test07(){
        Optional<Integer> result = Stream.of(1, 2, 3, 4, 5,0)
                /*
                Optional<T> reduce(BinaryOperator<T> accumulator);

                public interface BinaryOperator<T> extends BiFunction<T,T,T>
                public interface BiFunction<T, U, R> 的抽象方法 R apply(T t, U u);

                BinaryOperator接口的抽象方法  T apply(T t, T u);
                 */
                .reduce((t1, t2) -> t1>t2?t1:t2);
        System.out.println("result = " + result);//5
    }
    @Test
    public void test06(){
        Optional<Integer> result = Stream.of(1, 2, 3, 4, 5)
                /*
                Optional<T> reduce(BinaryOperator<T> accumulator);

                public interface BinaryOperator<T> extends BiFunction<T,T,T>
                public interface BiFunction<T, U, R> 的抽象方法 R apply(T t, U u);
                
                BinaryOperator接口的抽象方法  T apply(T t, T u);
                 */
                .reduce((t1, t2) -> t1 + t2);
        System.out.println("result = " + result);//15
    }

    @Test
    public void test05(){
        //随机产生10个[0,100)的整数，找出最大的
        Random random = new Random();
        /*
        public static<T> Stream<T> generate(Supplier<T> s)

       Supplier<T>接口 T get();
         */
        Optional<Integer> max = Stream.generate(() -> random.nextInt(100))
                .limit(10)
                .peek(System.out::println)
                /*
                Optional<T> max(Comparator<? super T> comparator);
                 */
//                .max((t1,t2)->Integer.compare(t1,t2));
                .max(Integer::compare);
        System.out.println(max);
    }

    @Test
    public void test04(){
        long result = Stream.of(1, 2, 3, 4, 5)
                .count();
        System.out.println("result = " + result);
    }
    @Test
    public void test03(){
        Optional<Integer> any = Stream.of(1, 2, 3, 4, 5)
                .findAny(); 
        System.out.println(any);
    }
    @Test
    public void test02(){
        Optional<Integer> first = Stream.of(1, 2, 3, 4, 5)
                .findFirst();
        System.out.println(first);
    }

    @Test
    public void test1(){
        boolean result = Stream.of(1, 2, 3, 5, 7)  //创建Stream
                //判断流中的数据是否全部都是奇数
                /*
                boolean allMatch(Predicate<? super T> predicate);
                 */
                .allMatch(t -> t % 2 != 0);//终结Stream
        System.out.println("result = " + result);
    }
}
