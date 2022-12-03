package com.jc.constructor;

class A{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    A(){
        System.out.println("A类无参构造器");
    }
    A(int a){
        this.a = a;
        System.out.println("A类有参构造器");
    }
}
class B extends A{
    private boolean a;
    /*B(){
        super();//可以省略，调用父类的无参构造
        System.out.println("B类无参构造器");
    }*/
    B(boolean a){
        super();//不管你指明或者不指明父类构造方法，都会选择调用最贴近的父类构造方法
        this.a = a;
//        super(a);//调用父类有参构造
        System.out.println("B类有参构造器");
    }
}
class Test8{
    public static void main(String[] args){
        B b1 = new B(true);
    }
}
