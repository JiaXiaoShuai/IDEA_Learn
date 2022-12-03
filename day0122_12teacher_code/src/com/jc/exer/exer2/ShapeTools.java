package com.jc.exer.exer2;
/*
（4）声明图形工具类ShapeTools
- 提供静态方法public static int compare(Shape s1, Shape s2)如果s1的面积大于、小于、等于s2的面积，分别返回正整数、负整数和0。
- 提供静态方法public static boolean equals(Shape s1, Shape s2)比较两个图形的面积和周长是否都相等
- 提供静态方法public static void sort(Shape[] arr)可以给所有图形按照面积从小到大排序，如果面积相同的按照周长从小到大排序
- 提供静态方法public static void print(Shape[] arr)可以遍历输出所有图形信息
 */
public class ShapeTools {

    /**
     * 比较两个图形面积的大小
     * @param s1 图形对象
     * @param s2 图形对象
     * @return 1:s1 > s2,0:s1 = s2,-1: s1 < s2
     */
    public static int compare(Shape s1, Shape s2){
        if(s1.area()>s2.area()){
            return 1;
        }else if(s1.area()==s2.area()){
            return 0;
        }else {
            return -1;
        }
    }

    /**
     * 比较两个图形的面积和周长是否都相等
     * @param s1 图形对象
     * @param s2 图形对象
     * @return true s1和s2的面积和周长都相等, false s1和s2的面积或周长不相等
     */
    public static boolean equals(Shape s1,Shape s2){
        return s1.area()==s2.area()&&s1.perimeter()==s2.perimeter();
    }

    /**
     * 数组从小到大排序
     * @param arr 数组
     */
    public static void sort(Shape[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j].area() > arr[j+1].area()){
                    Shape temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else if(arr[j].area() == arr[j+1].area()){
                    if(arr[j].perimeter() > arr[j+1].perimeter()){
                        Shape temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }

    /**
     * 遍历数组
     * @param arr Shape类型的数组
     */
    public static void print(Shape[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
