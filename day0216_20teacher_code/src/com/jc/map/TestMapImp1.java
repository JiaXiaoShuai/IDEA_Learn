package com.jc.map;

import org.junit.Test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.text.Collator;
import java.util.*;

/**
 * Map的实现类有：
 * HashMap:哈希表
 * TreeMap:红黑树，可以实现key的排序
 * LinkedHashMap: 是HashMap的子类，可以维护(key,value)的添加顺序
 * Hashtable:哈希表
 * Properties:key和value都是String
 *
 * Hashtable和HashMap的区别：
 * （1）时间问题
 * HashMap：新
 * Hashtable：古老，早
 * （2）线程安全问题
 * Hashtable：线程安全的
 * HashMap：线程不安全的
 * （3）关于null值
 * Hashtable:不允许key，value为null
 * HashMap：允许key,value为null
 *
 * StringBuffer和StringBuilder
 * Vector和ArrayList
 *
 */
public class TestMapImp1 {

    @Test
    public void test08(){
        Properties properties = System.getProperties();
        Set<Map.Entry<Object,Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
    }

    @Test
    public void test07(){
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.language"));
    }


    @Test
    public void test06() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc.txt"));

        System.out.println(properties);

        System.out.println(properties.getProperty("\"user\""));
        properties.getProperty("computer");
    }

    @Test
    public void test05(){
        Properties properties = new Properties();
        properties.setProperty("user","chai");
        properties.setProperty("password","1234556");

        System.out.println(properties);

    }

    @Test
    public void test04(){
        TreeMap<String,Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance(Locale.CHINA).compare(o1,o2);
            }
        });

        //姓名和成绩对应
        map.put("张三",98);
        map.put("王五",45);
        map.put("赵四",66);

//        System.out.println(map);//{张三=98, 王五=45, 赵四=66}
        System.out.println(map);//{王五=45, 张三=98, 赵四=66}
    }

    @Test
    public void test03(){
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("zhangsan",89);
        map.put("lisi",96);
        map.put("wangwu",89);

        System.out.println(map);//按照字符串的自然顺序排序
    }

    @Test
    public void test02(){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        //姓名对应成绩
        map.put("张三",89);
        map.put("李四",96);
        map.put("王五",89);

        System.out.println(map);//按照输入顺序排序
    }

    @Test
    public void test01(){
        HashMap<String,Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三",89);
        map.put("李四",96);
        map.put("王五",89);
        System.out.println(map);
    }
}
