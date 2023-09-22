package com.jc.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 演示：如何通过反射操作某个类的静态变量和静态方法
 * 反射操作静态方法的步骤：
 * （1）获取Class对象
 * （2）先获取你要调用的方法的Method对象
 * （3）调用方法
 * <p>
 * 通过Method对象.invoke(实例对象，实参)
 * <p>
 * <p>
 * 反射操作静态变量的步骤
 * （1）获取Class对象
 * (2)获取要操作/访问的静态变量的Field对象
 * (3)某个静态变量对应的Field对象.setAccessible(true); （如果修饰符允许，可以省略这步）
 * (4)可以访问静态变量的值，或者给静态变量赋值
 * 某个静态变量对应的Field对象.get(null)就是获取静态变量的值
 * 某个静态变量对应的Field对象.set(null,值)就是设置静态变量的值
 */
public class TestStaticFieldMethod {
    @Test
    public void test01() throws Exception {
        Class<?> clazz = Class.forName("com.jc.bean.Student");
        Method addMethod = clazz.getDeclaredMethod("addMethod", int.class, int.class);
        Object invoke = addMethod.invoke(clazz, 1, 1);
        Object invoke1 = addMethod.invoke(null, 1, 1);
        System.out.println(invoke);
        System.out.println(invoke1);
    }

    @Test
    public void test02() throws Exception {
        Class<?> aClass = Class.forName("com.jc.bean.Student");

        Field age = aClass.getDeclaredField("age");

        age.setAccessible(true);

        System.out.println(age.get(null));

        age.set(null,12);
        System.out.println(age.get(null));
    }
}
