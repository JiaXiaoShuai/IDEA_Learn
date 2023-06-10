package com.jc.inner.case1;

/*
回忆：类的成员：
（1）成员变量
（2）成员方法
（3）构造器
（4）代码块
（5）内部类


第一种内部类的形式：静态内部类
1、语法格式
静态内部类
    【修饰符】 class 外部类{
        【修饰符】 static class 静态内部类{
        }
    }

2、 它是一个类
（1）它没有自己的字节码文件？ 有
字节码文件的命名：外部类名$静态内部类名

即静态内部类的全名称： 包.外部类名.静态内部类名

（2）它可以有哪些修饰符？
权限修饰符：public，或缺省
抽象修饰符：abstract
最终修饰符：final

（3）是否有自己的父类和父接口？可以
可以有自己的父类和父接口，这个父类和父接口和外部类没有关系。

（4）它可以有哪些成员？是的
类的所有成员都可以有。

3、它又是一个成员
（1）成员的修饰符
权限修饰符：public、protected、缺省、private
静态修饰符：static
最终修饰符：final


总结：静态内部类的修饰符：public、protected、缺省、private、abstract、final、static

（2）在外部类的外面使用时，要依赖于外部类
（3）在外部类的里面使用时，直接使用

4、如何使用静态内部类？
（1）在外部类的外面
使用静态内部类的静态成员：       外部类名.静态内部类名.静态成员
使用静态内部类的非静态成员：      静态内部类对象.非静态成员
        创建静态内部类的对象，  外部类名.静态内部类名 变量 = new 外部类名.静态内部类名(【实参】);

（2）在外部类的里面
使用静态内部类的静态成员：       静态内部类名.静态成员
使用静态内部类的非静态成员：      静态内部类对象.非静态成员
        创建静态内部类的对象，  静态内部类名 变量 = new 静态内部类名(【实参】);


5、在静态内部类中使用外部类的其他成员？
静态内部类不可以 使用 外部类的非静态的成员。

6、当静态内部类中定义了和外部类重名的静态属性时怎么办？
如果要访问外部类的静态变量，需要加“外部类名."
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        //在这里调用Inner的inMethod静态方法
        Outer.Inner.inMethod();

        //在这里调用Inner的inFun非静态方法
//        Outer.Inner.inFun();//错误，不能使用类名直接调用
        //这里需要创建Inner类的对象
        //这里不需要Outer的的对象，因为Inner对于Outer来说是静态的
        Outer.Inner in = new Outer.Inner();
        in.inFun();
    }
}

 class Outer{
    private static int outA = 1;
    private static int a = 1;
    private int outB = 1;

     static class Inner{
       private static int a = 2;
       private int b = 2;

        public static void inMethod(){
            System.out.println("静态内部类的静态方法inMethod");

            System.out.println("outA = " + outA);//可以
//            System.out.println("outB = " + outB);//不可以

            System.out.println("a =" + a);//2
            System.out.println("Outer.a =" + Outer.a);//1
        }
        public void inFun(){

        }
    }
    public static void outMethod(){
         //在这里使用静态内部类的静态成员inMethod
        Inner.inMethod();

        //在这里使用静态内部类的非静态成员inFun
        Inner in = new Inner();
        in.inFun();

        System.out.println("静态内部类的私有的静态变量：" + Inner.a);
        System.out.println("静态内部类的私有的非静态变量：" + in.b);

        System.out.println("outA = "+ outA);
//        System.out.println("outB = "+ outB);
    }
}