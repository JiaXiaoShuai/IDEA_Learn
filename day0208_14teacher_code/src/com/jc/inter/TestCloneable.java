package com.jc.inter;
/*
第3个经典接口：
    java.lang.Cloneable接口：用于对象的克隆，复制

在java.lang.Object根父类中有一个克隆对象的方法：
    protected Object clone()  throws CloneNotSupportedException
(1)权限修饰符：protected（Object本类、java.lang本包、其他包的子类的非静态方法中）

在子类（要克隆对象的类中，这里就是Circle类）中可以重写这个方法，修改protected为public

(2)方法()后面有 throws CloneNotSupportedException（不支持克隆异常），这个表示clone()方法很可能报这个异常
建议/强制要求调用者必须提前编写处理这个异常的代码
如果希望调用这个方法时不报CloneNotSupportedException异常，解决方案就是，让这个类实现java.lang.Cloneable接口

需求：
（1）先创建一个Circle对象，半径值设置为2.5
（2）复制一个Circle对象，半径值和第一个圆对象一样
 */
public class TestCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        //（1）先创建一个Circle对象，半径值设置为2.5
        Circle c1 = new Circle(2.5);
        System.out.println("c1 = " + c1);

        //（2）复制一个Circle对象，半径值也是2.5
        //方式一：
//        Circle c2 = new Circle();
//        c2.setRadius(c1.getRadius());

        //方式二：
        Object clone = c1.clone();//这里处理异常的方式，选择接着throws（扔）
        System.out.println((Circle) clone == c1);
        System.out.println(clone.equals(c1));
        System.out.println(clone.hashCode());
        System.out.println(c1.hashCode());
        System.out.println("clone = " + clone);
        c1.getRadius();
        ((Circle) clone).getRadius();
    }
}
