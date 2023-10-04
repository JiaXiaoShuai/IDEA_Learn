package com.jc.opt;

import org.junit.Test;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/*
1、为什么要引入Optional类
原因是：Java很多方法的返回值（更多是返回值）或形参是引用数据类型时，返回null。
    对方拿到这个数据时，没有做非空判断的话，会发生空指针异常。
    或者说是加非空判断if (xx != null)使得代码很臃肿。
    引入了Optional类来尽量的降低空指针异常的风险，又可以简化代码。

2、Optional类特点
（1）它是一个容器
（2）只包含一个对象的容器

3、如何使用它
（1）创建它
static <T> Optional<T> empty()：得到一个空的容器对象，里面没有元素，容器对象有。
static <T> Optional<T> of(T value)  ：得到一个包含元素的容器对象，里面一定有元素，而且非null。
static <T> Optional<T> ofNullable(T value)  ：得到一个包含元素的容器对象，里面一定有元素，元素可以是非null。可以是null。

（2）取出容器中数据
T get()：要求容器中必须有一个非空对象
T orElse(T other) ：如果容器中有非空对象，就取容器中非空对象，如果没有，就用other备胎。
T orElseGet(Supplier<? extends T> other)：如果容器中有非空对象，就取容器中非空对象，如果没有，就用Supplier供给型接口提供的对象代替。
<X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) ：如果容器中有非空对象，就取容器中非空对象，如果没有，就报一个你定义的异常

（3）其他
boolean isPresent() ：判断容器中有没有元素
void ifPresent(Consumer<? super T> consumer)  ：如果存在就执行xx代码
 */
public class TestOptional {
    public static void main(String[] args) {
        /*
        找到偶数的最大值
         */
        Random r = new Random();
        Optional<Integer> maxOpt = Stream.of(1, 3, 5, 7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(maxOpt);
        System.out.println(maxOpt.orElseThrow(()->new RuntimeException("没有偶数的最大值")));
    }
    @Test
    public void test12(){
        /*
        找到偶数的最大值
         */
        Optional<Integer> maxOpt = Stream.of(1, 3, 5, 7, 4,9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        maxOpt.ifPresent(System.out::println);
    }

    @Test
    public void test11(){
        /*
        找到偶数的最大值
         */
        Random r = new Random();
        Optional<Integer> maxOpt = Stream.of(1, 3, 5, 7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(maxOpt);
        System.out.println(maxOpt.orElseThrow(()->new RuntimeException("没有偶数的最大值")));
    }

    @Test
    public void test10(){
        /*
        找到偶数的最大值
         */
        Random r = new Random();
        Optional<Integer> maxOpt = Stream.of(1, 3, 5, 7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(maxOpt);
        System.out.println(maxOpt.orElseGet(r::nextInt));
    }

    @Test
    public void test9(){
        /*
        找到偶数的最大值
         */
//        Optional<Integer> maxOpt = Stream.of(1, 3, 5, 7, 9)
        Optional<Integer> maxOpt = Stream.of(1, 3, 5,4, 7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(maxOpt);
        System.out.println(maxOpt.orElse(0));
    }

    @Test
    public void test8(){
        /*
        找到偶数的最大值
         */
        Optional<Integer> maxOpt = Stream.of(1, 3, 5, 7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(maxOpt);
        System.out.println(maxOpt.get());//java.util.NoSuchElementException: No value present
    }

    @Test
    public void test7(){
         /*
        找到偶数的最大值
         */
        Optional<Integer> maxOptional = Stream.of(1, 3, 5, 4,7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(maxOptional);

        Integer max = maxOptional.get();
        System.out.println(max);
    }


    @Test
    public void test6(){
        /*
        找到偶数的最大值
         */
        Optional<Integer> max = Stream.of(1, 3, 5, 4,7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(max);
    }
    @Test
    public void test5(){
        /*
        找到偶数的最大值
         */
        Optional<Integer> max = Stream.of(1, 3, 5, 7, 9)
                .filter(num -> num % 2 == 0)  //保留偶数
                .max(Integer::compare);
        System.out.println(max);
    }

    @Test
    public void test04(){
//        String str = null;
        String str = "hello";
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt);
    }

    @Test
    public void test03(){
        Optional<String> opt = Optional.of(null);//错误，不能包含null，一定要包含一个非null的元素
        System.out.println(opt);
    }

    @Test
    public void test02(){
        Optional<String> opt = Optional.of("hello");
        System.out.println(opt);
    }

    @Test
    public void test01(){
        Optional<Object> opt = Optional.empty();
        System.out.println(opt);
    }
}
