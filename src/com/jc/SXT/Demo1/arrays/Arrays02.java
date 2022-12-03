package com.jc.SXT.Demo1.arrays;

/**
 * 二维数组
 */
public class Arrays02 {
    public static void main(String[] args) {
        //静态初始化二维数组
        int[][] intArrays = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        //动态初始化二维数组
        double[][] doubleArrays = new double[3][3];

        for (int[] x : intArrays) {
            for (int a : x) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
        //计算数组intArray元素的平方根，结果保存到doubleArray里
        for (int i = 0; i < intArrays.length; i++) {
            for (int x = 0; x < intArrays[i].length; x++) {
                doubleArrays[i][x] = Math.sqrt(intArrays[i][x]);
            }

        }
        //打印数组doubleArrays
        for(int i = 0; i < doubleArrays.length;i++){
            for(int j = 0;j < doubleArrays[i].length;j++){
                System.out.printf("[%d][%d] = %f",i,j,doubleArrays[i][j]);
            }
            System.out.println();
        }
    }


}
