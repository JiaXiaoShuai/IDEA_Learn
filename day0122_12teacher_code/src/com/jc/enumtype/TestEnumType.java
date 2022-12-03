package com.jc.enumtype;
/*
7.2 枚举
1、枚举：
 枚举： 一一列举、罗列、穷举，
 Java中：枚举是指一种特殊的类，这种类的对象是固定的有限的几个，即这个类的对象在声明类的时候就提前创建好了，后期就不能创建新对象了。

2、如何实现枚举？
JDK1.5之前：

     案例：声明一个Season季节，它有且只有四个对象。

     思考：
     （1）如何控制其他类 不能new我这个类的对象？
     构造器私有化
     （2）需要在本类中提前把固定的几个对象先new好，供外面使用，怎么做？
     A：只有成员变量保存的值，类外面才能用，局部的值，类外面是不能用的，所以需要通过成员变量存储new好的几个对象
     B：为了外面可以通过“类名."直接获取对象，所以需要把这些成员变量声明为static

     (3)如果希望表示这些对象是固定的常量对象，怎么办？
     可以在静态变量前面加final

     （4）如果这个类是public的，希望这些常量对象也是任意位置可见，怎么办？
     可以在静态变量前面加public

JDK1.5之后：引入一个新的关键字enum

    案例：声明一个Week枚举类，有7个常量对象，分别是MONDAY -> SUNDAY


3、使用enum声明枚举类型
（1）语法结构
【修饰符】 enum 枚举类名{
    常量对象名列表
}

（2）特点
A：enum声明的枚举类型的构造器，默认都是private。
无论是默认的无参构造，还是手动声明的构造器，权限修饰符都是private

B：常量对象如果只写常量对象名，表示使用枚举类的无参构造创建的对象，
   常量对象如果在常量对象名后面加(实参列表)，表示使用枚举类的有参构造创建对象。

C：如果常量对象列表后面没有其他代码，那么常量对象列表后面的;可以省略。
  如果常量对象列表后面还有其他代码，那么常量对象列表后面的;不可以省略。

D：enum声明的枚举类型，不能用extends继承别的类。它有自己的固定的默认的直接父类，java.lang.Enum类

E：enum生命的枚举类型，可以支持switch

回忆：switch(表达式)中的表达式的类型要求是 byte,short,int,char,枚举（enum）（从jdk1.5之后），String（JDK1.7之后）

F：enum声明的枚举类型常量对象列表必须在枚举类中的首行。

回忆：首行
  this()和this(实参列表)构造器首行
  super()和super(实参列表)构造器首行
  package语句必须在.java文件的首行
  枚举的常量列表必须在枚举类型的首行。
 */
public class TestEnumType {
    public static void main(String[] args) {
        Season s1 = Season.SPRING;//直接获取已经创建好的对象，不用新new
        Season s2 = Season.SPRING;//直接获取已经创建好的对象，不用新new

        System.out.println(s1 == s2);

        System.out.println("__________________________");
        //获取今天的星期，今天是星期六
        Week today = Week.SATURDAY;
        Week w1 = Week.FRIDAY;
        System.out.println(today);
        System.out.println(Week.MONDAY);

        switch (today){
            case MONDAY:
                System.out.println("星期一是最困的一天");break;
            case TUESDAY:
                System.out.println("星期二是接着困的一天");break;
            case SATURDAY:
                System.out.println("星期六是最开心的一天，因为第二天休息了");break;

        }

    }
}
