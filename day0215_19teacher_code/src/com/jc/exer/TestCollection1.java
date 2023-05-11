package com.jc.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 主要是为了测试ArrayList中的add方法的形参是Integer类型不是基本数据类型
 */

public class TestCollection1 {
    @Test
    public void test01(){
        Collection<Integer> coll = new ArrayList<>();
        coll.add(23);
//        coll.add("wo");
    }
}
