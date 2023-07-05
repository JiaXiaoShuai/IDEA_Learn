package com.jc.owntest;

import org.junit.Test;

import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;

public class TestHashMap {

    @Test
    public void test04(){
        TreeMap<Integer,Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Collator.getInstance(Locale.CHINA).compare(String.valueOf(o1),String.valueOf(o2));
            }
        });


        map.put(55,98);
        map.put(56,45);
        map.put(34,66);


        System.out.println(map);//也可以用Collator.getInstance(Locale.CHINA).compare(o1,o2)进行比较，按照中文排序，比较数字也可以
    }

    @Test
    public void test03(){
        //HashMap无序（输出遍历的顺序和添加的顺序不一致）
        HashMap<String , Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三",89);
        map.put("李四",96);
        map.put("王五",89);

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("张三",89);
        map2.put("赵六",96);
        map2.put("钱七", 89);

        System.out.println(map);
        System.out.println(map2);

    }
}
