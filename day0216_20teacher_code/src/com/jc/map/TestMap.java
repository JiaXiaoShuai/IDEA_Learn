package com.jc.map;

import com.jc.map.MyKey;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.junit.Test;

import java.util.*;

/**
 * 1.Collection和Map的区别？
 * Collection：表示一组对象
 * Map：表示一组键值对（key,value）
 * <p>
 * Map特点：
 * key不重复，value可以重复
 * 如果key重复了，后面的value会覆盖前面的value
 * <p>
 * <p>
 * 2.java.util.Map<K,V>的方法
 * （1）添加
 * V put（K key，V value）
 * void putAll(Map<? extends K, ? extends V> m)
 * （2）删除
 * void clear()
 * V remove(Object key)
 *
 * (3)
 * 没有修改，就是重新put，而且只能修改value，不能修改key
 * 如果key被修改了，会导致原来的数据找不到，也删不掉
 *
 * （4）
 * 查询
 * V get(Object key)
 * boolean containsKey(Object key)
 * boolean containsValue(Object key)
 * boolean isEmpty()
 * int size();
 *
 * (5)遍历
 * Set<K> keySet():获取所有的key，然后遍历所有的key
 * Collection<V> values():获取所有的value，然后遍历所有的value、
 * Set<Map.Entry<K,V>> entrySet():遍历所有的键值对（key ，value）
 * Map中的素有的键值对（key ， value）都是Map.Entry接口的实现类
 */
public class TestMap {
    @Test
    public void test011(){
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("周旭", Arrays.asList("小花"));
        map.put("杨震", null);
        map.put("沈彦",Arrays.asList("小花","小薇"));
        System.out.println(map);

        //查询有没有同学的女朋友是小薇
        Collection<List<String>> values = map.values();
        for (List<String> list : values) {
            if(list != null) {
                for (String name : list) {
                    if ("小薇".equals(name)) {
                        System.out.println("存在");
                    }
                }
            }
        }
    }

    @Test
    public void test10() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }


    @Test
    public void test09() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }


    @Test
    public void test08() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        //所有的key为什么用Set集合装，是因为所有的key不会重复。
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }

    @Test
    public void test07(){
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("周旭", Arrays.asList("小花"));
        map.put("杨震", null);
        map.put("沈彦",Arrays.asList("小花","小薇"));
        System.out.println(map);

        //查询有没有同学的女朋友是小薇
        System.out.println(map.containsValue("小薇"));//false,因为“小微”是String类型，而Value是List类型
    }

    @Test
    public void test06() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(100));
    }


    @Test
    public void test05() {
        HashMap<MyKey, Integer> map = new HashMap<>();
        MyKey k1 = new MyKey(1);
        map.put(k1, 1);
        System.out.println(k1.hashCode());
        MyKey k2 = new MyKey(2);
        map.put(k2, 2);
        System.out.println(map);
        k1.setNum(3);
        System.out.println("改变后："+ k1.hashCode());
        System.out.println(map.get(k1));

        //因为改变k1的hashCode值，所以找不到这个键值对应的value
        //即使我又重新弄了一个对象（使hashCode为没修改前的），但是还是结果还是为null
        MyKey k3 = new MyKey(1);
        System.out.println(map.get(k3));
        System.out.println(k3.hashCode());
        System.out.println(map);
    }

    @Test
    public void test04() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

//        map.remove("李四");//根据key删除一对键值对
//        System.out.println(map);
        map.put("李四", null);//如果只删除value那就用put()方法实现value的覆盖
        System.out.println(map);
    }

    @Test
    public void test03() {
        //HashMap无序（输出遍历的顺序和添加的顺序不一致）
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("张三", 100);
        map2.put("赵六", 96);
        map2.put("钱七", 89);

        map.putAll(map2);
        System.out.println(map);
        map2.putAll(map);
        System.out.println(map2);
    }

    @Test
    public void test02() {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("老王", Arrays.asList("小花"));
        map.put("老张", null);
        map.put("老李", Arrays.asList("小花", "小微"));
        System.out.println(map);

        HashMap<List<String>, List<String>> map1 = new HashMap<>();
        map1.put(Arrays.asList("A", "B", "C"), Arrays.asList("a", "b", "c"));
        map1.put(Arrays.asList("D", "E", "F"), Arrays.asList("d", "e", "f"));
        map1.put(Arrays.asList("G", "H", "I"), Arrays.asList("g", "h", "i"));
        System.out.println(map1);

        //有一些集合可以添加其他集合用构造方法
        Vector<String> vector = new Vector<>(Arrays.asList("我爱你"));

    }

    @Test
    public void test01() {
        //HashMap是Map接口的一个实现类
        //HashMap<K,V>:K代表的是key的类型，V代表的value的类型
        //例如：存储班级的学员姓名和他（她）对象的姓名的
        //最终实现，可以根据班级的学员的姓名，快速找到他（对象）的姓名
        //班级学员的姓名当key。他（她）对象的姓名当value

        HashMap<String, String> map = new HashMap<>();
        System.out.println(map.put("老李", "小花"));
        System.out.println(map.put("老张", "小花"));
//        map.put("老李","小微");//键值重复时，新的会覆盖旧的value
        map.put("老王", null);
        map.put("老赵", "小花");
        map.putIfAbsent("老",null);

        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
