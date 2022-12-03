package com.jc.interfacetype;

/*
implements：实现接口。等价于（可以看成）继承
 */
public class Bird extends Animal implements Flyable,Jummping {

    @Override
    public void fly() {
        System.out.println("我要飞回家！！！");
    }

    @Override
    public void test() {//不能加default
        System.out.println("小鸟默认用翅膀飞，重写了父接口的默认方法");
    }

    @Override
    public void jump() {
        System.out.println("我蹦蹦跳跳回家");
    }
}
