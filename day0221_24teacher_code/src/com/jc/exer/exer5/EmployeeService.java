package com.jc.exer.exer5;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
（2）声明一个EmployeeSerice员工管理类

- 包含一个private 的属性ArrayList<Employee> all。
- 包含public void add(Employee emp)方法，可以添加员工到all集合中
- 包含public ArrayList<Employee> get(Predicate<Employee> p)，即将满足p指定的条件的员工，添加到一个新的ArrayList<Employee> 集合中返回。


 */
public class EmployeeService {
    private ArrayList<Employee> all = new ArrayList<>();//all需要初始化

    public void add(Employee emp){
        all.add(emp);
    }

    /*
    调用这个get方法
    （1）要么传入一个Predicate<Employee>接口的实现类的对象
    （2）要么传入一个给p赋值的Lambda表达式
    无论是（1）还是（2）都会实现他们的test抽象方法。
     */
    public ArrayList<Employee> get(Predicate<Employee> p){
        ArrayList<Employee> result = new ArrayList<Employee>();
        /*
        遍历all集合，判断每一个元素是否满足某个条件
         */
        for (Employee employee : all) {
//            if(employee是否满足xx条件){
            /*
            Predicate<T>接口是一个函数式接口，判断型函数式接口，它有一个抽象方法 boolean test(T t)
             */
            if(p.test(employee)){//面向对象的第三个基本特征 多态
                result.add(employee);
            }
        }

        return result;
    }
}
