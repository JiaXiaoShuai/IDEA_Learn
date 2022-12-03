package com.jc.xiaobai.opp5;

public final class Final {
}


/*
class jb extends Final{
    //不同继承final修饰的类
}*/

class A{
    final void doSomething(){
        System.out.println();
    }
}

class B extends A{
    /*@Override
    void doSomething(){//final修饰的方法不能被重写
        System.out.println();
    }*/
}