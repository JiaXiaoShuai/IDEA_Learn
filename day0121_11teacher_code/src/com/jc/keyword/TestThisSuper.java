package com.jc.keyword;

/*
6.5.1 this和super关键字
1、this：
单词本身：这个，这里等
在Java中：当前对象，它是一个对象

2、this可以出现在哪些地方
（1）实例初始化相关的代码中，即构造器和非静态代码块中
表示你正在new的对象

（2）实例方法中（我们目前学习的方法都是非静态的实例方法）
表示调用这个方法的对象，看对象的运行时类型。

3、this关键字有几种使用形式
（1）this.成员变量
    什么情况下需要用它？
    当方法体或构造器中有局部变量（通常是形参）与成员变量“重名”时，就用this.表示访问的是成员变量，没有this.的就是局部变量。
    但是如果没有重名问题，加不加this.就遵循就近原则。

（2）this.成员方法
    完全可以省略this.，写不写this.都一样。都是调用当前对象的某个实例方法。
    如何找它调用的是哪个方法？
    如果调用的是虚方法，当成有this.的，即看this对象的运行时类型是什么，找运行时类型中是否有重写。

（3）this()或this(实参列表）
    出现在构造器的首行，表示调用本类的其他构造器。

4、super：
单词本身：超级的
在Java中表示：表示引用父类的xx，准确的说是找当前对象中从父类继承的xx

5、super关键字有几种使用形式
（1）super.成员变量
    什么情况下，会使用super.成员变量？
    实际 开发中，是应该，强烈提醒，子类不用声明和父类同名的成员变量的。
    如果出现了（特别是面试题中），super.成员变量，表示访问父类中声明的成员变量。

（2）super.成员方法
    什么情况下，会使用super.成员方法?
    经常用，表示在子类中调用父类“被重写”的方法。

（3）super()或super(实参列表）
    super()；通常会被省略掉，但是我们自己要知道它是存在的。当子类构造器首行没有super(实参列表），也没有this()或this(实参列表），那么就表示首行有super()
        super()代表父类的无参构造（准确的说是代表父类无参构造对应的<init>()，
    super(实参列表）：代表父类的某个有参构造，（准确的说是代表父类有参构造对应的<init>(形参列表)），
    它们也都是只能出现在构造器的首行。
 */
public class TestThisSuper {
    public static void main(String[] args) {
        Father f = new Father();//此时和子类无关
        System.out.println("f =" + f);//com.atguigu.keyword.Father@1b6d3586

        System.out.println("---------------------");
        Son s = new Son();
        System.out.println("s = " + s);//com.atguigu.keyword.Son@4554617c

        System.out.println("-----------------------");
        f.method();

        System.out.println("-------------------------");
        s.method();

        System.out.println("-----------------------");
        Father ff = new Son();//com.atguigu.keyword.Son@74a14482
        ff.method();
    }
}

class Father{

    public Father(){
        System.out.println(this);
        /*
        new Father（）时，这个this就是代表你正在new的Father类的对象
        com.atguigu.keyword.Father@1b6d3586

        new Son()时，这个this就是代表你正在new的Son类的对象
        com.atguigu.keyword.Son@4554617c


        */
    }

    public void method(){
        System.out.println("Father.method, this = " + this);
        /*
        这个this代表正在调用method方法的当前对象，如果是f，它是Father类的对象，
        那么this就是Father类的对象com.atguigu.keyword.Father@1b6d3586

        这个this代表正在调用method方法的当前对象，如果是s，它是Son类的对象，
        那么this就是Son类的对象 com.atguigu.keyword.Son@4554617c
         */

    }
}
class Son extends Father{
    public Son() {
//        super();//隐含
        System.out.println(this);//com.atguigu.keyword.Son@4554617c
    }

}