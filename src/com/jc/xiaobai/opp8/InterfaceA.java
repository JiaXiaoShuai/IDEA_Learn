package com.jc.xiaobai.opp8;

public interface InterfaceA {
    void methodA();

    String methodB();

    //默认方法
    default int methodC(){
        return 0;
    }

    default String methodD(){
        return "这是默认方法";
    }

    static double methodE(){
        return 0.0;
    }
}
