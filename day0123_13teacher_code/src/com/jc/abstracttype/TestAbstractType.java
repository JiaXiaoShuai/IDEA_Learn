package com.jc.abstracttype;
/*
7.4 抽象类
7.4.1 为什么要用抽象类？什么是抽象类？

1、之前遇到过写一些父类时，父类的某些方法无法给出具体的实现代码。
之前写过图形父类 Graphic ，包含面积方法
public double area(){
    return 0.0;
}
这样方法语法上是正确的，但是逻辑上有问题，也没有意义。
这种方法应该有子类重写，并给更合理的具体实现。

这种情况，我们就应该把这样的方法声明为抽象方法。

2、案例：
    编写一个动物类Animal，里面包含一个方法 public void eat();

    如果一个方法，没有方法体，它应该有子类来重写，再给出具体的实现时，这个方法就应该声明为抽象方法。

 3、抽象方法的语法格式：
 【其他修饰符】 abstract 返回值类型  方法名(【形参列表】);

 抽象方法是没有方法体，有abstract修饰。
 那么Java中规定，如果一个类中包含了抽象方法，那么这个类必须是抽象类，否则编译报错。

 4、抽象类的语法格式：
 【权限修饰符】 abstract class 类名{
 }

  【权限修饰符】 abstract class 类名 extends 父类{
 }

 7.4.2 抽象类的特点
 1、抽象类本身是不能创建对象
 2、抽象类型的变量，只能赋值为它的子类对象，即与子类对象构成“多态”引用。
 抽象方法是虚方法，子类必须重写
3、子类要继承抽象类时，如果子类不是抽象类，那么子类就必须重写抽象父类的所有抽象方法。
4、虽然有抽象方法的类必须是抽象类，但是反过来抽象类也可以没有抽象方法。

为什么没有抽象方法的类，要声明为抽象类？为了不让你创建它的对象，希望你创建它子类的对象。
5、抽象类有没有构造器？
  有，一定有，子类的构造器首行一定要调用父类的构造器。


抽象类和非抽象类有什么区别？
（1）抽象类有abstract修饰，可以包含抽象方法
    非抽象类没有abstract修饰，也不能包含抽象方法
（2）抽象类不能直接new对象
    非抽象类可以直接new对象
 其他的没有区别。


 */

public class TestAbstractType {
    public static void main(String[] args) {
//        Animal a = new Animal();//错误
        Animal a = new Dog("旺财");
        a.eat();//编译时看父类，运行时看子类
        System.out.println(a.getName());
        //有一个Animal的数组

        Animal[] arr = new Animal[2];
        arr[0] = new Dog();
        arr[1] = new Cat();

        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
        }
    }
}
