package com.jc.exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Exercise1 {
    public static void main(String[] args) {
//        （1）创建一个Collection集合（暂时创建ArrayList集合对象），并指定泛型为<String>
        Collection<String> coll = new ArrayList<String>();
        //（2）添加如下单词到集合中，
//hello,java,world,atguigu,love,you,mom,dad,noon

        coll.add("hello");
        coll.add("java");
        coll.add("world");
        coll.add("love");
        coll.add("you");
        coll.add("mom");
        coll.add("noon");

        //（3）使用foreach遍历输出，
        for(String s : coll){
            System.out.println(s);
        }


//（4）使用集合的removeIf方法删除回文单词，为Predicate接口指定泛型<String>
        //回文单词是指正着读和反着读，拼写是一样，例如mom
        System.out.println("=================分隔=================");
        coll.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                StringBuffer sb = new StringBuffer(s);
                if (s.equals(sb.reverse().toString())){
                    return true;
                }else{
                    return false;
                }
            }
        });

        for(String s: coll){
            System.out.println(s);
        }

//（5）再使用Iterator迭代器输出剩下的单词以及单词的长度，为Iterator接口指定泛型<String>。
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        coll.remove("world");
        for(String s : coll){
            System.out.println(s);
        }
    }
}
