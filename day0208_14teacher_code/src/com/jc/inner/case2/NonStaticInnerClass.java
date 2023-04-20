package com.jc.inner.case2;

/*
回忆：类的成员：
（1）成员变量
（2）成员方法
（3）构造器
（4）代码块
（5）内部类


第二种内部类的形式：非静态内部类
1、语法格式
非静态内部类
    【修饰符】 class 外部类{
        【修饰符】 class 非静态内部类{
        }
    }

2、 它是一个类
（1）它没有自己的字节码文件？ 有
字节码文件的命名：外部类名$非静态内部类名

即非静态内部类的全名称： 包.外部类名.非静态内部类名

（2）它可以有哪些修饰符？
权限修饰符：public，或缺省
抽象修饰符：abstract
最终修饰符：final

（3）是否有自己的父类和父接口？可以
可以有自己的父类和父接口，这个父类和父接口和外部类没有关系。

（4）它可以有哪些成员？
非静态内部类中  不允许  有自己的静态成员。

3、它又是一个成员
（1）成员的修饰符
权限修饰符：public、protected、缺省、private
最终修饰符：final


总结：非静态内部类的修饰符：public、protected、缺省、private、abstract、final

（2）在外部类的外面使用时，要依赖于外部类，还要依赖于外部类的“对象”
（3）在外部类的里面使用时，直接使用

4、如何使用非静态内部类？
（1）在外部类的外面
使用非静态内部类的非静态成员：非静态内部类对象.非静态成员
    如何创建非静态内部类对象呢？
        外部类对象.new 非静态内部类()

（2）在外部类的里面
使用非静态内部类的非静态成员：      非静态内部类对象.非静态成员
        创建非静态内部类的对象，  非静态内部类名 变量 = new 非静态内部类名(【实参】);

注意：在外部类的静态成员中，不允许使用非静态内部类

5、在非静态内部类中使用外部类的其他成员？
没有限制

6、当非静态内部类中定义了和外部类重名的非静态属性时怎么办？
如果要访问外部类的非静态变量，需要加“外部类名.this."
 */
public class NonStaticInnerClass {
    public static void main(String[] args) {
        //在这里调用Inner的inFun非静态方法
//        Outer.Inner.inFun();//错误，不能使用类名直接调用
        //这里需要创建Inner类的对象
        //这里也需要Outer的的对象
        Outer out = new Outer();//创建外部类对象
//        Outer.Inner in = out.new Inner();//创建非静态内部类的对象
        //上面这句代码的结果就是获得了一个 Inner类的对象
        Outer.Inner in = out.getInner();
        in.inFun(3);
    }
}

class Outer{
   private static int outA = 1;
   private int b = 1;
   private int outB = 1;

   class Inner  {
       private int b = 2;

       public void inFun(int b){
           System.out.println("非静态内部类的非静态方法inFun");
           System.out.println("outA = " + outA);
           System.out.println("outB = " + outB);

           System.out.println("b = " + b);
           System.out.println("Inner.b = " + this.b);//2
//           System.out.println("Outer.b = " + Outer.b);//错误，b是非静态的
           System.out.println("Outer.b = " + Outer.this.b);//1
       }
   }

   public Inner getInner(){
       return new Inner();//返回内部类的对象
   }

   public void outFun(){
       //在这里使用静态内部类的非静态成员inFun
       Inner in = new Inner();
       in.inFun(3);
   }

   public static void outMethod(){
       //在这里使用非静态内部类的非静态成员inFun
//       Inner in = new Inner();
//       in.inFun();
   }
}