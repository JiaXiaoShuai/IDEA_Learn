package com.jc.xiaobai.opp7;

public class TestFigure {
    public static void main(String[] args) {
        //f1变量是父类类型，指向子类实例，发生多态
        Figure f1 = new Triangle();
        f1.onDraw();
        System.out.println(f1.name);
        System.out.println(Figure.name);

        //f2变量是父类类型，指向子类实例，发生多态
        Figure f2 = new Ellipse();
        f2.onDraw();
        System.out.println(f2.name);
        System.out.println(Figure.name);
    }
}
