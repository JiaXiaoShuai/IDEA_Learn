package com.jc.exer.exer3;

public class Exercise3 {
    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.start();
        Tu tu = new Tu();
        tu.start();

        try {
            tu.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            gui.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        if(tu.getTime() < gui.getTime()){
            System.out.println("兔子胜利！");
        }else if(tu.getTime() > gui.getTime()){
            System.out.println("乌龟赢了！");
        }else{
            System.out.println("平局！");
        }
    }
}
