package com.jc.SXT.Demo2.oop1;

/**
 * 测试this关键字用法
 */
public class TestThis {
    private int a;
    private String name;
    private long age;
    private boolean b;
    public TestThis(){
        System.out.println("空参数构造方法被调用");
    }

    public TestThis(int a,String name){
        this();
    }

    public TestThis(int a,String name,boolean b,long age){
        this(a,name);
        this.b =b;
        this.age = age;
    }

    public static void test(){
        //this();//只要是静态方法就不能使用this
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return this.a;
    }

    public void setAge(){
        this.age = age;
    }

    public long getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        TestThis te1 = new TestThis(1,"jia",true,18);
        System.out.println(te1.name);
        System.out.println(te1.b);
        //System.out.println(a);//成员变量不能直接被调用
    }
}
