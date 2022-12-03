package com.jc.classics;
/*
2.java的经典接口之二：java.util.Comparator
他也有一个抽象方法：int compare(Object o1,Object o2)
作用：也是比较两个对象的大小
这个接口是对Comparable接口的补充

这两个接口的相同点：
（1）都是比较对象大小用的。
（2）它们返回值类型都是int
    第一个对象比第二个对象大时，返回正整数
    第一个对象比第二个对象小时，返回负整数
    第一个对象比第二个对象相等时，返回0
 */
public class TestComparator {
    public static void main(String[] args) {
        Student s1 = new Student("张三",89,23);
        Student s2 = new Student("李四",96,22);

        //比较两个学生的成绩，如果成绩相同，按照姓名比较大小
        System.out.println(s1.compareTo(s2));

        //同时又想比较两个学生的年龄
        StudentAgeComparator sc = new StudentAgeComparator();
        System.out.println(sc.compare(s1,s2));
    }
}
