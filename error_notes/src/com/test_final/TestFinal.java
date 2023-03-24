package com.test_final;

/**
 * 必须保证类当中所有重载的构造方法，
 * 都最终会对final的成员变量进行赋值。如果选择在构造方法中赋值，则要把setName( )函数取消掉
 *
 * 对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
 */
public class TestFinal {
    private final int i;

    public TestFinal() {
        i = 2;
    }

    public TestFinal(String name) {
        //    i = 3;
        i =2;
    }

    public int getI() {
        return i;
    }

    /*public void setI(int i){
        return i;
    }*/
    //final 修饰成员变量后，该变量不能用作setName方法
}
