package com.jc.SXT.Demo2.methodDemo;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("Test02启动");
        System.out.println(Test01.getSum(45, 78));//调用Test01的方法
    }

    //九九乘法表

    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println("");
        }
    }

    //阶乘
    public static void printFactorial(int a) {
        if (a > 0) {
            int k = 1;
            for (int i = 1; i <= a; i++) {
                k = k * i;
            }
            System.out.println(k);
        } else if (a == 0) {
            System.out.println(0);
        } else {
            System.out.println("输入有误");
        }
    }


    //返回a的b次方
    public static int getPower(int a, int b) {
        int k = 1;
        for (int i = 0; i < b; i++) {
            k *= a;
        }
        return k;
    }

    /**
     * @param a 浮点类型小数
     * @return i 保留两位的浮点类型的小数
     */
    public static float getFloat(float a) {
        a = a * 100;
        a += 0.5;
        int i = (int) a;
        return i / 100.00f;
    }

    /**
     *
     * @param arr int类型数组
     * @return k 返回数组的和
     */
    public static int getArraySum(int[] arr) {
        int k = 0;
        for (int x : arr) {
            k += x;
        }
        return k;
    }
}
