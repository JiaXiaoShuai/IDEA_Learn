package com.jc.api;

/*
（2）public final Class<?> getClass()：返回此对象的运行时类。
修饰符：public final ，不能子类重写
返回值类型：Class<?>，它是一种类型，是java.lang.Class类型，这里的C是大写的，是类名。
        <?>是我们后面要学习的泛型。今天先忽略它。
        Class：它是Java所有类的抽象描述类型。
                类的定义：一类具有相同特性的事物的抽象描述。
                那么所有的Java类也有共同的特征，这些类都有类名称，都有修饰符，都有方法，都有构造器等。
                Class类的对象，就是用来表示一个Java的类。具体的讲解在反射章节再说。
      今天先如何理解   Class<?>呢？只要知道这getClass方法是返回一个Java的类型就可以。
      至于得到这个类型有什么用，后面再说。
 */
public class MethodGetClass {
    public static void main(String[] args) {
        Student s1 = new Student();//本态引用  编译时类型和运行时类型是一致的
        System.out.println(s1.getClass());//返回的是s1对象的类/类型
                                        //class com.atguigu.api.Student

        Object o2 = new Student();//多态引用  编译时类型是Object,运行时类型是Student不一致
        System.out.println(o2.getClass());//class com.atguigu.api.Student
    }
}
