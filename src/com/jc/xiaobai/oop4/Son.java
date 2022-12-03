package com.jc.xiaobai.oop4;

public class Son extends Father {
    String goSchool;

    Son() {
        super();
    }

    Son(int age, String name, String goSchool) {
        super(name, age);
        this.goSchool = goSchool;
    }

    Son(int age, String name, char sex, String goSchool) {
        super(name, age, sex);
        this.goSchool = goSchool;
    }

    void d(){
        super.a();
        Father.f();
        super.f();
    }

    @Override
    protected void a() {
        System.out.println("这个子类a方法被调用了");
        System.out.println("son今年：" + age + "岁了");
        super.a();
    }

    public static void main(String[] args) {
        Son son = new Son(14,"儿子","明日小学");
        Father fa = new Father("父亲",44);
        fa.a();
        son.a();
    }
}
