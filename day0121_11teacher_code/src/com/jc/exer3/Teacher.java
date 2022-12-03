package com.jc.exer3;

public class Teacher extends Person{
    private String name = "tom";
    public Teacher(){
        System.out.println("this is a teacher.");
//        super();//编译报错，因为super()只能出现在构造器的首行
    }
    public static void main(String[] args){
        Teacher tea = new Teacher();
       // System.out.println(this.name); //后面要学习的另一个知识点，静态方法中不允许出现this
    }
}