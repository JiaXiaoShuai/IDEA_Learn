package com.jc.generic;

import org.junit.Test;

/**
 * 2.自定义泛型方法
 * 当有如下情况时，需要声明泛型方法
 * （1）如果我们定义类、接口时没有使用<类型变量>，但是某个方法形参类型不确定时，这个方法可以单独定义<类型变量>
 *  （2）如果我们之前说类和接口上的类型参数是不能用于静态方法中，那么当某个静态方法的形参类型不确定时静态方法可以单独定义<类型变量>
 *
 *   语法格式：
 *   【修饰符】  <泛型类型变量列表>  返回值类型 方法名（【形参列表】） 【throw  异常列表】{}
 *
 *   需求：
 * 我们编写一个数组工具类，包含可以给任意对象数组进行从小到大排序，调用元素对象的compareTo方法比较元素的大小关系。
 */
public class TestDefineGenericMethod implements Comparable<TestDefineGenericMethod> {
    private int age;
    private String name;

    public TestDefineGenericMethod(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDefineGenericMethod{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(TestDefineGenericMethod o) {

        return Integer.compare(age,o.age);
    }

    public static void main(String[] args) {
        TestDefineGenericMethod[] td = new TestDefineGenericMethod[4];
        td[0] = new TestDefineGenericMethod(12,"张三");
        td[1] = new TestDefineGenericMethod(33,"二麻子");
        td[2] = new TestDefineGenericMethod(6,"王五");
        td[3] = new TestDefineGenericMethod(56,"李四");
        System.out.println("原数组顺序：");
        for(TestDefineGenericMethod a : td){
            System.out.println(a);
        }

        MyArrays.sort(td);
        System.out.println("排序后数组1：");
        for(TestDefineGenericMethod a : td){
            System.out.println(a);
        }

        MyArrays2.sort(td);
        System.out.println("排序后数组2：");
        for(TestDefineGenericMethod a : td){
            System.out.println(a);
        }
    }

}
class MyArrays{
    public static void sort(Object[] arr){//这里用Object是因为，元素类型不确定，希望可以接收任意类型的对象数组
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                Comparable left = (Comparable) arr[j];
                if(left.compareTo(arr[j+1]) > 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}

class MyArrays2{
    public static<T> void sort(T[] t){
        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < t.length - 1; j++) {
                Comparable co = (Comparable) t[j];
                if(co.compareTo(t[j+1]) < 0){
                    T temp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = temp;
                }
            }
        }
    }
}