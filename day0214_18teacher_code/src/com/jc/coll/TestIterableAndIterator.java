package com.jc.coll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 5.java.lang.Iterable接口与java.util.Iterator接口
 * （1）Iterable接口：实现这个接口允许对象成为“foreach”语句的目标。（jdk1.5增加）
 * 我们的数组默认都是实现了这个接口。
 * 我们的集合有很多也实现了这个接口，例如：Collection接口就继承了Iterable接口，那么所有Collection系列的集合实现类都实现了Iterable接口
 *
 * （2）Iterable接口有一个抽象方法
 * Iterator iterator（）：
 * 这里就可以说明，foreach循环本质上仍然依赖于java.util.Iterator接口，或者本质上就是用它
 */
public class TestIterableAndIterator {
    @Test
    public void Test01(){
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        for (Object o:
             coll) {
            System.out.println(o);
        }

        for (Object o: coll){
            if(o=="hello"){
                System.out.println("有这个");
            }
        }
    }
}
