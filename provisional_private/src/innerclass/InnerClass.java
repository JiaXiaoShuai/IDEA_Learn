package innerclass;

import java.sql.SQLOutput;

/*
1.不能循环继承外部类继承另一个类，该类继承内部类
2.内部类可以继承外部类，但是外部类不能继承内部类
 */
public class InnerClass {
    String innerClassName = "InnerClass的非静态innerClassName";
    static String innerClassName2 = "InnerClass的静态innerClassName2";
    static class A {

    }

    {
        System.out.println("InnerClass的非静态代码块");
    }

    static {
        System.out.println("InnerClass的静态代码块");
    }




    public InnerClass(){
        System.out.println("InnerClass的构造方法");
        System.out.println(innerClassName);
        System.out.println(innerClassName2);
    }

    class Ba {
        String baName = "Ba的非静态baName";
        {
            System.out.println("Ba的非静态代码块");
        }


        public Ba(){
            System.out.println("Ba的构造方法");
            System.out.println(baName);
        }
    }

    interface F {
        void test();
    }


    class Ge extends Ba{

    }
}

class Qw extends InnerClass.Ba{
    static InnerClass ina = new InnerClass();
    public Qw(){
        ina.super();
    }
}

/*
class Son1 extends InnerClass.Ba {
    String son1Name = "Son1的非静态son1Name";
    static String son1Name2 = "Son1的非静态son1Name2";
    static InnerClass ina = new InnerClass();

    {
        System.out.println("Son1的非静态代码块");
    }

    static {
        System.out.println("Son1的静态代码块");
    }

    public Son1(){
        ina.super();
        System.out.println(son1Name2);
        System.out.println(son1Name);
        System.out.println("Son1构造方法");
    }

    public static void main(String[] args) {
        Son1 son1 =new Son1();
    }
}*/
