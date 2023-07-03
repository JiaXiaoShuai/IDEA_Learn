package com.jc.owntest;

import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {
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
