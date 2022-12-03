package com.jc.test;

import com.jc.bean.Employee;
import com.jc.service.EmployeeService;

public class TestEmployeeService {
    public static void main(String[] args) {
        //要调用EmployeeService类的addEmployee方法
        EmployeeService es = new EmployeeService();

        Employee e1 = new Employee();
        e1.setAge(11);
        e1.setName("张三");
        e1.setGender('男');
        e1.setSalary(10000);
        e1.setTel("010-56253825");
        e1.setEmail("jia@qq.com");

        es.addEmployee(e1);

        Employee e2 = new Employee();
        e2.setAge(12);
        e2.setName("李四");
        e2.setGender('女');
        e2.setSalary(10100);
        e2.setTel("010-33253825");
        e2.setEmail("jiacpmg@qq.com");

        es.addEmployee(e2);
        /*
        查看一下
        调用EmployeeService类的getAllEmployees（）方法
        先获取到所有已经添加的员工
         */

        Employee[] allEmployees = es.getAllEmployees();



        System.out.println("编号\t姓名\t性别\t年龄\t工资\t电话\t邮箱");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i].getInfo());
        }

        System.out.println(es.getEmployee(0).getInfo());
        System.out.println("_________________________________");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i].getInfo());
        }

        System.out.println("_________________________________");

        System.out.println(es.removeEmploee(1));
        Employee[] allEmployees1 = es.getAllEmployees();
        for (int i = 0; i < allEmployees1.length; i++) {
            System.out.println(allEmployees1[i].getInfo());
        }

        System.out.println("________________________________");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i].getInfo());
        }
    }
}
