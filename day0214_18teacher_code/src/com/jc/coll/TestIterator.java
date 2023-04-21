package com.jc.coll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
4、迭代器
所谓的迭代器就是用来遍历（挨个访问）集合元素的对象/工具。
java.util.Iterator接口，这是迭代器接口。

方法：
（1）boolean hasNext()：判断集合是否还有元素可以迭代
（2）Object next():取出当前元素，并且迭代器往后移动
（3）void remove() ：用于删除刚刚迭代的元素

Collection系列的集合中，有一个方法：
Iterator iterator();  这个方法是返回遍历当前集合对象的一个迭代器对象
 */
public class TestIterator {
    @Test
    public void test01(){
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add('a');
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        /*
        左边Iterator是接口，右边coll.iterator()方法体中会返回Iterator接口的一个实现类对象。
        具体是哪个实现类对象，要看集合类型，例如：ArrayList集合类型，返回的是
            ArrayList类中的Itr内部类，它实现了Iterator接口。
         */
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println(iterator.next());
    }

    @Test
    public void test02() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        /*coll.add('a');*/
        coll.add("mysql");
        coll.add("bigdata");

        //删除包含"o"字母的字符串
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            String s = (String) iterator.next();
            if(s.contains("o")){
                iterator.remove();//删除刚刚next方法取出的元素
            }
        }
        System.out.println(coll);

    }


    @Test
    public void test03(){
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        /*coll.add('a');*/
        coll.add("mysql");
        coll.add("bigdata");

        /*Object[] arr = coll.toArray();*/

        for(Object s:coll.toArray()){
            System.out.println(s);
        }

    }
}
