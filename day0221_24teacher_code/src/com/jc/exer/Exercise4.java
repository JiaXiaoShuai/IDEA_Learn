package com.jc.exer;

import java.util.Arrays;
import java.util.HashMap;

/*
（2）案例需求
- 声明一个Employee员工类型，包含属性编号、姓名、薪资，属性私有化，提供有参构造，get/set，重写toString。
- 添加n个员工对象到一个HashMap<Integer,Employee>集合中，其中员工编号为key，员工对象为value。
- 调用Map的forEach遍历集合
- 调用Map的replaceAll方法，将其中薪资低于10000元的，薪资设置为10000。
- 再次调用Map的forEach遍历集合查看结果
 */
public class Exercise4 {
    public static void main(String[] args) {
        HashMap<Integer,Employee> map = new HashMap<>();
        //其中员工编号为key，员工对象为value。
        map.put(1, new Employee(1,"张三",15000));
        map.put(2, new Employee(2,"李四",16000));
        map.put(3, new Employee(3,"王五",8000));

        //调用Map的forEach遍历集合
        map.forEach((key,value) -> System.out.println(key+":"+value));

        //调用Map的replaceAll方法，将其中薪资低于10000元的，薪资设置为10000。
        /*
        第一步：搞清楚replaceAll方法的签名
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        第二步：搞清楚BiFunction<T, U, R> 接口的抽象方法
        R apply(T t, U u);
        第三步：搞清楚，T,U,R分别是什么
        从replaceAll方法的签名中可以看出：
            T ->? super K       ==> key
            U ->? super V       ==> value
            R ->? extends V     ==> value  返回的是value对象，经过处理的value对象
         */
        map.replaceAll((key,value) -> {
            if(value.getSalary() < 10000){
                value.setSalary(10000);
            }
            return value;
        });


        //调用Map的forEach遍历集合
        map.forEach((key,value) -> System.out.println(key+":"+value));

        Object[] objects = map.values().toArray();
        System.out.println(Arrays.toString(objects));
        System.out.println("objects = " + objects);
    }
}
