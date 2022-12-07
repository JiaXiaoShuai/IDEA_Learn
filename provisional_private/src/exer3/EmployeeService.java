package exer3;

import java.util.function.Predicate;

public class EmployeeService {
    private Employee[] arr = new Employee[5];
    private int total;//记录员工对象个数
    public void add(Employee emp){
        /*for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                arr[i] = emp;
                return;
            }*/


        if(total >= arr.length){
            System.out.println("数组已满");
        }
        arr[total++] = emp;
    }

    public Employee[] get(Predicate p){
        int count = 0;
        for(Employee i:arr){
            if(p.test(i)){
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(p.test(arr[i])){
                result[k++] = arr[i];
            }
        }

        return result;
    }
}
