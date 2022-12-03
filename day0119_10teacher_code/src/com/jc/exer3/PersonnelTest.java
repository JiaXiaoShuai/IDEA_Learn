package com.jc.exer3;

import java.util.Scanner;

public class PersonnelTest {
    public static void main(String[] args) {
        SalaryEmployee emp = new SalaryEmployee();
        emp.setName("张三");
        emp.setSalary(15000);
        MyDate empBirthday = new MyDate();
        empBirthday.setYear(1995);
        empBirthday.setMonth(5);
        empBirthday.setDay(1);
        emp.setBirthday(empBirthday);

        Manager manager = new Manager();
        manager.setName("老王");
        manager.setSalary(20000);
        MyDate mgrBirthday = new MyDate();
        mgrBirthday.setYear(1990);
        mgrBirthday.setMonth(6);
        mgrBirthday.setDay(1);
        manager.setBirthday(mgrBirthday);
        manager.setBonusRate(0.1);

        HourEmployee he = new HourEmployee();
        he.setName("李四");
        he.setMoneyPerHour(50);
        he.setHour(100);

        Employee[] arr = new Employee[3];
        arr[0] = emp;
        arr[1] = manager;
        arr[2] = he;

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
            sum += arr[i].earning();
        }
        System.out.println("实发工资总额：" + sum);

        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = input.nextInt();
        System.out.println("请输入日:");
        int day = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof SalaryEmployee){
                SalaryEmployee s = (SalaryEmployee) arr[i];
                if(s.getBirthday().getMonth() == month){
                    if(s.getBirthday().getDay() == day)
                    System.out.println(s.getName() + "生日快乐，请到人事部门领取生日大礼包");
                }
            }
        }
        input.close();
    }
}
