package com.jc.exer;

import com.jc.wildcard.MyArrays;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;


/*
（1）在数组工具类MyArrays中声明如下泛型方法：
- 可以在任意类型的对象数组中，查找某个元素的下标，按照顺序查找，如果有重复的，就返回第一个找到的，如果没有返回-1
- 可以在任意类型的对象数组中，查找最大值，要求元素必须实现Comparable接口
- 可以在任意类型的对象数组中，查找最大值，按照指定定制比较器来比较元素大小
（2）声明员工类型Employee，包含属性姓名（String），薪资（double），年龄（int），属性私有化，提供有参构造、get/set方法、重写toString方法，重写hashCode和equals方法。
（3）员工类Employee实现java.lang.Comparable<T>接口，指定T为Employee类型，
重写抽象方法int compareTo(T t)，按照薪资比较大小，薪资相同的按照姓名的自然顺序（调用String类的compareTo方法）比较大小。
（4）声明EmployeeAgeComparator比较器，实现java.util.Comparator<T>接口，
重写int compare(T t1, T t2)方法，指定T为Employee类型，按照员工年龄比较大小，年龄相同的按照姓名字典顺序（使用java.text.Collatord compare方法）比较大小
（5）在测试类中创建员工对象数组，并调用MyArrays的三个方法测试
 */
public class Exercise5 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("zhangsan",23,12000);
        arr[1] = new Employee("lisi",23,22000);
        arr[2] = new Employee("wangwu",23,12000);

        Employee max = MyArrays.max(arr);
        System.out.println(max);

        Employee max1 = MyArrays.max(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println(max1);
    }

}



