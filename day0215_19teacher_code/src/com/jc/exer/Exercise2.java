package com.jc.exer;

import java.util.Arrays;

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
