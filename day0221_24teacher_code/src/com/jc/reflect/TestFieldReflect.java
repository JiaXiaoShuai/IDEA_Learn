package com.jc.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 三、反射的应用之三：动态的操作任意对象的任意属性
 * 步骤：
 * （1）获取类的Class对象
 * （2）通过Class对象，newInstance()
 * 前提条件是这个类有无参构造
 * （3）先获取id属性的Field对象
 * （4）可选的，如果属性的权限修饰符允许，这一步可以不要
 *          如果属性的权限修饰符不允许，可以加这一步
 *      通过id属性对应的Field对象，setAccessible（true）
 * （5）操作id属性的值
 * 通过id属性对应的Field对象.get(实例对象)获取id属性的值
 * 通过id属性对应的Field对象.set(实例对象，值)设置id属性的值
 */
public class TestFieldReflect {
    @Test
    public void test01() throws Exception{
        //通过反射创建Student类的对象，并且通过反射给Student对象的id和name属性赋值，获取它们的值
        //（1）获取类的Class对象
        Class<?> clazz = Class.forName("com.jc.bean.Student");

        //（2）通过反射创建Student类的对象
        Object stu = clazz.newInstance();//学生对象  stu是Student对象

        //（3）先获取id属性的Field对象
        Field idField = clazz.getDeclaredField("id");

        //（4）因为id属性是私有化的，所以要加一步
        idField.setAccessible(true);

        //（5）获取id属性的值
        Object idValue = idField.get(stu);
        System.out.println(idValue);

        //（6）设置id属性的值
        idField.set(stu,23);//访问stu对象的id属性值  等价于 stu.id

        //再次访问id属性的值
        idValue = idField.get(stu);
        System.out.println(idValue);

        /*
        设置name属性的值，获取name属性的值
         */

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        Object nameValue = nameField.get(stu);
        System.out.println(nameValue);
        nameField.set(stu,"jiaxiaoshuai");
        nameValue = nameField.get(stu);
        System.out.println(nameValue);

        System.out.println(stu);

    }
}
