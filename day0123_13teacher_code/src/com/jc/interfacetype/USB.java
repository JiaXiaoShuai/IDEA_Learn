package com.jc.interfacetype;

public interface USB {
    //抽象方法
    public abstract void in();//读入数据
    public abstract void out();//输出数据

    default void method(){

    }
}
