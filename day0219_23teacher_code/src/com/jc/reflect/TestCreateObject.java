package com.jc.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 反射的应用之二：创建任意类型的对象
 *当然是不包括 基本数据类型和void，抽象类，接口等
 *
 *
 * 方案一：
 * 先获取这个类的Class对象
 * 调用Class对象的newInstance()方法来创建实例对象
 * 这种方式创建对象有限制，必须要求这个类有无参的公共构造器
 *
 * 方案二：
 * 先获取这个类的Class对象
 * 再获取有参构造器对象
 * 调用构造器对象的newInstance(。。。)方法来创建实例对象
 * 如果构造器是非公共的，那么需要调用构造器对象的setAccessible（true）
 *
 * 结论：为了后期很多的框架可以为你的类自动创建的对象更方便，请保留你这个类公共的无参构造
 */
public class TestCreateObject {
    @Test
    public void test01() throws Exception{
        Class<?> aClass = Class.forName("com.jc.demo.TestJc");
        Object o = aClass.newInstance();
        //obj是TestJc的对象
        System.out.println(o.getClass());

        System.out.println(o);
    }

    @Test
    public void test02()throws Exception{
        Class<?> aClass = Class.forName("com.jc.demo.Demo1");
        Object o = aClass.newInstance();
        System.out.println(o);
        /*
        java.lang.InstantiationException: com.jc.demo.Demo1
        Caused by: java.lang.NoSuchMethodException: com.jc.demo.Demo1.<init>()
        解释：Demo1没有无参构造
         */
    }

    @Test
    public void test03()throws Exception{
        Class<?> aClass = Class.forName("com.jc.demo.Demo1");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        Object o = declaredConstructor.newInstance(23, "賈小帥");
        System.out.println(o);

        /*Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor1.newInstance("jia", 22));*/
        //顛倒順序也不可以
    }

    @Test
    public void test04()throws Exception{
        Class<?> aClass = Class.forName("com.jc.demo.Demo1");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        Object o = declaredConstructor.newInstance(23, "賈小帥");
        System.out.println(o);

        /*
        java.lang.IllegalAccessException(非法訪問異常): Class com.jc.reflect.TestCreateObject
         can not access a member of class com.jc.demo.Demo1 with modifiers "private"
         */
    }

    @Test
    public void test05()throws Exception{
        Class<?> aClass = Class.forName("com.jc.demo.Demo1");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance(23, "賈小帥");
        System.out.println(o);

        /*
        java.lang.IllegalAccessException(非法訪問異常): Class com.jc.reflect.TestCreateObject
         can not access a member of class com.jc.demo.Demo1 with modifiers "private"
         */
    }
}
