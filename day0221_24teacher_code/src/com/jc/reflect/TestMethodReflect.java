package com.jc.reflect;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * 四、反射的应用之四：在运行时动态的调用任意类的任意方法
 * 步骤：
 * (1)获取类的Class对象
 * (2)创建这个类的实例对象
 * 前提条件是这个类有公共的无参构造
 * （3）先获取你要调用的方法的Method对象
 * （4）调用方法
 * 通过Method对象.invoke(实例对象，实参)
 */
public class TestMethodReflect {
    @Test
    public void test01() throws Exception {
        Class<?> clazz = Class.forName("com.jc.bean.Student");
        Object stu = clazz.newInstance();
        Method methods = clazz.getDeclaredMethod("connectMethod", String.class, int.class);
        methods.setAccessible(true);
        Object returnValue = methods.invoke(stu, "jia",23);
        System.out.println(returnValue);

    }

    @Test
    public void test02() throws Exception{
        Class<?> clazz = Class.forName("com.jc.bean.Student");
        Object stu = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("setMethod", String.class, int.class);

        Object o = method.invoke(stu, "jiacong", 1);

        for(Object i : ((Map)o).keySet()){
            System.out.println(i);
        }

        for(Object i : ((Map)o).values()){
            System.out.println(i);
        }
        System.out.println(o);
        System.out.println(method.getReturnType());
       for (Object o1 : ((Map)o).entrySet()) {
            System.out.println("Key: " + ((Map.Entry)o1).getKey() + ", Value: " + ((Map.Entry)o1).getValue());
        }
        System.out.println(o);

    }
}
