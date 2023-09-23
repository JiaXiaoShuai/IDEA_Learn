package com.jc.annotation;

import java.lang.annotation.*;

/**
 * 类：class
 * 接口：interface
 * 枚举：enum
 * 注解：@interface
 *
 * MyAnnotation注解的名称
 *
 * @Target：目标位置
 */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();//抽象方法

    /*
    只是注解中只能写无参的抽象方法
     */

    String info() default "极爱";
    /*
    抽象方法的返回值类型有限制；
    只能是八种基本数据类型，String类型，Class类型，enum类型，Annotation类型，以上所有类型的数组
     */
}
