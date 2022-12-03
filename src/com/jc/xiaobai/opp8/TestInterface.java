package com.jc.xiaobai.opp8;

public class TestInterface {
    public static void main(String[] args) {
        InterfaceA abc = new ABC();
        //访问实现类methodB方法
        System.out.println(abc.methodB());

        //访问默认方法methodC
        System.out.println(abc.methodC());

        //访问默认方法methodD
        System.out.println(abc.methodD());

        //访问静态方法
        System.out.println(InterfaceA.methodE());
    }
}
