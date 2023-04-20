package com.jc.keyword.method;

public class Test{
    public static void main(String[] args){
        Son s = new Son();
        s.test();

        Daughter d = new Daughter();
        d.test();
    }
}
class Father{
    protected int num = 10;
    public int getNum(){
        return num;  //没有this.也没有super，从局部变量开始找，没有的话，从本来的成员变量列表开始制造，找num=10
    }
}
class Son extends Father{
    private int num = 20;

    public void test(){
        System.out.println(getNum());//子类没有重写，直接用父类的getNum()
        System.out.println(this.getNum());//this.，写不写都一样，子类没有重写，直接用父类的getNum()
        System.out.println(super.getNum());//很明确，就是找父类的
    }
}
class Daughter extends Father{
    private int num = 20;

    @Override
    public int getNum(){
        return num; //没有this.也没有super，从局部变量开始找，没有的话，从本来的成员变量列表开始制造，找num=20
    }

    public void test(){
        System.out.println(getNum());//有重写，getNum就是子类重写的getNum()  20
        System.out.println(this.getNum());//有重写，getNum就是子类重写的getNum() 20
        System.out.println(super.getNum());//有重写，但是有super.，直接找父类被重写的getNum 10
    }
}