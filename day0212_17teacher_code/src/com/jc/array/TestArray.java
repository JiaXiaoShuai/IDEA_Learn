package com.jc.array;

import org.junit.Test;

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
 */
public class TestArray {
    @Test
    public void Test01(){
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
}
