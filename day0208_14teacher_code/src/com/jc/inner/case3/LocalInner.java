package com.jc.inner.case3;

/*
第3种形式：局部内部类
1、局部内部类的语法格式
【修饰符】 class 外部类{
    【修饰符】 返回值类型  方法名(【形参列表】){
            【final/abstract】 class 内部类{
    	}
    }
}

2、作为类的角色来说
（1）有自己的字节码文件？
外部类名$编号局部内部类名
这里的编号作用是为了避免字节码文件重名问题。

（2）修饰符，作为类又作为局部内部类的角色
abstract和final
但是不能有权限修饰符，成员修饰符

（3）可以有自己的父类、父接口
（4）可以有自己的成员，但是也一样不能有静态成员

总结：唯一可以包含静态成员的内部类只有一种，静态内部类。

3、作为局部的角色
（1）修饰符：但是不能有权限修饰符，成员修饰符
（2）有作用域

4、使用
（1）有作用域，只能在当前方法中使用，而且是在声明之后
（2）可以使用外部类的成员，包括私有的，
但是能不能使用外部类的非静态成员，要看所在的方法本身是否是静态的。
（3）可以使用当前方法的局部变量，
但是要求这个局部变量必须是final的，JDK1.8之前，必须手动加final，JDK1.8之后会自动加final.

 */
public class LocalInner {
    private static int a;
    private int b;

    public static void outMethod(){
       final int c = 1;//只要c在局部内部类中使用，就会自动加final
       class Inner{//局部内部类
            public void inMethod(){
                System.out.println("a = " + a);
//                System.out.println("b = " + b);//错误，outMethod方法是静态的方法，不能用非静态的b
                System.out.println("c = " + c);
            }
        }

        Inner in;
    }

    public void outFun(){
        class Inner{
            public void inMethod(){
                System.out.println("a = " + a);
                System.out.println("b = " + b);//可以
            }
        }
    }
}
