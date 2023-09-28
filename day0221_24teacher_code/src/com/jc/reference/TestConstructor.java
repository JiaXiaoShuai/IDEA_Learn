package com.jc.reference;

import java.util.function.Function;

/*
17.4.2 构造器引用
当Lambda表达式是一个创建对象的表达式，即Lambda体是一个new表达式，
而且 所有构造器的实参，都是Lambda表达式的形参，那么此时就可以使用构造器引用。
语法格式：
    类名::new
 */
public class TestConstructor {
    public static void main(String[] args) {
        /*
        功能型接口Function<T,R>，有一个抽象方法 R apply(T t)
        希望它通过某个字符串，作为Person对象的name值，创建一个Person对象
         */
//        Function<String, Person> fun = s -> new Person(s);
        Function<String, Person> fun = Person :: new;

        String[] names = {"张三","李四","王五"};

        //根据names数组的字符串，创建一个Person数组
        Person[] arr = new Person[names.length];
        for(int i=0; i<arr.length; i++){
            arr [i]= fun.apply(names[i]);
        }

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
