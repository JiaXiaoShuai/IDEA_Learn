package com.jc.exer.exer3;

/*
案例：编写龟兔赛跑多线程程序，设赛跑长度为30米 ==>从1循环到30
兔子的速度是10米每秒（跑1米100毫秒sleep(100)），兔子每跑完10米休眠的时间10秒
乌龟的速度是1米每秒（跑1米1秒sleep(100)），乌龟每跑完10米的休眠时间是1秒
要求：要等兔子和乌龟的线程结束，主线程（裁判）才能公布最后的结果。
提示：System.currentTimeMillis()方法可以返回当前时间的毫秒值(long类型)
 */
public class Exercise3 {
    public static void main(String[] args) {
        Gui g = new Gui("乌龟");
        g.start();

        Tu t = new Tu("兔子");
        t.start();

        try {
            g.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(g.getTime() < t.getTime()){
            System.out.println("乌龟赢");
        }else if(g.getTime() > t.getTime()){
            System.out.println("兔子赢");
        }else{
            System.out.println("平局");
        }
    }
}
