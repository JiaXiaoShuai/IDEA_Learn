package com.jc.exer3;

/*
class Father{
    private int a;

    <init>(){
        //super();//这里可以忽略它，因为Father类的父类是Object，它没有输出语句，不用管它
        a = getNumber();
        System.out.println("Father非静态代码块 a = " + a);

        System.out.println("Father()无参构造");
    }

    public int getNumber(){
        System.out.println("Father:getNumber()");
        return 1;
    }
}

class Son extends Father{
    <init>(){
        super();//它代表Father类<init>()
        System.out.println("Son非静态代码");
        System.out.println("Son()：无参构造");
    }
    public int getNumber(){
        System.out.println("Son:getNumber()");
        return 2;
    }
}


代码最终执行：
    a = getNumber(); //因为我们现在在newSon类的对象，所以对象的运行时是Son类，
                    //而getNumber是虚方法，所以要看子类重写后的getNumber
        System.out.println("Son:getNumber()");
        return 2;
    System.out.println("Father非静态代码块 a = " + a);
    System.out.println("Father()无参构造");
    System.out.println("Son非静态代码");
    System.out.println("Son()：无参构造");
 */
public class Test1{
    public static void main(String[] args){
        Son s1 = new Son();//找到就是Son类的<init>()
    }
}
class Father{
    private int a = getNumber();
    {
        System.out.println("Father非静态代码块 a = " + a);
    }
    Father(){
        System.out.println("Father()无参构造");
    }
    public int getNumber(){
        System.out.println("Father:getNumber()");
        return 1;
    }
}
class Son extends Father{
    {
        System.out.println("Son非静态代码");
    }
    public Son(){
        System.out.println("Son()：无参构造");
    }
    public int getNumber(){
        System.out.println("Son:getNumber()");
        return 2;
    }
}
