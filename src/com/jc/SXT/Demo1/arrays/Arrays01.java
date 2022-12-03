package com.jc.SXT.Demo1.arrays;

public class Arrays01 {
    public static void main(String[] args){
        //静态初始化一维数组
        int intArray[] = {1,2,3};

        //动态初始化一维数组
        long[] longArray = new long[4];
        longArray[0] = 13;
        longArray[1] = 14;
        longArray[2] = 15;
        longArray[3] = 16;


        //合并两个数组
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6,7, 8};

        int[] array = new int[array1.length+array2.length];

        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array[array1.length+i] = array2[i];
        }

        for(int x : array){
            System.out.print(x+"\t");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if(i < array1.length){
                array[i] = array1[i];
            }else{
                array[i] = array2[i-array1.length];
            }
        }

        for(int x : array){
            System.out.print(x+"\t");
        }
    }
}
