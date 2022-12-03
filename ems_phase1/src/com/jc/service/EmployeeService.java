package com.jc.service;

import com.jc.bean.Employee;

public class EmployeeService {
    //声明一个数组，用来存储添加的员工对象
    private Employee[] employees = new Employee[5];
    //声明一个int型的变量，记录当前员工对象的“个数”
    private int total;//默认值是0
    /*
    public EmployeeService(int totalCount)
    public boolean addEmployee(Employee emp)
    public boolean removeEmployee(int index)
    public Employee[] getAllEmployee()
    public Employee getEmployee(int index)
     */

    public boolean addEmployee(Employee emp) {
        if(total >= employees.length){
            System.out.println("数组已满，无法添加");
            return false;
        }
        //employees[0] = emp;
        employees[total++] = emp;
        return true;
    }

    //返回所有已添加的员工
    public Employee[] getAllEmployees(){
        //return employees;
        //创建一个新数组。长度为total，然后把employees数组中的total个员工对象复制到新数组中
        Employee[] all = new Employee[total];
        for(int i = 0; i < total;i++){
            all[i] = employees[i];
        }
        return all;
    }

    /*public Employee[] getAllEmployees(int length){
        //return employees;
        //创建一个新数组。长度为total，然后把employees数组中的total个员工对象复制到新数组中
        total = length;
        Employee[] all = new Employee[total];
        for(int i = 0; i < total;i++){
            all[i] = employees[i];
        }
        return all;
    }*/

    //根据下标返回一个员工对象
    public Employee getEmployee(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return employees[index];
    }


    //根据下标从数组中移除一个员工对象
    public boolean removeEmploee(int index){
        if(index < 0 || index >= total){
            return false;
        }
        //把index后面的元素往前复制
        for(int i = index; i < total-1;i++){
            employees[i] = employees[i+1];
        }
        //把employees[total - 1]位置置为null，并且员工数量减少1
        employees[--total] = null;
        return true;
    }
}
