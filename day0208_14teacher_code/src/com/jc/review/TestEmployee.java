package com.jc.review;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        arr[0] = new Employee(3,"张三",23,13000);
        arr[1] = new Employee(1,"老王",25,15000);
        arr[2] = new Employee(2,"老刘",22,16000);
        arr[3] = new Employee(4,"李四",24,14000);

        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//自动调用toString
        }

        //排序，按照编号排序
        /*for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
               // if(arr[j] > arr[j+1]){//报错，对象不能直接比较大小
//                if(arr[j].getId() > arr[j+1].getId()){//对
                if(arr[j].compareTo(arr[j+1]) > 0){//对
                   Employee  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
        MyArrays.sort(arr);

        System.out.println("排序之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//自动调用toString
        }

        System.out.println("按照年龄排序：");
        EmployeeAgeComparator ec = new EmployeeAgeComparator();
/*        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                // if(arr[j] > arr[j+1]){//报错，对象不能直接比较大小
//                if(arr[j].getAge() > arr[j+1].getAge()){//对
                if(ec.compare(arr[j],arr[j+1]) > 0){//对
                    Employee  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
        MyArrays.sort(arr, ec);

        System.out.println("排序之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//自动调用toString
        }

    }
}
