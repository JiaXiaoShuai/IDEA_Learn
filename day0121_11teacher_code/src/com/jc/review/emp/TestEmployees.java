package com.jc.review.emp;

import java.util.Scanner;

/*
（6）声明一个员工数组，存储各种员工，你现在是人事，遍历查看每个人的详细信息，并统计实发工资总额，通知财务准备资金。
（7）从键盘输入当期月份值，如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，通知领取生日礼物。
 */
public class TestEmployees {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        /*arr[0] = new SalaryEmployee();//现在这么写不合适，因为这样写，就不好给SalaryEmployee对象设置生日什么的
        arr[0].setName("张三");
        arr[0].setBirthday(xx);//编译错误，因为arr[0]的编译时类型是Employee，这个类中没有这个方法*/

        SalaryEmployee s = new SalaryEmployee();
        s.setName("张三");
        MyDate myDate = new MyDate();
        myDate.setYear(1995);
        myDate.setMonth(5);
        myDate.setDay(1);
        s.setBirthday(myDate);//方式一，设置生日
        s.setSalary(12000);
        arr[0] = s;

        HourEmployee h = new HourEmployee();
        h.setName("李四");
        h.setHour(100);
        h.setMoneyPerHour(50);
        arr[1] = h;

        Manager m = new Manager();
        m.setName("刘永涛");
        m.setBirthday(new MyDate());//方式二，设置生日
        m.getBirthday().setYear(1998);
        /*
        m.getBirthday()调用的是Manager类从SalaryEmployee类继承的getBirthday方法
        返回的结果是一个MyDate类对象，这个对象是由上面的 m.setBirthday()方法赋值的对象。

        m.getBirthday()就相当于/等价于一个MyDate对象，就可以继续调用MyDate类中的方法，比如setYear()方法
         */
        m.getBirthday().setMonth(1);
        m.getBirthday().setDay(1);
        m.setSalary(15000);
        m.setBonusRate(0.08);
        arr[2] = m;

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
