package com.jc.xiaobai.opp2;

/**
 * 用来研究构造方法的
 */
public class Computer extends Object {
    //成员变量
    private String cpu = "adm";
    private String memory;//内存
    private String mainBoard;//主板
    private String keyBoard;//键盘

    //构造方法
    public Computer(){
        super();
    }

    public Computer(String cpu,String memory){
        this.cpu = cpu;
        this.memory = memory;
    }

    public Computer(String mainBoard,String keyBoard,String memory,String cpu){
        this(memory,cpu);//调用构造方法必须位于第一句；不能用于static中
        this.mainBoard = mainBoard;
        this.keyBoard = keyBoard;
    }
}
