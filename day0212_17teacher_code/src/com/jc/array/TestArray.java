package com.jc.array;

import org.junit.Test;

import java.text.AttributedCharacterIterator;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 * 1.找最大值
 *      （1）先假设第一个元素最大，复制给max
 *      （2）后面的元素与max比较，如果有比max大的，就重新修改max的值
 *
 * 2.找最大值及其下标
 *  （1）最大值只有一个
 *      设置两个变量，一个是max，一个是index
 *      A： 先假设第一个元素最大，赋值给max，index=0
 *      B：后面的元素与max比较，如果有比max大的。就重新修改max的值和index的值
 *  （2）最大值有多个
 *      A：先找到最大的值
 *      B：在数组中遍历，那些元素和最大值一样
 *
 * 3.顺序查找
 *  从头往后遍历数组，与目标元素一一比较
 *
 * 4、二分查找。
 * 数组是有序的，从小到大
 * int left = 0;
 * int right = arr.length-1;
 * while(left<=right){
 *     int mid = left + (right-left)/2;
 *     if(arr[mid] == target){
 *         找到了
 *         break;
 *     }else if(target > arr[mid]){
 *         left = mid + 1;
 *     }else{
 *         right = mid - 1;
 *     }
 * }
 *
 * 5.反转
 * 思路：首位元素交换法
 * for(int left = 0,right = arr.length-1;left < right; left++,right--){
 *     元素类型 temp = arr[left];
 *     arr[left] = arr[right];
 *     arr[right] = temp;
 *
 *6、冒泡排序
 * 相邻元素比较
 * for(int i=1; i<arr.length; i++){
 *     for(int j=0; j<arr.length-i; j++){
 *         if(arr[j] > arr[j+1]){
 *             元素类型 temp = arr[j];
 *             arr[j] = arr[j+1];
 *             arr[j+1] = temp;
 *         }
 *     }
 * }
 * 7、直接选择排序
 * 思路：每一轮找到本轮未排序元素的最大/最小值
 * for(int i=0; i<arr.length-1; i++){
 *     int min = arr[i];
 *     int index = i;
 *     //找最小值
 *     for(int j=i+1; j<arr.length; j++){
 *         if(arr[j] < min){
 *             min = arr[j];
 *             index = j;
 *         }
 *     }
 *     //交换
 *     if(i!=index){
 *         //交换arr[i]与arr[index]
 *         元素的类型 temp = arr[i];
 *         arr[i] = arr[index];
 *         arr[index] = temp;
 *     }
 * }
 *
 * 数组工具类java.util.Arrays:
 * public static int binarySearch(int[] a,int key):如果key在数组中，则返回对应下标，否则返回（-（插入点）-1）。
 *      插入点 被定义为讲key插入数组的那一点
 * public static void sort(int[] a):排序，从小到大，底层不是冒泡排序，是优化过的快速排序。
 * public static void sort(Object[] a):要求元素实现自然排序接口java.lang.Comparable接口
 * public static void sort(Object[] a,Comparator c):在排序过程中使用定制排序规则
 * public static String toString(int[] a):把元素拼接结果转为字符串返回
 *
 * public static String toString(Object[] a):把元素拼接结果转为字符串返回，对象会在拼接过程中自动调用对象的toString
 *
 * public static int[] copyOf(int[] original,int newLength)：复制一个新数组，长度为newLength
 * public static int[] copyOfRange(int[] original,int from,int to)：复制original的[from, to)
 * public static boolean equals(int[] a, int[] a2) ：比较两个数组的长度、元素是否完全相同
 * public static void fill(int[] a,int val)：给数组填充元素
 *
 */
public class TestArray {
    @Test
    public void TestC(){
        System.out.println("Hello,World");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }

    @Test
    public void TestA(){
        int[] arr = {3,45,67,32,45,67,89,44};
        int a = arr[0];
        int index = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if(a < arr[i]){
                a=arr[i];
                index = i;
            }

        }

        System.out.println("最大值是:" + a+"序号为:"+index);
    }

    @Test
    public void TestB(){
        int[] arr = {2,3,4,5,12,34,55,76,88,90};
        int left = 0;
        int right = arr.length - 1;
        int target = 55;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                System.out.println("找到了");
                break;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
    }

    @Test
    public void Test01(){
        int[] arr = {4,6,8,9,12};
        int target = 5;
        System.out.println(Arrays.binarySearch(arr, target));//-2不存在

        target = 15;
        System.out.println(Arrays.binarySearch(arr, target));//-6不存在
    }

    @Test
    public void Test02(){
        int[] arr = {4,6,8,9,12};
        int target = 9;
        System.out.println(Arrays.binarySearch(arr, target));//3 存在
    }

    @Test
    public void Test03() {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, "张三", 90);
        arr[1] = new Student(1, "李四", 45);
        arr[2] = new Student(5, "王五", 100);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return s2.getScore() - s1.getScore();
            }
        });

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test05(){
        Student[] arr = new Student[3];
        arr[0] = new Student(2,"Jack",90);
        arr[1] = new Student(1,"Bob",45);
        arr[2] = new Student(5,"Tom",100);

        Arrays.sort(arr, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                //比较两个学生的姓名，name是String类型
//                return s1.getName() - s2.getName();//错误，字符串不支持减法
//                if(s1.getName() > s2.getName()){//错误，字符串不支持直接比较大小，因为是对象
////                    //...
////                }
                //String类实现了java.lang.Comparable接口
                return s1.getName().compareTo(s2.getName()); //String的自然排序是按照字符的Unicode编码值比较
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void Test06(){
        Student[] arr = new Student[3];
        arr[0] = new Student(2,"张三",90);
        arr[1] = new Student(1,"李四",45);
        arr[2] = new Student(5,"王五",100);

        Arrays.sort(arr,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                //Collator 类执行区分语言环境的String比较
                Collator c = Collator.getInstance(Locale.CHINA);
                return c.compare(s1.getName(),s2.getName());
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void Test07(){
        int[] arr = {1,2,3,4,5};
        int[] newArr1 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(newArr1));//[1,2,3]

        int[] newArr2 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newArr2));

        int[] newArr3 = Arrays.copyOf(arr,0);
        System.out.println(Arrays.toString(newArr3));

        int[] arr1 = null;
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void Test08(){
        int[] arr = {1,2,3,4,5};
        int[] newArr1 = Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(newArr1));//[3,4]

        int[] newArr2 = Arrays.copyOfRange(arr,2,10);
        System.out.println(Arrays.toString(newArr2));//[3,4,5,0,0,0,0,0]

        int[] newArr3 = Arrays.copyOfRange(arr, 6,10);
        System.out.println(Arrays.toString(newArr3));//ArrayIndexOutOfBoundsException

    }

    @Test
    public void test09(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};

        System.out.println(Arrays.equals(arr1,arr2));//false
    }

    @Test
    public void test10(){
        int[] arr = new int[5];
        arr[0] = 2;
        //把所有元素填充为1
        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr));
    }

}
