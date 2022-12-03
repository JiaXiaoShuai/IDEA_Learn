package com.jc.review;

public class TestReview {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
//        Object[] arr = nums;//错误

        int[][] two = {{1,2,3,3,4},{4,5,56,6},{5,6,6,6}};
        Object[] arr = two;//可以  因为二维数组可以看成元素是int[]的一维数组

//        double[] d = nums;

        System.out.println("Aa".hashCode());
    }
}
