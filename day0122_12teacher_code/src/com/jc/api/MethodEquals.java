package com.jc.api;
/*
（3）public boolean equals(Object obj)：
返回值类型：boolean
作用：用于比较 “当前对象” 和 "obj对应的实参对象" 是否 “相等”。
A：如果子类没有重写Object类的equals方法，Object类中equals默认就是比较对象的地址，等价于 “==”。

Ctrl + N：打开搜索框，输入类名，最好是全名称
Ctrl + F12：打开某个类的成员列表，选中你要查看的某个成员

    public boolean equals(Object obj) {
        return (this == obj);
    }

如果当前代码有某个方法或成员的调用，可以按住Ctrl键，单击这个成员，也可以快速跟着源码。

B：子类可以重写该方法
equals方法重写需要遵循如下原则，否则会有很多问题：
①自反性：  x.equals(x)一定返回true
②对称性：  x.equals(y)如果返回true，那么y.equals(x)也要返回true。
③传递性：  x.equals(y)如果返回true，然后y.equals(z)也返回true，那么x.equals(z)也要返回true。
④一致性：  x.equals(y)如果在前面调用时返回true，这两个对象参与equals比较的属性没有修改的话，那么在后面调用结果也要返回true。
⑤非空对象与null比较，永远是false.
            x.equals(null)一定是false。
            null.equals(x)错误，会报空指针异常。

平时重写时，一般都不是手动重写的，都是使用开发工具的模板重写。
例如：IDEA的模板怎么重写equals方法呢，Alt + Insert，选择equals and hashCode


两个对象比较的时候， == 比较的是两个对象在内存中的地址，只要是new的不同对象，地址值就不会相等。

 */
public class MethodEquals {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23,89);
        Student s2 = new Student("张三",23,89);
        Student s3 = new Student("张三",24,100);

        System.out.println(s1 == s2);//使用之前学过的 比较运算符 比较  false
        System.out.println(s1 == s3);//使用之前学过的 比较运算符 比较  false
        System.out.println(s2 == s3);//使用之前学过的 比较运算符 比较  false

        System.out.println(s1.equals(s2)); //false（没重写） ?  true（重写了）
        /*
        s1是 “当前对象” ，调用方法的对象是this对象，当前对象。
        s2是实参对象，它给形参obj赋值
        现在是s1和s2比较是否相等
         */

        System.out.println(s1.equals(s3));//false  重写没重写都是false，因为我重写的要比较name,age,score
        System.out.println(s1.equals("张三"));//false，它俩的类型都不同，s1是Student类型，、"张三“是String类型的
    }
}