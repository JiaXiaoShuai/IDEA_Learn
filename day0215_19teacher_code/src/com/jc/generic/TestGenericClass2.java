package com.jc.generic;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 下面以Comparable为例，演示泛型类与泛型接口的使用。
 * java.lang.Comparable<T>接口，抽象方法int compareTo(T t)
 */
public class TestGenericClass2 {
    public static void main(String[] args) {
        Rectangle[] arr = new Rectangle[4];
        arr[0] = new Rectangle(6,2);
        arr[1] = new Rectangle(4,3);
        arr[2] = new Rectangle(12,1);
        arr[3] = new Rectangle(5,4);

        //遍历数组
        System.out.println("原始数组顺序：");
        for (Rectangle rectangle : arr) {
            System.out.println(rectangle);
        }

        //（4）调用Arrays的sort方法，给矩形数组排序，并显示排序前后的结果
        Arrays.sort(arr);//自动使用Rectangle类compareTo方法比较两个元素的大小

        System.out.println("排序后：");
        for (Rectangle rectangle : arr) {
            System.out.println(rectangle);
        }

        //按照周长比较大小，不看面积
        /*
        java.util.Comparator<T>接口也是泛型接口
        抽象方法：int compare(T t1 ,T t2)
         */

        Arrays.sort(arr,new Comparator<Rectangle>(){
            @Override
            public int compare(Rectangle o1,Rectangle o2) {
                return Double.compare(o1.perimeter(),o2.perimeter());
            }
        });

        System.out.println("再次排序后：");
        for (Rectangle rectangle : arr) {
            System.out.println(rectangle);
        }

    }
}
