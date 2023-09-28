package com.jc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/*
5、Stream的加工处理方法
| **方  法**                          | **描  述**                                                   |
| ----------------------------------- | ------------------------------------------------------------ |
| **filter(Predicate p)**             | 接收 Lambda ， 从流中排除某些元素                            |
| **distinct()**                      | 筛选，通过流所生成元素的equals() 去除重复元素                |
| **limit(long maxSize)**             | 截断流，使其元素不超过给定数量                               |
| **skip(long n)**                    | 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补 |
| **peek(Consumer** **action)**       | 接收Lambda，对流中的每个数据执行Lambda体操作                 |
| **sorted()**                        | 产生一个新流，其中按自然顺序排序                             |
| **sorted(Comparator com)**          | 产生一个新流，其中按比较器顺序排序                           |
| **map(Function f)**                 | 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。 |
| **mapToDouble(ToDoubleFunction f)** | 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 DoubleStream。 |
| **mapToInt(ToIntFunction f)**       | 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。 |
| **mapToLong(ToLongFunction f)**     | 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 LongStream。 |
| **flatMap(Function f)**             | 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流 |

 */
public class TestMiddle {
    @Test
    public void test12(){
        Stream.of("hello", "world", "java")
                /*
                把字符串转为字符数组 : char[] toCharArray()

                <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
                    Function<T,R>是功能型函数式接口 抽象方法 R apply(T t)
                    T:  ? super T
                    R: ? extends Stream<? extends R>  说明function函数使用后，apply方法结果要是一个Stream对象
                <R> Stream<R> map(Function<? super T, ? extends R> mapper);
                    T: ? super T
                    R: ? extends R

                 */
//                .flatMap(t -> t.toCharArray())//错误，因为toCharArray方法的结果是char[]，不是一个Stream
                .flatMap(t -> {
                    char[] chars = t.toCharArray();
                    Character[] arr = new Character[chars.length];
                    for(int i=0; i<chars.length; i++){
                        arr[i] = chars[i];
                    }
                    return Arrays.stream(arr);
                })
                .forEach(System.out::println);
    }

    @Test
    public void test11(){
        Stream.of("hello", "world", "java")
        //取出每一个单词的首字母
                /*
               <R> Stream<R> map(Function<? super T, ? extends R> mapper);
               Function<T,R>是功能型函数式接口 抽象方法 R apply(T t)
                */
        .map(t -> t.charAt(0))
                .forEach(System.out::println);
    }

    @Test
    public void test10(){
        Stream.of(1,2,3,4,5)//创建Stream
                /*
                <R> Stream<R> map(Function<? super T, ? extends R> mapper);
                Function<T,R>是功能型函数式接口 抽象方法 R apply(T t)
                 */
            .map(t-> t*2)
                .forEach(System.out::println);
    }

    @Test
    public void test09() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan"));
        list.add(new Student("lisi"));

        list.stream() //创建stream
            .sorted(Comparator.comparing(Student::getName))   //中间加工 排序
                .forEach(System.out::println);

    }
    @Test
    public void test08(){
        Stream.of(4,5,6,2,1,9)//创建Stream
                .sorted()
                .forEach(System.out::println);

    }

    @Test
    public void test07(){
        //要统计这组数据中的偶数个数，并且要求统计的是不重复的偶数，然后还要打印这些偶数是谁
        long count = Stream.of(1, 2, 3, 4, 5, 2, 4, 6, 5, 3, 1) //创建Stream
                .filter(t -> t % 2 == 0) //中间加工处理  取偶数
                .distinct() //中间加工处理        去重复
                .peek(System.out::println) //中间加工处理， 打印剩下的偶数
                .count();  //终结操作

        System.out.println("偶数个数 = " + count);
    }

    @Test
    public void test06(){
        Stream.iterate(1, t -> t + 2) //创建Stream，无限流
                .skip(10) //中间操作，取第11-20个
                .limit(10)
                .forEach(System.out::println); //终结操作
    }
    @Test
    public void test05(){
        Stream.iterate(1, t -> t + 2) //创建Stream，无限流
                .skip(10) //中间操作，相当于在流中跳过前面10个取元素
                .peek(t->{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
                .forEach(System.out::println); //终结操作
    }

    @Test
    public void test04(){
        Stream.iterate(1, t -> t + 2) //创建Stream，无限流
            .limit(10) //中间操作，相当于在流中取前10个元素
                .forEach(System.out::println); //终结操作
    }
    @Test
    public void test03(){
        //去重 （去掉重复元素），并且留偶数
        Stream.of(1,2,3,4,5,2,4,6,5,3,1) //创建Stream
                .filter(t->t%2==0) //中间加工处理
                .distinct() //中间加工处理
                .forEach(System.out::println); //终结操作
    }

    @Test
    public void test02(){
        //去重 （去掉重复元素
        Stream.of(1,2,3,4,5,2,4,6,5,3,1) //创建Stream
                .distinct() //中间加工处理
                .forEach(System.out::println); //终结操作
    }

    @Test
    public void test01(){
        //过滤所有的偶数
        Stream.of(1,2,3,4,5) //创建Stream
                .filter(t->t%2==0) //中间加工处理
                .forEach(System.out::println); //终结操作
    }
}
