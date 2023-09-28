package com.jc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
1、Stream是干什么用的？
stream这个单词，我们之前接触过，在IO流章节。在IO流章节是代表一个字节输入流或一个字节输出流，它是用于数据的传输的。
今天讲的这个stream也是代表一个数据流，但是这个数据流和之前的IO流是有区别的：
今天说的stream它是指用于数据“加工”的一套流程。例如：数据的过滤、数据的统计、数据的迭代、数据的修改、删除、查询筛选等。
stream本身是不存储数据的，存储数据的是数组、集合这样的容器。

2、Stream的特点
（1）stream本身是不存储数据的
（2）stream每一次加工处理都会产生一个新的stream对象
（3）stream的中间处理/加工操作会被延迟，一直要到最后取结果的“终结操作”才会执行。
（4）stream的加工处理不会改变的数据源（集合和数组的元素个数等）

3、如何使用stream？
（1）创建Stream     对于一个流加工链来说，只有一次
（2）中间加工处理：可以是0-n步
（3）终结操作     对于一个流加工链来说，只有一次

（2）中间加工处理的方法返回值结果仍然是stream类型。
（3）终结操作处理的方法返回值结果就不再是stream类型。表示之后无法再进行流处理。

 */
public class TestStream {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("atguigu");

        //（1）创建Stream
        Stream<String> stream = list.stream();

//        （2）中间加工处理
        //过滤(filter)，里面包含“o”字母的单词
        //Stream<T> filter(Predicate<? super T> predicate)
        //Predicate是函数式接口，就可以使用Lambda表达式进行赋值
        //Predicate抽象方法  boolean test(T t)
        stream = stream.filter(t -> t.contains("o"));

//        （3）终结操作
        //遍历流中剩下的元素
        //void forEach(Consumer<? super T> action);
        //Consumer是函数式接口，就可以使用Lambda表达式进行赋值
        //Consumer抽象方法  void accept(T t)
//        stream.forEach(t-> System.out.println(t));
        stream.forEach(System.out::println);

        System.out.println("list=" + list);

    }

    @Test
    public void test02(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三"));
        list.add(new Student("李四"));

        //（1）创建Stream
        Stream<Student> stream = list.stream();

        //（2）加工处理
        //Stream<T> peek(Consumer<? super T> action);
        //Consumer是函数式接口，就可以使用Lambda表达式进行赋值
        //Consumer抽象方法  void accept(T t)
         stream = stream.peek(System.out::println);

       //（3）第三步先不写，终结不写，发现前面代码没有执行
        //（3）第三步实现一下
        //long count();  计数   它的返回值是long,不是stream，所以也是终结操作
        long count = stream.count();
        System.out.println("count = " + count);
    }

    @Test
    public void test03(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三"));
        list.add(new Student("李四"));

        long count =  list.stream()
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);
    }
}
