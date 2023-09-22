package com.jc.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // 创建一个HashMap实例
        Map<String, Integer> map = new HashMap<>();

        // 添加键值对
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // 根据键获取值
        int value = map.get("banana");
        System.out.println("Value for key 'banana': " + value);

        // 遍历所有键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getClass());
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        for (Object entry : map.entrySet()) {
            System.out.println(entry.getClass());
            System.out.println("Key: " + ((Map.Entry)entry).getKey() + ", Value: " + ((Map.Entry)entry).getValue());
        }


        System.out.println("单独打印map.entrySet()"+map.entrySet());

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(((Map.Entry)o).getKey()+""+((Map.Entry)o).getValue());
        }
    }
}
