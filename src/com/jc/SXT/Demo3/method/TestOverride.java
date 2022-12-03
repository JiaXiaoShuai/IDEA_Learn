package com.jc.SXT.Demo3.method;

/**
 * 测试重写
 */
public class TestOverride {
    public static void main(String[] args) {
        TestOverride te = new TestOverride();
        //te.aVoid(1,2,3,4);//不能让编译器找不到或者找到符合形参方法的很多方法
    }


    void aVoid(int... a){

    }

    void aVoid(int b,int... a){

    }
}
