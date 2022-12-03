package com.jc.SXT.Demo2.oop1;

/**
 * 构造器
 * 定义一个点（Point）类用来表示二维空间中的点（有两个坐标）。要求如下：
 * 1.可以生成具有特定坐标点的对象
 * 2.提供可以计算该“点”距另外一点距离的方法
 */
public class Point {
    double x,y;

    Point(){}

    Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * 传入两个对象
     * @param p 终点坐标
     * @param t 起点坐标
     * @return 返回两坐标的距离
     */
    public double getDistance(Point p,Point t){
        return Math.sqrt((p.x-t.x)*(p.x-t.x)+(p.y-t.y)*(p.y-t.y));
    }

    /**
     * 传入一个对象
     * @param t 起点坐标
     * @return 返回两坐标的距离
     */
    public double getDistance(Point t){
        return Math.sqrt((x-t.x)*(x-t.x)+(y-t.y)*(this.y-t.y));
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0,4.0);
        Point origin = new Point(2.0,3.0);
        System.out.println(p1.getDistance(p1,origin));
        System.out.println(p1.getDistance(origin));
    }
}
