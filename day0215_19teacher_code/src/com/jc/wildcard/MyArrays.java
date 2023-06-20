package com.jc.wildcard;

import com.jc.exer.Exercise5;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
/*
（1）在数组工具类MyArrays中声明如下泛型方法：
- 可以在任意类型的对象数组中，查找某个元素的下标，按照顺序查找，如果有重复的，就返回第一个找到的，如果没有返回-1


 */

public class MyArrays {
    @Test
    public void test01() {
        Collection<String> c4 = new ArrayList<>();
        c4.add("hello");
        c4.add("world");
        c4.add("java");
        c4.add("h5");

        System.out.println(arrayFind(c4, "t"));
        System.out.println("=====================================");
        System.out.println(arrayFind(c4, "h5"));
    }

    @Test
    public void test02() {
        Collection c1 = new ArrayList<>();
        c1.add(3);
        c1.add(3.2);
        c1.add('A');
        c1.add("wo");
        System.out.println(arrayFind(c1, 3));
        System.out.println(arrayFind(c1, 3.2));
        System.out.println(arrayFind(c1, "wo"));
        System.out.println(arrayFind(c1, 'A'));
        System.out.println(arrayFind(c1, 'd'));
    }

    @Test
    public void test03() {
        Collection c1 = new ArrayList<>();
        Exercise5 d = new Exercise5();
        c1.add(3);
        c1.add(3.2);
        c1.add('A');
        c1.add("wo");
        c1.add(d);
        System.out.println(arrayFind01(c1, 3));
        System.out.println(arrayFind01(c1, 3.2));
        System.out.println(arrayFind01(c1, "wo"));
        System.out.println(arrayFind01(c1, 'A'));
        System.out.println(arrayFind01(c1, d));
        System.out.println(arrayFind01(c1, "ss"));
    }

    @Test
    public void test04(){
        Collection c1 = new ArrayList<>();
        Exercise5 d = new Exercise5();
        c1.add(3);
        c1.add(3.2);
        c1.add('A');
        c1.add("wo");
        c1.add(d);
        System.out.println(arrayFind02(c1,3));
        System.out.println(arrayFind02(c1,3.2));
        System.out.println(arrayFind02(c1,'A'));
        System.out.println(arrayFind02(c1,"wo"));
        System.out.println(arrayFind02(c1,d));

    }
    public static <T> int arrayFind(Collection<?> coll, T t) {
        ArrayList<T> arr = new ArrayList<>();
        arr = (ArrayList<T>) coll;
        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(arr.get(i));
            if (arr.get(i).equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int arrayFind01(Collection<?> coll, T t) {
        Iterator it = coll.iterator();
        int index = 0;
        while (it.hasNext()) {
            Object s = it.next();
            if (s.equals(t)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static <T> int arrayFind02(Collection<?> coll, T t) {
        int index = 0;
        for (Object o : coll) {
            if (o.equals(t)) {
                return index;
            }
            index++;
        }
        return -1;
    }

/*
- 可以在任意类型的对象数组中，查找最大值，要求元素必须实现Comparable接口
 */

    public static <T extends Comparable<? super T>> T max(T[] arr){
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max.compareTo(arr[i]) < 0){
                max = arr[i];
            }
        }
        return max;
    }


    /*
    - 可以在任意类型的对象数组中，查找最大值，按照指定定制比较器来比较元素大小
     */

    public static <T> T max(T[] arr, Comparator<? super T> com){
        T max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(com.compare(max,arr[i]) < 0){
                max = arr[i];
            }
        }

        return max;
    }
}
