package com.jc.interfacetype;
/*
接口在使用过程中，可能会遇到如下冲突的情况：
1.默认方法的冲突
A：当一个实现类，同时实现两个接口或更多个接口，此时多个接口中存在相同签名的默认方法时，会发生冲突现象。
如何解决？必须做出选择，否则编译报错
①保留其中一个接口的实现，放弃其他的
    父接口名.super.默认方法名
②全部放弃，自己重写

B：当一个实现类，同时继承父类，又实现父接口时，此时接口中和父类中有相同前面的非静态方法时，怎么办？
①默认是亲爹原则，亲爹优先原则。
②当然也可以自己选择
    父接口名.super.默认方法名
    要用父类的方法，super.父类的方法
③完全重写


2、成员变量冲突
 */
public class TestConflict {
    public static void main(String[] args) {
        Boy b = new Boy();
        b.date();
    }
}

interface Girl{
    default void date(){
        System.out.println("约会吃饭看电影");
    }
}
interface Teacher{
    int x = 1;
    default void date(){
        System.out.println("一起学习Java");
    }
}
class Father{
    int x = 1;
    public void date(){
        System.out.println("喊你回家");
    }
}
class Boy extends Father implements Girl,Teacher{
    @Override
    public void date() {
//        Teacher.super.date();
//        Girl.super.date();
//        System.out.println("我要回家");
        super.date();//选择父类的
    }

    public void method(){
//        System.out.println(x);//编译报错，不知道怎么选择
        System.out.println(super.x);//用父类
        System.out.println(Teacher.x);//用父接口的  因为x是静态的，所以不用Teacher.super.
    }
}

