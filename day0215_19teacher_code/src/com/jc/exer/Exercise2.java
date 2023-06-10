package com.jc.exer;

import java.util.Arrays;
/*
（1）声明员工类型Employee，包含属性姓名（String），薪资（double），年龄（int），属性私有化，提供有参构造、get/set方法、重写toString方法。

（2）员工类Employee实现java.lang.Comparable<T>接口，指定T为Employee类型，重写抽象方法int compareTo(T t)，按照薪资比较大小，薪资相同的按照姓名的自然顺序（调用String类的compareTo方法）比较大小。

（3）在测试类中创建Employee数组，然后调用Arrays.sort(Object[] arr)方法进行排序，遍历显示员工信息。

（4）声明EmployeeAgeComparator比较器，实现java.util.Comparator<T>接口，重写int compare(T t1, T t2)方法，指定T为Employee类型，按照员工年龄比较大小，年龄相同的按照姓名字典顺序（使用java.text.Collatord compare方法）比较大小

（5）再次调用Arrays.sort(Object[] arr,Comparator<T> c)方法对员工数组进行排序，遍历显示员工信息
 */

public class Exercise2 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        arr[0] = new Employee("张三", 18000, 18);
        arr[1] = new Employee("李四", 18000, 18);
        arr[2] = new Employee("王五", 18000, 18);
        arr[3] = new Employee("赵六", 18000, 18);

        System.out.println("未排序之前：");
        for(Employee e : arr){
            System.out.println(e);
        }

        Arrays.sort(arr);
        System.out.println("排序后：");
        for(Employee e : arr){
            System.out.println(e);
        }

        System.out.println("按照新方法排序后：");
        Arrays.sort(arr,new EmployeeAgeComparator());
        for (Employee e :arr){
            System.out.println(e);
        }

    }
}
