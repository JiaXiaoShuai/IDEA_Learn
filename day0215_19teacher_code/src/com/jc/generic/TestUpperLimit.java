package com.jc.generic;

import org.junit.Test;

/**
 * 四.声明泛型变量时指定上限
 * 我们在声明<T>等类型变量时，可以给它设定“上限”
 * 语法格式：
 *  <T extends 上限>：表示T的类型必须是<= 上限，即要么是上限本身，要么是继承上限类或者实现了上限接口的类型
 *
 *  一个类型变量的上限可以是1个，也可以是很多个，但是要求如果有多个的话，类只能有一个，其他的是接口类型
 *  而且类在左边，其它的类型在右边
 */
public class TestUpperLimit {
    @Test
    public void test01(){
        XueSheng<Integer> x1 = new XueSheng<>("张三",34);
        XueSheng<Double> x2 = new XueSheng<>("李四",45d);
//        XueSheng<Character> x3 = new XueSheng<Character>("李四",45d);//错误，Character不是Number的子类
//        XueSheng<String> x4 = new XueSheng<String>("李四",45d);//错误，String不是Number的子类
//        XueSheng<Number> x5 = new XueSheng<Number>("李四",45d);//错误，Number类没有实现Comparable接口
    }

    @Test
    public void test02(){
        Circle[] arr = new Circle[3];
        arr[0] = new Circle(1.5);
        arr[1] = new Circle(1.2);
        arr[2] = new Circle(1.8);
//        ArraysTools.sort(arr);//让其在编译这里就直接给出提示，没有继承Comparable
    }
}

class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
}

class ArraysTools{
    //这里<T extends Comparable>表示类型的上限是Comparable，Comparable是接口，表示T要实现Comparable接口的意思
    public static <T extends Comparable> void sort(T[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                Comparable co = (Comparable) arr[j];//这段代码有风险，要运行通过的话，需要T类型必须实现Comparable接口
                T temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

/*
学生类，包含姓名和成绩。
现在成绩类型不确定，但是要求成绩必须是Number或Number的子类对象。
java.lang.Number表示数值类型，例如它的子类有。
加一个要求，成绩不仅要求是Number类或它的子类，还要求实现Comparable接口
 */

class XueSheng <T extends Number & Comparable>{
    private String name;
    private T score;

    public XueSheng(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "XueSheng{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
