package com.jc.annotation;

/**
 * 回忆：
 * 注解：
 * @Override:标记某个重写的方法
 * @Deprecated:标记某个类、方法已过时
 * @SuppressWarning:抑制警告
 * @Test：JUnit测试的标记
 *
 * 1.自定义注解：
 * （1）语法格式
 * 【修饰符】 @interface 注解名{
 *
 * }
 *
 * 2、如何使用注解？
 * 可以在类、方法、成员变量等上面加注解
 *
 * 3、自定义注解包含的三个部分
 * （1）声明
 * 例如：
 * public @interface MyAnnotation{
 *
 * }
 *
 * （2）使用
 * @MyAnnotation
 * public class MyClass{
 *
 * }
 *
 * （3）读取
 * 如果没有（3）部分，那么前面的代码就完全没用
 *
 * 就好比说，@Override
 * 声明：
 * public @interface Override{
 *
 * }
 *
 * 使用：
 * class Son extend Father{
 * @Override
 * public void method() {
 *     System.out.println("Son.method");
 *
 * }
 *
 * }
 *
 * 读取：
 * 编译器会读取这个注解，会对方法进行格式检查
 *
 * 4、元注解
 * 给注解加注释的注解
 * @Target：用来解释/注释某个注解可以用在哪里
 *      可以用注解的位置一共有10个
 *      ElementType是一个枚举类型，每一个常量对象，代表有个注解可以使用的位置
 *      其中
 *      ElementType是一个枚举类型，每一个常量对象，代表一个注解可以使用的位置。
 *      其中
 *      ElementType.TYPE:表示是类型上面
 *      ElementType.FIELD:表示是属性/字段/成员变量上面
 * @Retentions:用来解释/注释某个注解的生命周期
 *      每个注解的声明周期有三个阶段
 *      SOURCE:源代码
 *      CLASS:字节码
 *      RUNTIME:运行时，内存中
 *              只有RUNTIME阶段才能被反射读取
 * @Documented:用来解释/注释某个注解是不是可以被javadoc工具读取API文档中
 *
 * @Inherited：用来解释/注释某个注解是不是可以被子类继承
 *
 */
public class TestAnnotation {
    public static void main(String[] args) {
        //写读取MyClass类上面的MyAnnotation注解的代码
        //(1)获取Class对象
        Class<MyClass> myClassClass = MyClass.class;

        //(2)获取注解对象Annotation
        myClassClass.getAnnotation(MyAnnotation.class);

    }
}
