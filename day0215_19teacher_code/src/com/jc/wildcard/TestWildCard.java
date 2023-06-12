package com.jc.wildcard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * 六、泛型通配
 * 1.为什么要用到泛型通配符
 * 问题：声明一个方法，形参是Collection，但是元素类型不确定，怎么办？
 *  这个方法的功能很简单，就是遍历并打印集合的元素
 *
 *  在Java中，泛型的指定必须左右两边一致的
 *
 *  总结：当我们使用一个泛型类或者泛型接口时，他的泛型不确定，可以使用<?>表示，表示未知的类型。
 *  相当于我们用<？>来指定泛型
 *      Collection<T>：这个<T>无法确定，用<?>表示
 */
public class TestWildCard {
//    方式一：Collection<Object>表达元素可以是任意类型
    //太局限，只能局限于实参是ArrayList<Object>这样的类型
    public void m1(Collection<Object> c){
        for (Object o: c){
            System.out.println(o);
        }
    }

    @Test
    public void test01(){
//        m1(new ArrayList<String>());//错误
        m1(new ArrayList<Object>());
        m1(new ArrayList<>());//可以，这个和上面的那个是一个意思
        m1(new ArrayList());//编译会有警告，泛型擦除，泛型未指定
        /*
        形参
         */
    }
}
