package com.jc.reflect;

import org.junit.Test;

import java.io.Serializable;
import java.time.Month;
import java.util.Date;

/**
 * 2.Class类
 * （1）哪些类型可以获取Class对象
 * Java所有类型都有Class对象，包括基本数据类型、void、引用数据类型（数组、类、接口、枚举、注解等）
 * （2）如何获取一个类的Class对象？
 * A：最简单但是有局限性，要求编译时这个类型就是已知，已存在的类型
 * 类型名.class
 * <p>
 * B：只针对引用数据类型
 * 对象名.getClass()
 * <p>
 * C:通用的方法，一般是针对普通引用数据类型，一般数组、基本数据类型这种内置的类型或者动态编译生成的类型不会用它获取
 * Class.forName("类型的全名称")
 * <p>
 * D:一般很少用，一般用于自定义的类加载器
 * 类加载器对象.loadClass("类型的全名称“)
 * ClassLoader类中有一个方法getSystemClassLoader获取当前系统的默认的类加载器对象
 * <p>
 * 针对同一个类型来说，这四种方式获取的Class是同一个。也就是说每一种类型在内存中只有唯一的一个Class对象
 */
public class TestClass {
    @Test
    public void test05()throws Exception{
        Class c1 = String.class;
        Class c2 = "hello".getClass();
        Class c3 = Class.forName("java.lang.String");
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class c4 = loader.loadClass("java.lang.String");

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1 == c4);
        //因为这里c1,c2,c3,c4都是代表java.lang.String类型。
    }
    @Test
    public void test04() throws ClassNotFoundException {
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        Class c2 = c1.loadClass("java.lang.String");
        System.out.println(c1);
        System.out.println(c2);
    }

    @Test
    public void test03() throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String");
        System.out.println(c1);

        Class c2 = Class.forName("java.lang.Object");
        System.out.println(c2);
    }

    @Test
    public void test02() {
        Class c1 = "jia".getClass();
        System.out.println(c1);

        System.out.println(new TestClass().getClass());
    }

    @Test
    public void test01() {
        //基本数据
        Class c1 = int.class;
        //void空类型
        Class c2 = void.class;
        //数组类型
        Class c3 = int[].class;
        //类类型
        Class c4 = Object.class;
        //接口类型
        Class c5 = Serializable.class;
        //枚举类型
        Class c6 = Month.class;
        //注解类型
        Class c7 = Override.class;
        //自定义类型
        Class c8 = TestClass.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
    }
}
