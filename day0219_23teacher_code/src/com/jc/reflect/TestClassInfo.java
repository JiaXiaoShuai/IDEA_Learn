package com.jc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * 反射的应用之一：获取类型的详细信息
 * java.lang.Class
 * java.lang.reflect包：
 *     Modifier
 *
 *
 *
 *  只要可以获取一个类的Class对象，就可以获取它里面的所有的信息。
 */
public class TestClassInfo {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.String");
        //有了String类的Class对象，就可以获取String类的所有信息

        //（1）获取类的包名
        Package pkg = clazz.getPackage();
        System.out.println(pkg);

        //(2)获取类的名称
        String name = clazz.getName();
        System.out.println("name = " + name);

        //（3）获取类的修饰符
        int modifiers = clazz.getModifiers();
        System.out.println("modifiers = " + modifiers);//17
        System.out.println(Modifier.toString(modifiers));
        /*
        Modifier类中的 常量值：    0x开头是十六键                            十进制     二进制
        public static final int PUBLIC           = 0x00000001;      ==>     1            1
        public static final int PRIVATE          = 0x00000002;      ==》    2            10
        public static final int PROTECTED        = 0x00000004;      ==》    4            100
        public static final int STATIC           = 0x00000008;      ==>     8           1000
        public static final int FINAL            = 0x00000010;      ==>    16           10000
        。。。。

        使用2的n次方值来表示某个修饰符，因为这些值的二进制值正好是某一位是1，其余都是0

        String  的修饰符 public final
        1 ^  16 ==>
        00001
        10000
        10001==>17

       最后的二进制，某一个位有1的，就说明这个位对应的修饰符是存在的。
         */

        //（4）获取String类的父类，继承是单继承
        Class superclass = clazz.getSuperclass();
        System.out.println("superclass = " + superclass);//class java.lang.Object

        //（5）获取String类的接口们，返回数组，因为接口是多实现
        Class[] interfaces = clazz.getInterfaces();
        System.out.println("父接口们：");
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        //（6）获取String类的成员
        //获取String类所有成员变量
        /*
        clazz.getField("属性名");      获取某一个公共的成员变量
        clazz.getFields();              获取所有的公共的成员变量
        clazz.getDeclaredField("属性名");  获取某一个已声明的成员变量
        clazz.getDeclaredFields();      获取所有已声明的成员变量，包括非公共的，私有的等
        */

        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println("String类所有的成员变量：");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field[] fields = clazz.getFields();
        System.out.println("String类所有的公共的成员变量：");
        for (Field field : fields) {
            System.out.println(field);
        }

        /*System.out.println(clazz.getField("CASE_INSENSITIVE_ORDER"));*/

        //获取String类的构造器们
//        clazz.getConstructor(构造器的形参类型列表)   获取一个公共的构造器
//            clazz.getConstructors(); 获取所有公共的构造器
//              clazz.getDeclaredConstructor(构造器的形参类型列表)   获取一个已声明的构造器
//            clazz.getDeclaredConstructors(); //获取所有已声明的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("String类的构造器有：");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }


        //获取String类的方法们
/*        clazz.getMethod(方法名，方法的形参类型列表)：获取某个公共的方法
        clazz.getDeclaredMethod(方法名，方法的形参类型列表)：获取某个已声明的方法
        clazz.getMethods() 获取所有公共的方法
        clazz.getDeclaredMethods() 获取所有已声明的方法 */

        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println("String类的所有方法：");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("-------------------------");
        Class c2 = ArrayList.class;
        Class[] declaredClasses = c2.getDeclaredClasses();
        System.out.println("ArrayList的内部类：");
        for (Class innerClass : declaredClasses) {
            System.out.println(innerClass);
        }


    }
}
