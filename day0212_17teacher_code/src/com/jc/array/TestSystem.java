package com.jc.array;

import org.junit.Test;

import java.util.Arrays;

/*
java.lang.System类
public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
    参数1：原数组
    参数2：原数组的起始下标
    参数3：目标数组
    参数4：目标数组的起始下标
    参数5：长度/元素个数
 */
public class TestSystem {
    @Test
    public void test1(){
        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,1,arr2,4, 3);
        /*
        从arr1的[1]的元素开始，复制3个，到arr2中，arr2从[4]位置开始存
         */
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0, 20, 30, 40, 0, 0, 0]
    }

    @Test
    public void test2(){
        int[] arr = {10,20,30,40,50,60,70};
        System.arraycopy(arr,1,arr,2,5);
        /*
        从arr的[1]的元素开始，复制5个元素，到arr中，arr从[2]开始存储复制的元素
        实际它会这样做
        arr[6] = arr[5]
        arr[5] = arr[4]
        arr[4] = arr[3]
        arr[3] = arr[2]
        arr[2] = arr[1]
        arr[6]被覆盖了
         */
        System.out.println(Arrays.toString(arr));//[10, 20, 20, 30, 40, 50, 60]
        //这种操作，一般用户在arr[1]位置准备插入新元素
    }

    @Test
    public void test3(){
        int[] arr = {10,20,30,40,50,60,70};
        System.arraycopy(arr,2,arr,1,5);
        /*
        从arr的[2]的元素开始，复制5个元素，到arr中，arr从[1]开始存储复制的元素
        实际它会这样做
        arr[1] = arr[2]
        arr[2] = arr[3]
        arr[3] = arr[4]
        arr[4] = arr[5]
        arr[5] = arr[6]
        arr[1]元素被覆盖了
                */
        System.out.println(Arrays.toString(arr));//[10, 30, 40, 50, 60, 70, 70]
        //这个操作用于删除arr[1]的元素
    }

    @Test
    public void Test(){
        int a = 2;

        int b = a++;
        System.out.println(b);

    }
}
