package com.jc.classics;

/*
1.经典接口之一：java.lang.Comparable接口
他只有一个唯一的抽象方法：int compareTo（Object obj）；
作用：用于比较两个对象的“大小“关系的。

案例：比较两个学生对象的大小，按照成绩比较大小，如果成绩相同的，按照姓名比较大小
 */
public class TestComparable {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 50);
        Student s2 = new Student("李四", 80);

        //比较两个学生对象的大小
/*        if(s1 > s2){
            System.out.println("s1 > s2");
        }else if(s1<s2){
            System.out.println("s1 < s2");
        }else{
            System.out.println("s1 = s2");
        }*///错误，对象不支持直接使用 比较运算符比较大小关系

        int result = s1.compareTo(s2);
        System.out.println("result = " + result);

        if (result > 0) {
            System.out.println("s1 > s2");
        }else if(result < 0){
            System.out.println("s1 < s2");
        }else{
            System.out.println("s1 = s2");
        }
    }
}
