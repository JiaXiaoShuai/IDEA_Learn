package com.jc.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
四大新版的函数式接口：
消费型 Consumer
供给型 Supplier
判断型 Predicate
功能型 Function
 */
public class TestLambdaUse {
    @Test
    public void test05(){
        /*
        JDK1.8中Map接口新增了一个方法：
            default void replaceAll(BiFunction<? super K,? super V,? extends V> function)

            BiFunction<T,U,R>函数式接口， 它的抽象方法 R apply(T t, U u)   有2个参数，一个返回值。
         */
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"java");

        //把所有的value转为大写
//        map.replaceAll((Integer key, String value) -> {return value.toUpperCase();});
        map.replaceAll((key, value) -> value.toUpperCase());

        System.out.println(map);
    }

    @Test
    public void test04(){
        /*
            使用Lambda表达式，给一个Function接口的变量赋值，
            完成给某个字符串的首字母转为大写。

            把字符串的首字母变为大写怎么实现？
            (1) 把字符串的首字母拿出来，转为大写
            (2) 把转换后的首字母 拼接上原来字符串除了首字母的部分

            "hello"  把h拿出来，转为H，然后用H 与 "ello"拼接

            Function<T,R> 抽象方法  R apply(T t) 有参有返回值
         */
/*        Function<String, String> fun = (String s) -> {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1);
        };*/

        Function<String, String> fun = s -> Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(fun.apply("hello"));
    }
    @Test
    public void test03(){
        /*
        在Java8中，新增了一个Stream接口类型，它有一个静态方法
            static <T> Stream<T> generate(Supplier<T> s)

            供给型接口Supplier<T>  抽象方法： T get()  无参有返回值
         */
//        Stream.generate(() -> {return Math.random();});//Math.random()随机产生[0,1)范围的小数
        // Stream.generate(() -> Math.random());//Math.random()随机产生[0,1)范围的小数

        /* 这个Stream还有一个非静态方法：
         *  void forEach(Consumer<? super T> action)
         * */
    /*    Stream.generate(() -> Math.random()).forEach((Double d) -> {
            System.out.println(d);
        });*/

        Stream.generate(() -> Math.random()).forEach(d -> System.out.println(d));

    }

    @Test
    public void test02(){
        /*
           供给型接口Supplier<T>  抽象方法： T get()  无参有返回值
        例如：使用Lambda表达式给一个Supplier类型的变量赋值一个“尚硅谷"
         */
//        Supplier<String> s = () -> {return "尚硅谷";};
   /*     Supplier<String> s = () -> "尚硅谷";
        method(s);*/

        method(() -> "尚硅谷");
    }

    public <T> void method(Supplier<T> s){
        System.out.println(s.get());
    }
    @Test
    public void test01(){
         /*
        消费型接口Consumer<T>  抽象方法： void  accept(T t)  有参无返回值
        例子：
        JDK1.8 java.lang.Iterable接口增加了一个默认方法，
        public default void forEach(Consumer<? super T> action)

        Iterable接口增加了方法，意味着所有的Collection系列的集合都有这个方法。
        因为Collection接口继承了Iterable接口
            */

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("atguigu");
        list.add("java");
        list.add("bigdata");

        //forEach方法的功能是，遍历集合，并对集合的每一个元素做xx事情，具体做什么事情，
        // 由Consumer接口的accept抽象方法决定
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(s -> System.out.println(s));
    }
}
