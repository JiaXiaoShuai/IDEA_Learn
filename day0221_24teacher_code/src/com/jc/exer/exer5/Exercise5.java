package com.jc.exer.exer5;

/*
（1）声明一个Employee员工类型，包含编号、姓名、性别，年龄，薪资。属性私有化，提供有参构造，get/set，重写toString。

（2）声明一个EmployeeSerice员工管理类

- 包含一个private 的属性ArrayList<Employee> all。
- 包含public void add(Employee emp)方法，可以添加员工到all集合中
- 包含public ArrayList<Employee> get(Predicate<Employee> p)，即将满足p指定的条件的员工，添加到一个新的ArrayList<Employee> 集合中返回。


（3）在测试类中创建EmployeeSerice员工管理类的对象，添加一些员工对象，之后调用get方法，分别获取：

* 所有员工对象
* 所有年龄超过35的员工
* 所有薪资高于15000的女员工
* 所有编号是偶数的员工
* 名字是“张三”的员工
* 年龄超过25，薪资低于10000的男员工
 */
public class Exercise5 {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();

        es.add(new Employee(1, "张三", '男', 33, 8000));
        es.add(new Employee(2, "翠花", '女', 23, 18000));
        es.add(new Employee(3, "无能", '男', 46, 8000));
        es.add(new Employee(4, "李四", '女', 23, 9000));
        es.add(new Employee(5, "老王", '男', 23, 15000));
        es.add(new Employee(6, "大嘴", '男', 23, 11000));

        /*
        之后调用get方法，分别获取：
        * 所有员工对象
        * 所有年龄超过35的员工
        * 所有薪资高于15000的女员工   e.getSalary() > 15000 && e.getGender() == '女'
        * 所有编号是偶数的员工        e.getId()%2==0
        * 名字是“张三”的员工         "张三".equals(e.getName())
        * 年龄超过25，薪资低于10000的男员工  e.getAge()>25 && e.getSalary() <10000
         */

        //获取：所有员工对象
        System.out.println("所有员工对象:");
        //public ArrayList<Employee> get(Predicate<Employee> p)
        //使用Lambda表达式给Predicate接口的形参p赋值，本质上就是使用Lambda表达式实现Predicate接口的抽象方法boolean test(T t)
//        ArrayList<Employee> list1 = es.get(e -> true);
//        list1.forEach(t -> System.out.println(t));

        es.get(e -> {return true;}).forEach(t -> System.out.println(t));

        //所有年龄超过35的员工
        System.out.println("所有年龄超过35的员工:");
        es.get(e-> e.getAge()>35).forEach(t -> System.out.println(t));

    }
}
