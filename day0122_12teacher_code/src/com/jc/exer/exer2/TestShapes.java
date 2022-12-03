package com.jc.exer.exer2;
/*
（5）在测试类中，
- 创建两个矩形r1（2,3）,r2（3,6），创建2个三角形t1(3,4,5）,t2（6,6,6)，
- 调用compare方法比较r1和t1，
- 调用equals方法比较r2和t2，
- 创建Shape数组中，把上面4个对象放到数组中，调用就sort方法排序，在排序前后调用print方法遍历显示信息
 */
public class TestShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(3,6);

        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(6,6,6);

        System.out.println("r1和t1的面积比较:"+ ShapeTools.compare(r1,t1));
        System.out.println("r2和t2的面积比较:"+ShapeTools.compare(r2,t2));

        int result1 = ShapeTools.compare(r1, t1);
        if(result1 == 0){
            System.out.println("r1和t1的面积相等");
        }else if(result1 > 0){
            System.out.println("r1的面积大于t1的面积");
        }else{
            System.out.println("r1的面积小于t1的面积");
        }

        int result2 = ShapeTools.compare(r2, t2);
        if(result2 == 0){
            System.out.println("r2和t2的面积相等");
        }else if(result2 > 0){
            System.out.println("r2的面积大于t2的面积");
        }else{
            System.out.println("r2的面积小于t2的面积");
        }

        System.out.println("r2和t2是否面积和周长都相等呢？" + ShapeTools.equals(r2,t2));

        //创建Shape数组中，把上面4个对象放到数组中，调用就sort方法排序，在排序前后调用print方法遍历显示信息
        Shape[] arr = {r1,r2,t1,t2};//静态初始化
        ShapeTools.print(arr);//遍历数组
        //给数组排序
        ShapeTools.sort(arr);
        //再次遍历数组
        System.out.println("排序后：");
        ShapeTools.print(arr);
    }
}
