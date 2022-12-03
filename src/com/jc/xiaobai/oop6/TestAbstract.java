package com.jc.xiaobai.oop6;

public class TestAbstract {
    public static void main(String[] args) {
        //f1变量是父类类型，指向子类实例，发生多态
        Figure f1 = new Triangle();
        f1.onDraw();
        Figure f2 = new Ellipse();
        f2.onDraw();
    }

}
