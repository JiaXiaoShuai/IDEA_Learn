package com.jc.xiaobai.oop3;

/**
 * 测试this关键字
 */
public class TestThis {
    int a, b, c;

    TestThis() {
        System.out.println("正要初始化一个对象");
    }

    TestThis(int a, int b) {
        this();
        this.a = a;
        this.b = b;
    }

    TestThis(int a,int b,int c){
        this(a,b);
        this.c = c;
    }

    void sing(){

    }

    void eat(){
        sing();
    }

    void jump(){
        this.eat();
    }


}
