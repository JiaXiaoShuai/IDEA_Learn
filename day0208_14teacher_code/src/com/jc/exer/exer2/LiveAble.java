package com.jc.exer.exer2;

/**
 * 生物接口
 */
public interface LiveAble {
    public void eat();
    void breathe();

    default void sleep(){
        System.out.println("静止不动");
    }

    static void drink(){
        System.out.println("喝水");
    }
}

