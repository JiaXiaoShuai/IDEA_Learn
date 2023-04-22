package com.jc.coll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * 6.集合元素的删除
 * 集合中会有一个变量modCount，他是int类型，用来记录集合元素个数变化的次数
 * 添加一个元素modCount++
 * 删除一个元素modCount++
 * 替换一个元素modCount不变
 * <p>
 * ArrayList类内部类Itr的部分代码中：
 * private class Itr implements Iterator<E> {
 * int cursor;//index of next element to return
 * int lastRet = -1;//index of last element returned；-1 if no such
 * int expecteModCount = modCount;使用Iterator对ArrayList进行遍历时，此时ArrayList集合元素
 * 个数变化的次数，记录下来。
 * <p>
 * 用处：
 * （1）如果在Itrator遍历ArrayList集合时，由另一个方法或另一个线程，修改ArrayList集合元素个数
 * 那么modCount和expectedModCount不一致，说明有别人或别的方法秀爱了集合的个数，那么需要警惕会不会有问题
 * <p>
 * （2）如果Iterator自己删除（或者添加元素），要同时修改modCount和expectedModCount。保证游标不会错乱
 * <p>
 * 结论：
 * 不要在foreach遍历过程中删除元素、添加元素
 * 不要再Iterator迭代器遍历集合时，用集合的删除、添加方法修改元素的个数
 * 可以再Iterator迭代器遍历集合时，使用迭代器自己的remove或add方法添加元素
 * 建议大家根据条件删除元素，使用JDK1.8新增方法moveIf,不容易出错
 * }
 */
public class TestRemove {
    @Test
    public void test01() {
        Collection coll = new ArrayList();
        coll.add("hello");
        coll.add("world");
        coll.add("I");
        coll.add("am");
        coll.add("yourFather");

        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return ((String)o).contains("o");
            }
        });
        System.out.println(coll);
    }

    @Test
    public void test02(){
        Collection coll = new ArrayList();
        coll.add("hello");
        coll.add("world");
        coll.add("i");
        coll.add("am");
        coll.add("yourFather");

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            if(s.contains("a")){
//                iterator.remove();//正确写法
                coll.remove(s);//ConcurrentModificationException：并发修改异常
            }
        }
        System.out.println(coll);
    }

    @Test
    public void test03() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("hello");
        coll.add("world");
        coll.add("I");
        coll.add("am");
        coll.add("yourFather");

        for (Object o : coll) {
            String s = (String)o;
            if(s.contains("a")){
                coll.remove(s);
            }
        }

        System.out.println(coll);
    }

    @Test
    public void test04(){

    }

    @Test
    public void test044(){
        Collection coll = new ArrayList();
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        coll.add("haha");

        //删除包含a字母的元素
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            String s = (String) iterator.next();
            if(s.contains("a")){
//                iterator.remove();
                coll.remove(s);
            }
        }

        System.out.println(coll);
    }

    @Test
    public void test033(){
        //删除包含o字母的元素
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        //foreach删除
        for (Object o : coll) {
            String s = (String) o;
            if(s.contains("o")){
                coll.remove(s);//ConcurrentModificationException：并发修改异常
            }
        }
    }
    @Test
    public void test022(){
        //删除包含o字母的元素

        Collection coll = new ArrayList();
        coll.add("hello");
        coll.add("sworld");
        coll.add("htsml");
        coll.add("mysql");
        coll.add("bigdata");

        //Iterator删除
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            String s = (String) iterator.next();
            if(s.contains("s")){
                iterator.remove();//正确的写法
//                coll.remove(s);//ConcurrentModificationException：并发修改异常
            }
        }
        System.out.println(coll);
    }
    @Test
    public void test011(){
        //删除包含o字母的元素

        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        //JDK1.8之后
        coll.removeIf(new Predicate(){

            @Override
            public boolean test(Object o) {
                return ((String)o).contains("o");
            }
        });
    }
}
