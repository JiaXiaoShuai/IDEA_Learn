package com.jc.wrapper;

/*
7.3.4 包装类对象的特点
1、部分包装类有缓存对象
Byte：-128~127
Short：-128~127
Integer：-128~127
Long：-128~127
Float和Double不缓存
Character： 0-127 最原始的ASCII表范围字符串
Boolean：true,false
 */
public class TestCache {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        System.out.println(i == j);//true

        Integer obj1 = 1; //自动装箱，把int值转为包装类的对象
        Integer obj2 = 1; //自动装箱，把int值转为包装类的对象
        System.out.println(obj1 == obj2);//true  比较两个对象地址值
        System.out.println(obj1.equals(obj2));//true  Integer重写了Object的equals方法，比较两个包装对象里面的整数值

        System.out.println("--------------------");
        int x = 130;
        int y = 130;
        System.out.println(x == y);//true

        Integer obj3 = 130;
        Integer obj4 = 130;
        System.out.println(obj3 == obj4);//false  比较两个对象地址值
        System.out.println(obj3.equals(obj4));//true Integer重写了Object的equals方法，比较两个包装对象里面的整数值

        System.out.println("--------------------");
        Integer obj5 = new Integer(1);
        Integer obj6 = new Integer(1);//不是自动装箱
        System.out.println(obj5 == obj6);//false 比较地址，不能使用缓存对象，因为不是自动装箱
        System.out.println(obj5.equals(obj6));//true 比较值的大小

        System.out.println("----------------------------------");
        Integer obj7 = Integer.valueOf(1);
        Integer obj8 = Integer.valueOf(1);
        System.out.println(obj7 == obj8); //true
        System.out.println(obj7.equals(obj8)); //true

        System.out.println("--------------------");
        int m = 1;
        Integer n = 1000;
        int[] arr = {1};
        change(m, n, arr);

        System.out.println("m = " + m);//1
        System.out.println("n = " + n);//1
        System.out.println("arr[0] = " + arr[0]);//2

        System.out.println("--------------------");
        Integer p = 1000;//包装类
        double q = 1000;//基本数据类型
        System.out.println(p==q);//问题？  p和q是按照包装类进行比较还是基本数据类型比较
        //答案：如果是一个基本数据类型和一个包装类型，一定是拆箱为基本数据类型比较的
        //这里把p拆箱为int   int == double ，它俩再不一样的，按照基本数据类型的转换规则，自动转换


        Integer t = 1000;
        int z = 1000;
        System.out.println(t==z);//同上，拆箱为int

        Integer obj9 = 1;
        Double obj10 = 1.0;
        //System.out.println(obj9 == obj10);//编译报错，因为两个都是包装类，那么就按照包装类型的对象比较，比较对象的地址
        //比较两个对象的地址，必须是同一种类型，或者父子类，否则无法比较

    }


    /*
    int a：基本数据类型的参数，形参的修改和实参无关
    Integer i：引用数据类型，但是它是包装类类型，包装类的对象是不可变
    int[] arr：引用数据类想，形参修改了元素，相当于实参修改了元素
     */
    public static void change(int a, Integer i, int[] arr){
        a++;
        i++; //这里i要自增，只是自增后，i就指向新对象了，和原来的实参对象无关了
        arr[0]++;
    }
}

