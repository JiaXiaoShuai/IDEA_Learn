package com.jc.review;

import com.jc.bean.Employee;
import com.jc.service.EmployeeService;
import com.jc.util.EMSUtility;

public class EmployeeView {
    EMSUtility ems = new EMSUtility();

    EmployeeService emSe = new EmployeeService();

    public void enterMainMenu() {
        while (true) {
            System.out.println("---------------员工信息管理--------------");

            System.out.println("\t\t1 添加员工");
            System.out.println("\t\t2 修改员工");
            System.out.println("\t\t3 删除员工");
            System.out.println("\t\t4 员工列表");
            System.out.println("\t\t5 退        出");
            System.out.println("请选择(1-5): ");

            char select = ems.readMenuSelection();

            switch (select) {
                case '1':
                    addNewEmployee();
                    listAllEmployees();
                    break;
                case '2':
                    modifyEmployee();
                    listAllEmployees();
                    break;
                case '3':
                    deleteEmployee();
                    listAllEmployees();
                    break;
                case '4':
                    listAllEmployees();
                    break;
                case '5':
                    System.out.println("是否真的退出（Y/N）?");
                    char confirm = ems.readConfirmSelection();
                    if (confirm == 'Y') {
                        return;
                    }
            }


        }

    }

    private void addNewEmployee() {
        System.out.println("-----------添加员工------------");
        System.out.print("姓名: ");
        String name = ems.readString(20);

        System.out.print("性别: ");
        char gender = ems.readChar();

        System.out.print("年龄: ");
        int age = ems.readInt();

        System.out.print("工资: ");
        double salary = ems.readDouble();

        System.out.print("电话: ");
        String tel = ems.readString(13);

        System.out.print("邮箱: ");
        String email = ems.readString(32);

        Employee emp = new Employee(name, gender, age, salary, tel, email);

        emp.setName(name);
        emp.setGender(gender);
        emp.setAge(age);
        emp.setSalary(salary);
        emp.setTel(tel);
        emp.setEmail(email);

        //EmployeeService emse = new EmployeeService();
        emSe.addEmployee(emp);

        System.out.println("-----------添加完成------------");
    }

    private void modifyEmployee() {
        System.out.println("-----------修改员工信息--------");

        System.out.println("请选择待修改员工编号（-1退出）:");
        int id = ems.readInt();
        if (id == -1) {
            return;//只会退出当前方法
        }
        //根据输入编号，获取员工对象
        //调用EmployeeService类的getEmployee方法
        Employee employee = emSe.getEmployee(id - 1);
        if (employee == null) {
            System.out.println(id + "编号的员工对象不存在");
            return;
        }
        System.out.print("姓名(" + employee.getName() + "):");
        //快捷键查看调用方法的形参列表 Ctrl + P, 光标定位在所使用方法的()中按快捷键
        String name = ems.readString(20, employee.getName());
        employee.setName(name);

        System.out.println("性别("+employee.getGender()+"):");
        char gender = ems.readChar(employee.getGender());
        employee.setGender(gender);

        System.out.println("年龄("+employee.getAge()+"):");
        int age = ems.readInt(employee.getAge());
        employee.setAge(age);

        System.out.println("工资("+employee.getSalary()+"):");
        double salary = ems.readDouble(employee.getSalary());
        employee.setSalary(salary);

        System.out.println("电话("+employee.getTel()+"):");
        String tel = ems.readString(11,employee.getTel());
        employee.setTel(tel);

        System.out.println("邮件("+employee.getEmail()+"):");
        String email = ems.readString(22,employee.getEmail());
        employee.setEmail(email);

        System.out.println("----------修改完成-----------");

    }

    private void deleteEmployee() {
        System.out.println("-----------------删除员工-------------");
        System.out.println("请选择待删除员工编号（-1退出）");
        int id= ems.readInt();

        if(id == -1){
            return;
        }

        System.out.println("确认是否删除(Y/N):");
        char confirm = ems.readConfirmSelection();
        if(confirm == 'N'){
            return;
        }

        boolean result = emSe.removeEmploee(id-1);
        System.out.println(result?"删除成功":"删除失败");
        System.out.println("---------------------删除完成---------------");
    }

    private void listAllEmployees() {
        //获取所有EmployeeService类中的对象数组
        //EmployeeService emSe = new EmployeeService();

        Employee[] allEmployees = emSe.getAllEmployees();
        System.out.println("编号\t姓名\t性别\t年龄\t工资\t电话\t邮箱");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println((i + 1) + "." + "\t" + allEmployees[i].getInfo());
        }

    }
}
