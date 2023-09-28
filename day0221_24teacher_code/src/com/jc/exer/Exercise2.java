package com.jc.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise2 {
    @Test
    public void test01(){
        /*
        案例：创建一个ArrayList，并添加26个小写字母到list中，并使用forEach遍历输出
         */
        ArrayList<Character> list = new ArrayList<>();
        for(char c = 'a'; c<='z'; c++){
            list.add(c);
        }

        //用最新的forEach方法遍历
        /*
        第一步：搞清楚forEach方法的方法签名
        方法 = 方法头 +  方法体，方法头又被称为方法签名。
        方法头：【修饰符】 返回值类型  方法名(【形参列表】 )【throws 异常列表】
        方法体：{语句代码}

        void forEach(Consumer<? super E> action)

        第二步： 搞清楚Consumer接口的抽象方法，它是一个函数式接口，就可以使用lambda表达式

        抽象方法：void accept(T t)
        对于函数式接口的抽象方法来说，用lambda表达式给他赋值时，不关心方法名，关心形参列表和返回值类型
         */
        list.forEach(t -> System.out.println(t));
    }

    @Test
    public void test02(){
        /*
        案例：创建一个HashMap，并添加如下编程语言排名和语言名称到map中，并使用forEach遍历输出
        | 排名 | 语言   |
        | ---- | ------ |
        | 1    | Java   |
        | 2    | C      |
        | 3    | Python |
        | 4    | C++    |
        | 5    | C#     |
         */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"C");
        map.put(3,"Python");
        map.put(4,"C++");
        map.put(5,"C#");

        /*
        第一步：搞清楚map集合的forEach方法的签名
        public default void forEach(BiConsumer<? super K,? super V> action)

        第二步：搞清楚BiConsumer接口的抽象方法
            void accept(T t, U u)

        第三步：这里的T和U对应什么东西
            从forEach方法的签名 (BiConsumer<? super K,? super V> action)中，
            可以看出，T 对应的是  ? super K  ==>key
            可以看出，U 对应的是  ? super V  ==>value
         */
        map.forEach((key,value) -> {
            System.out.println(key + "="+  value);//拼接
        });
    }
}
