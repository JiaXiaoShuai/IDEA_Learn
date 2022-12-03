package com.jc.interfacetype;

public interface Flyable{
//    public static final int MAX_SPEED = 386*10000;
    int MAX_SPEED = 386*10000;//public static final 省略也一样

//    public abstract void fly();
     void fly();//public abstract

    static void method(){//public可以省略
        System.out.println("Flyable.method");
    }

    default void test(){
        System.out.println("Flyable.test");
    }


    public static void method1(){
//        common();
        //....
    }
    public static void method2(){
//        common();
        //....
    }

/*    private static void common(){
        System.out.println("hello");
        System.out.println("world");
        System.out.println("java");
    }*/

}
