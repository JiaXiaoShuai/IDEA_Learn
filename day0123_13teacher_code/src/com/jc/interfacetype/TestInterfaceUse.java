package com.jc.interfacetype;
/*
1.如何使用接口中的公共静态常量
接口名.常量名

2.如何使用接口的静态方法
接口名.静态方法

强调一下：
    子类可以继承父类的静态方法，即子类名.父类的静态方法是可以的。
    实现类不可以继承接口的静态方法，即实现类名.父类接口的静态方法是错误的

    子类不能重写父类的静态方法
    实现类也不能重写接口的静态方法

总结一下；接口的静态只有一种方式可以使用。“接口名.静态方法”

3.如何使用接口的抽象方法？
只能通过实现类实现抽象方法（重写），然后由实现类对象调用
4.如何使用接口的默认方法？
只能通过实现类的对象使用
 */
public class TestInterfaceUse {
    public static void main(String[] args) {
        System.out.println("接口的公共的静态常量：" + Flyable.MAX_SPEED);

        //调用接口的静态方法
        Flyable.method();

//        Bird.method();//错误

        //调用接口的抽象方法
        Bird bird = new Bird();
        bird.fly();

        Flyable f = new Bird();//这个也是多态引用
        f.fly();//编译时看父接口类型，运行时看实现类/子类


        //使用接口的默认方法
        bird.test();
        f.test();

    }
}
