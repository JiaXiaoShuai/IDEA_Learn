package com.jc.keyword.demo;

class Father{
    int a = 10;
    int b = 11;
}
class Son extends Father{
    int a = 20;

    public void test(){
        System.out.println("子类的a：" + a);//没有重名问题，也没有this.，就近原则  20
        System.out.println("子类的a：" + this.a);//虽然没有重名问题，明确是成员变量，先从子类的成员变量开始找 20
        System.out.println("父类的a：" + super.a);//明确说找子类对象从父类继承的a  10
        //子类对象中其实有两个a,

        System.out.println("b = " + b);////没有重名问题，也没有this.，就近原则  11
        System.out.println("b = " + this.b);//虽然没有重名问题，明确是成员变量，先从子类的成员变量开始找，没找到也一样取父类找 11
        System.out.println("b = " + super.b);//没有重名问题，明确是super.，直接去父类找 11
    }

    public void method(int a, int b){
        System.out.println("局部变量的a：" + a);//有重名问题，没有this.，就近原则，先找局部变量 30
        System.out.println("子类的a：" + this.a);//有重名问题，有this.，不看局部变量，直接看子类的成员变量a 20
        System.out.println("父类的a：" + super.a);//有重名问题，有super.，不看局部变量，也不看子类声明的成员变量，直接去父类 10

        System.out.println("b = " + b); //有重名问题，没有this.，就近原则，先找局部变量 13
        System.out.println("b = " + this.b);//有重名问题，有this.，不看局部变量，直接看成员变量b 11
        System.out.println("b = " + super.b);//有重名问题，有super.，不看局部变量，也不看子类声明的成员变量，直接去父类 11

    }
}
class Test{
    public static void main(String[] args){
        Son son = new Son();
        son.test();
        son.method(30,13);
    }
}
