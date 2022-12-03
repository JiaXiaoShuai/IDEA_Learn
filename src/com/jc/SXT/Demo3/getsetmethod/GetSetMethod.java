package com.jc.SXT.Demo3.getsetmethod;

/**
 * 测试get，set方法（当成员变量私有化的时候，私有化时成员变量也叫属性=）
 */
public class GetSetMethod {
    private String name;
    private int age;
    private boolean a;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public boolean isA() {
        return a;
    }
}
