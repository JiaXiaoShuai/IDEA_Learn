package com.jc.exer.exer4;

/*
案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
兔子的速度是10米每秒，兔子每跑完10米休眠的时间10秒
乌龟的速度是1米每秒，乌龟每跑完10米的休眠时间是1秒
要求：只要兔子和乌龟中有人到达终点，就宣布比赛结束，没到达终点的选手也要停下来。
 */
public class Exercise4 {
    public static void main(String[] args) {
        Sporter gui = new Sporter("乌龟",1000,1000);
        Sporter tu = new Sporter("兔子",100,10000);
        gui.start();
        tu.start();

        try {
            gui.join();//这里阻塞的是main线程，和tu（兔子）线程无关。
            /*
            gui.join();这句代码是 main线程执行的，哪个线程执行，哪个线程就被gui线程给阻塞了。
            此时gui和tu线程是并列的关系，还在竞争CPU资源，继续运行。
            （1）情况一
            如果此时tu（兔子）线程先结束了，main线程还要等gui它，结束才能执行下面的代码。等待gui线程结束，main才往下走。
            tu.join(); 因为tu已经结束了，相当于就无法阻塞main线程了，就继续往下走。
            （2）情况二
            如果此时gui（乌龟）线程先结束了，main线程继续往下走，
            tu.join();这句话，因为此时tu没结束，那么main就会被tu加塞了，等到tu线程结束，main才往下走。

           （3）结论
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            tu.join();//这里阻塞的是main线程，和gui（乌龟）线程无关。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //*****（3）结论上面两个线程都结束才会执行下面的代码
        if(tu.getDistance() > gui.getDistance()){
            System.out.println("兔子赢");
        }else if(tu.getDistance() < gui.getDistance()){
            System.out.println("乌龟赢");
        }else{
//            System.out.println("平局");
//            在严格一点，如果都到达终点，看时间
            if(gui.getTime() < tu.getTime()){
                System.out.println("乌龟赢");
            }else if(gui.getTime() > tu.getTime()){
                System.out.println("兔子赢");
            }else{
                System.out.println("平局");
            }
        }
    }
}
