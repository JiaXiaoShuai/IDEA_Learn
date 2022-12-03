package com.jc.keyword;

/*
7.1.4 静态方法
1、语法格式
【修饰符】 class 类{
    【其他修饰符】 static 返回值类型 方法名(【形参列表】）{
        方法体语句;
    }
}

2、注意
（1）静态方法在本类中，任意的方法、代码块、构造器都可以使用，没有限制。
（2）静态方法在类的外面，只要权限修饰符允许，可以通过：
  “对象.静态方法” 或 “类名.静态方法”
  推荐使用“类名.静态方法”
（3）在静态方法中千万不要直接使用本类的  非静态属性、非静态方法、this、super。
（4）静态方法不允许被子类重写，但是可以被子类继承。
（5）静态方法不是“虚”方法。
既然不是虚方法，就没有多态现象，只看变量的编译时类型。
 */
public class TestStaticMethod extends Father{
    int a = 1;
    public void method(){
        System.out.println("a = " + a);
    }
    
    public static void main(String[] args) {
        /*System.out.println("a=" + a);
        method();
        System.out.println("this.a" + this.a);
        System.out.println("super.b" + super.a);*/

        Son.fun();//父类的静态方法可以被子类继承

        Father f = new Son();
        f.test();
        ((Son)f).test();

    }
}
class Father{
    int b = 1;
    public static void fun(){
        System.out.println("Father.fun");
    }

    public static void test(){
        System.out.println("Father.test");
    }
}
class Son extends Father{

//    @Override
    public static void test(){ //静态方法这样看起来像重写，但是不是重写
        System.out.println("Son.test");
    }
}