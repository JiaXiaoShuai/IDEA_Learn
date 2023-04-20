package inner;

import java.util.Comparator;

/*
（2）编写数组工具类ArrayTools，包含
- 静态方法public static void sort(Object[] arr)：实现给对象数组从小到大排序，要求元素的运行时类型必须实现Comparable接口
- 静态方法public static void sort(Object[] arr, Comparator c)：实现给对象数组从小到大排序，需要提供一个Comparator接口的实现类对象，给数组的元素对象排序。
- 静态方法public static void print(Object[] arr)：使用foreach循环遍历输出数组元素
 */
public class ArrayTools {
    public static void sort(Object[] arr){
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                Comparable left = (Comparable) arr[j];
                if(left.compareTo(arr[j+1]) > 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void sort(Object[] arr, Comparator c){
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                if(c.compare(arr[j],arr[j+1])> 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(Object[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
