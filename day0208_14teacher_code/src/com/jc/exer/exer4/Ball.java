package com.jc.exer.exer4;

public class Ball implements Bounceable {
    private String name;

    public Ball(String name){
        this.name = name;
    }

    @Override
    public void play() {
        Bounceable ball = new Ball("FootBall");
        System.out.println(ball);
    }
}

interface Playable{
    void play();
}

interface Bounceable{
    void play();
}

interface Rollable extends Playable,Bounceable{
    Ball ball = new Ball("pingping");
}

