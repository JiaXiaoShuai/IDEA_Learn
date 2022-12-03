package com.jc.exer.exer5;

public class Employee implements Comparable{
    private int id;
    private String name;
    private int salary;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
    }

    public Employee(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "该员工信息：" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    /**
     * 比较两个对象的id大小
     * @param o 对象
     * @return 负数：小于传入对象；正数：大于传入的对象；0：等于传入的对象
     */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
        }else{
            System.out.println("这个对象不属于Employee类");
            return -1000000;
        }
        Employee em = (Employee) o;
        return this.id - em.id;
    }
}
