package inner;

/*
（1）声明一个Employee员工类，
- 包含编号、姓名、薪资、年龄，属性私有化，
- 提供get/set，提供无参和有参构造，
- 重写toString，返回员工信息
- 实现Comparable接口，重写int compareTo(Object emp)方法，按照编号比较大小。
 */
public class Employee implements Comparable{
    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.id  - ((Employee)o).id;
    }
}
