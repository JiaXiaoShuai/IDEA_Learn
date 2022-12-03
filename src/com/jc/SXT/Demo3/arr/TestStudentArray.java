package com.jc.SXT.Demo3.arr;

import java.util.Scanner;

/**
 * （1）定义学生类Student
 * <p>
 * - 声明姓名和成绩实例变量，
 * - String getInfo()方法：用于返回学生对象的信息
 * <p>
 * （2）测试类的main中创建一个可以装3个学生对象的数组，从键盘输入3个学生对象的信息，并且按照学生成绩排序，
 * 显示学生信息
 */
public class TestStudentArray {
    public static void main(String[] args) {
        Student[] stu = new Student[3];


        Scanner sc = new Scanner(System.in);//从键盘输入学生对象的信息
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的信息：");
            System.out.print("姓名：");
            String name = sc.next();
            System.out.print("成绩：");
            double score = sc.nextDouble();

            Student student = new Student();
            student.name = name;
            student.score = score;

            stu[i] = student;
        }


        //统一显示
        System.out.println("所有的学生信息如下：");
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].getInfo());
        }

        //按照成绩排序

        for (int i = 1; i < stu.length; i++) {
            for (int j = 0; j < stu.length - i; j++) {
                if (stu[j].score < stu[j + 1].score) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].getInfo());
        }
    }
}

