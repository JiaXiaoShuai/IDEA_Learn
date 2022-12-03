package com.jc.init;

public class Father {
    private int a = 1;

    public Father(){
//        super();//隐藏
        System.out.println("Father类的无参构造");
    }
    public Father(int a, int b){
        System.out.println("Father类的有参构造");
        this.a = a;
        this.b = b;
    }
    {
        System.out.println("Father类的非静态代码块1，a = " + a);
        System.out.println("Father类的非静态代码块1，b = " + this.b);
    }
    private int b = 1;
    {
        System.out.println("Father类的非静态代码块2，a = " + a);
        System.out.println("Father类的非静态代码块2，b = " + b);
    }

    public String getInfo(){
        return "a = " + a + "，b = " + b;
    }
}
