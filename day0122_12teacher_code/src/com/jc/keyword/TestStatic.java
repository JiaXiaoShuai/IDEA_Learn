package com.jc.keyword;

/*
7.1 静态：static
static：静态的

7.1.1 为什么要要有静态的？

案例：编写一个员工类型，希望有一个变量可以统计员工对象的数量（即创建了多少个员工对象）。
    员工里面有属性：员工编号、员工姓名，
    希望员工编号是从1开始，自增。第一个员工就是1，第二个员工就是2...。

遇到的问题：之前的非静态的成员变量是每一个对象“独立”的，无法实现“共享”。
解决方案：静态
    成员变量用static修饰。

7.1.2 静态变量的特点
（1）静态变量也有默认值，它也是成员变量之一，默认值和之前的实例变量一样
整数类型：0
小数类型：0.0
char类型：\u0000
boolean：false
引用数据类型：null

成员变量分为两种：
A：静态变量（有static）
B：实例变量（没有static）

（2）静态变量是所有对象共享的
（3）静态变量的值是存储在“方法区”
（4）静态变量的get/set方法也是静态的
（5）当静态方法中出现了  局部变量与静态变量重名时，使用“类名.静态变量”进行区分，
而不是使用“this.静态变量”
因为声明为静态的变量，就表示和“对象”无关“。
（6）静态变量在本类的非静态方法中，构造器，非静态代码块，静态方法中都可以方法
非静态变量只能在非静态代码块、构造器、非静态方法中使用，不能在静态方法等使用。
原则：对象可以使用类的信息，类不能反过来使用对象的信息。
（7）静态变量如果要在类的外面的使用，需要权限修饰符允许。可以通过“类名.静态变量”也可以通过“对象.静态变量”。
但是不推荐
    对象.静态变量
    对象.静态方法

之前：
    Math.PI
    Math.random()
    Math.sqrt(x)

 */
public class TestStatic {
    public static void main(String[] args) {
        System.out.println("一开始，员工对象的数量有：" +  Employee.getTotal());
        Employee e1 = new Employee("张三");
        System.out.println(e1);
        Employee e2 = new Employee("李四");
        System.out.println(e2);
        Employee e3 = new Employee("王五", 89);
        System.out.println(e3);
        System.out.println("创建完3个员工对象后，员工对象的数量：" + Employee.getTotal());//推荐

        //通过对象，访问静态方法
        System.out.println("通过e1对象调用静态方法，获取员工的数量：" + e1.getTotal());//不推荐

        //下面两个使用，需要total不是private的，即权限修饰符允许
        System.out.println("获取total，不通过方法：" + Employee.total);//推荐
        System.out.println("获取total，不通过方法：" + e1.total);//不推荐
    }
}
