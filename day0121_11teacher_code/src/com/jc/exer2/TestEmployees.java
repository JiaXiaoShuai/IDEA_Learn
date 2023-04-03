package com.jc.exer2;

import java.util.Scanner;

/*
（6）声明一个员工数组，存储各种员工，你现在是人事，遍历查看每个人的详细信息，并统计实发工资总额，通知财务准备资金。
（7）从键盘输入当期月份值，如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，通知领取生日礼物。
 */
public class TestEmployees {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
//        arr[0] = new SalaryEmployee("张三",12000,new MyDate(1995,5,1));
        arr[0] = new SalaryEmployee("张三",12000,1995,5,1);
        arr[1] = new HourEmployee("李四",100,50);
        arr[2] = new Manager("王五",18000,1988,5,6,0.08);


        //遍历数组，查看每个对象的信息，就是调用它们的getInfo方法
        //并统计实发工资总额，通知财务准备资金
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
            sum += arr[i].earning();
        }
        System.out.println("实发工资总额：" + sum);

        /*
        从键盘输入当期月份值，如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，通知领取生日礼物。

         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入当前月份值：");
        int month = input.nextInt();
        //遍历数组，判断他是否是正式工（包括SalaryEmployee和Manager），看是否是他的生日
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof SalaryEmployee){ //因为Manager是SalaryEmployee的子类，它的对象也会满足这个if条件
                SalaryEmployee se = (SalaryEmployee) arr[i]; //arr[i]的编译时类型是Employee，不管arr[i]里面存储的是什么对象，这句代码都是向下转型
                                                //向上，向下转型都是针对编译时类型
                if(se.getBirthday().getMonth() == month){
                    System.out.println("生日快乐，来人事部门领取生日礼物");
                }
            }
        }

        input.close();

    }
}
