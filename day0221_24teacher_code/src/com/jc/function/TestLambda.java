package com.jc.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Java8 最重要的几个特性
 * 1.lambda表达式
 * 2.StreamAPI
 * 3.接口的静态方法和默认方法
 * 4.新版第三代的日期和时间
 * 5.Optional类
 *
 *
 *
 * 1、Lambda表达式的作用是 给函数式接口的变量或形参赋值用的。传递一段代码，
 *     这段代码本质上就是函数式接口的抽象方法的方法体。
 * 2、语法格式
 * (形参列表) -> {Lambda体}
 *
 * (形参列表) ：是函数式接口的抽象方法的形参列表
 * ->：称为Lambda操作符，中间不能有空格
 * {Lambda体}：就是函数式接口的抽象方法的方法体。
 *
 *3.Lambda表达式的简化条件
 * （1）当形参列表中的变量类型是已知的或自动推断（也可以说是由泛型确定了变量类型），可以省略变量类型
 * （2）当形参列表中的变量类型是已知的或自动推断（也可以说是由泛型确定了变量类型），可以省略变量类型
 *      且只有一个形参，那么可以省略（）
 * （3）当方法体只有一句时，可以省略{}和;
 * （4）当方法体只有一句时，可以省略{}和;           且有return时可以省略return
 *
 *
 * 说明：如果形参列表是()，()不能省略
 *      如果形参不止一个，()也不能省略
 *      如果Lambda体中不止一个语句{}等也不能省略。
 */
public class TestLambda {
    @Test
    public void test05(){
        String[] arr = {"hello","Bob","Rose","java","chai"};

        //匿名内部类写法，排序
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        //Lambda表达式
        Arrays.sort(arr, (String o1, String o2) -> {
                    return o1.compareToIgnoreCase(o2);
                }
        );

        //再简化
        Arrays.sort(arr, (o1, o2) -> o1.compareToIgnoreCase(o2));

    }
    @Test
    public void test04(){
        /*
        案例2：
            在一个元素都是字符串的集合中，删除 包含“o”字母的单词
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("atguigu");
        list.add("java");
        list.add("bigdata");
        //删除 包含“o”字母的单词
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("o");
            }
        });

        //从匿名内部类修改为Lambda表达式
        list.removeIf((String s) ->{return s.contains("o");});

        //简化Lambda表达式
        list.removeIf((String s) -> s.contains("o"));

        //再简化Lambda表达式
        list.removeIf((s) -> s.contains("o"));

        //再简化Lambda表达式
        list.removeIf(s -> s.contains("o"));

        System.out.println(list);
    }

    @Test
    public void test03(){
        new Thread(() -> System.out.println("wo")).start();
    }
    @Test
    public void test02(){
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };

        new Thread(r).start();
    }
    @Test
    public void test01(){
        /*
        使用Lambda表达式给Runnable接口的变量赋值。要实现打印一句话"hello lambda"
        Runnable接口的抽象方法： void run()
         */
        Runnable runnable = () -> {
            System.out.println("我是你爹");
        };

        runnable.run();
    }
}
