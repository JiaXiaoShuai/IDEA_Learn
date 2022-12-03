package com.jc.api;

/*
Object类中有11个方法，今天先了解5个。
1、public String toString()：返回值类型是String，方法名是toString。
这个方法可以
（1）通过对象.toString()调用
（2）System.out.println方法在打印对象时自动调用
（3）在对象与字符串进行“+”拼接时自动调用

toString方法，如果子类没有重写，继承的Object类中的toString，默认返回的是
  对象的运行时类型的全名称 @ 对象的hashCode值的十六进制值
    全名称：包.类名
  建议所有子类都重写这个方法。

  如何重写呢？
  （1）手动自己重写，根据自己的需要
  （2）使用IDEA自动重写：Alt + Insert
 */
public class MethodToString {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());//通过对象.toString()调用
                //com.atguigu.api.Student@1b6d3586
        System.out.println(s1);//用System.out.println方法打印对象时自动调用
                //com.atguigu.api.Student@1b6d3586
        String str = "hello";
        str  = str + s1;//拼接
        System.out.println(str);//hellocom.atguigu.api.Student@1b6d3586

        System.out.println("----------------------------");
        System.out.println(s1.hashCode());//获取s1对象的hashCode值，这里获取的是十进制值
        //460141958 十进制，它的十六进制值是 1B6D3586
    }
}
