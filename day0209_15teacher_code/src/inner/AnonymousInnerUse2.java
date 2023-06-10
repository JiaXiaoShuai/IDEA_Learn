package inner;

import java.util.Comparator;

public class AnonymousInnerUse2 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee(1,"张三",15000,23);
        arr[1] = new Employee(2,"李四",12000,21);
        arr[2] = new Employee(4,"王五",16000,22);
        arr[3] = new Employee(5,"赵六",12000,23);
        arr[4] = new Employee(3,"钱七",13000,25);

        System.out.println("按照编号从小到大排序：");
        ArrayTools.sort(arr);
        ArrayTools.print(arr);

        System.out.println("按照薪资从高到低排序：");
        ArrayTools.sort(arr, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });
        ArrayTools.print(arr);

        System.out.println("按照年龄从小到大排序：");
        ArrayTools.sort(arr, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return e1.getAge() - e2.getAge();
            }
        });
        ArrayTools.print(arr);
    }
}
