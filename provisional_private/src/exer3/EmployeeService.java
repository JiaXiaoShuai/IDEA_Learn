package exer3;

public class EmployeeService {
    private Employee[] arr = new Employee[5];
    private int total;//记录员工对象个数
    public void add(Employee emp){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                arr[i] = emp;
                return;
            }
        }
    }
}
