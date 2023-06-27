package com.jc.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 五.泛型擦除
 * 如果用户在使用泛型类型或泛型接口时，没有主动指定泛型的类型，就会发生泛型擦除。
 * 泛型擦除后，类型变量按照哪个类型处理？是统一按照Object处理吗？
 * 不是
 * 答案：泛型擦除后，自动按照类型变量声明时的第一个上限处理，如果类型变量没有指定上限，那么按照Object处理
 */
public class TestEraser {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("hello");
        coll.add(32);
        //这里就发生了泛型擦除
    }

    @Test
    public void test02(){
        XueSheng x = new XueSheng("张三",1);
        x.setScore(new Double(2.45));//默认的一个上限可以是父类Number或者其子类的对象
    }

    @Test
    public void test03(){
        Base b = new Base();
        b.method(new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        });
    }
}

class Base <T extends Comparable & Cloneable & Iterable>{
    public void method(T t){

    }
}
